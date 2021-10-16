/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.repository;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.Genre;
import com.mycompany.biblioteca.repository.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ariel
 */
public class GenreRepository implements Serializable {

    public GenreRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Genre genre) {
        if (genre.getBooks() == null) {
            genre.setBooks(new ArrayList<Book>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Book> attachedBooks = new ArrayList<Book>();
            for (Book booksBookToAttach : genre.getBooks()) {
                booksBookToAttach = em.getReference(booksBookToAttach.getClass(), booksBookToAttach.getId());
                attachedBooks.add(booksBookToAttach);
            }
            genre.setBooks(attachedBooks);
            em.persist(genre);
            for (Book booksBook : genre.getBooks()) {
                booksBook.getGenres().add(genre);
                booksBook = em.merge(booksBook);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Genre genre) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Genre persistentGenre = em.find(Genre.class, genre.getId());
            List<Book> booksOld = persistentGenre.getBooks();
            List<Book> booksNew = genre.getBooks();
            List<Book> attachedBooksNew = new ArrayList<Book>();
            for (Book booksNewBookToAttach : booksNew) {
                booksNewBookToAttach = em.getReference(booksNewBookToAttach.getClass(), booksNewBookToAttach.getId());
                attachedBooksNew.add(booksNewBookToAttach);
            }
            booksNew = attachedBooksNew;
            genre.setBooks(booksNew);
            genre = em.merge(genre);
            for (Book booksOldBook : booksOld) {
                if (!booksNew.contains(booksOldBook)) {
                    booksOldBook.getGenres().remove(genre);
                    booksOldBook = em.merge(booksOldBook);
                }
            }
            for (Book booksNewBook : booksNew) {
                if (!booksOld.contains(booksNewBook)) {
                    booksNewBook.getGenres().add(genre);
                    booksNewBook = em.merge(booksNewBook);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = genre.getId();
                if (findGenre(id) == null) {
                    throw new NonexistentEntityException("The genre with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Genre genre;
            try {
                genre = em.getReference(Genre.class, id);
                genre.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The genre with id " + id + " no longer exists.", enfe);
            }
            List<Book> books = genre.getBooks();
            for (Book booksBook : books) {
                booksBook.getGenres().remove(genre);
                booksBook = em.merge(booksBook);
            }
            em.remove(genre);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Genre> findGenreEntities() {
        return findGenreEntities(true, -1, -1);
    }

    public List<Genre> findGenreEntities(int maxResults, int firstResult) {
        return findGenreEntities(false, maxResults, firstResult);
    }

    private List<Genre> findGenreEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Genre.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Genre findGenre(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Genre.class, id);
        } finally {
            em.close();
        }
    }

    public int getGenreCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Genre> rt = cq.from(Genre.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
