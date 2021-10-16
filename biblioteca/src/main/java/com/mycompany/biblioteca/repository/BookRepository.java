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
import com.mycompany.biblioteca.model.Genre;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.biblioteca.model.Author;
import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.repository.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ariel
 */
public class BookRepository implements Serializable {

    public BookRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Book book) {
        if (book.getGenres() == null) {
            book.setGenres(new ArrayList<Genre>());
        }
        if (book.getAuthors() == null) {
            book.setAuthors(new ArrayList<Author>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Genre> attachedGenres = new ArrayList<Genre>();
            for (Genre genresGenreToAttach : book.getGenres()) {
                genresGenreToAttach = em.getReference(genresGenreToAttach.getClass(), genresGenreToAttach.getId());
                attachedGenres.add(genresGenreToAttach);
            }
            book.setGenres(attachedGenres);
            List<Author> attachedAuthors = new ArrayList<Author>();
            for (Author authorsAuthorToAttach : book.getAuthors()) {
                authorsAuthorToAttach = em.getReference(authorsAuthorToAttach.getClass(), authorsAuthorToAttach.getId());
                attachedAuthors.add(authorsAuthorToAttach);
            }
            book.setAuthors(attachedAuthors);
            em.persist(book);
            for (Genre genresGenre : book.getGenres()) {
                genresGenre.getBooks().add(book);
                genresGenre = em.merge(genresGenre);
            }
            for (Author authorsAuthor : book.getAuthors()) {
                authorsAuthor.getBooks().add(book);
                authorsAuthor = em.merge(authorsAuthor);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Book book) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Book persistentBook = em.find(Book.class, book.getId());
            List<Genre> genresOld = persistentBook.getGenres();
            List<Genre> genresNew = book.getGenres();
            List<Author> authorsOld = persistentBook.getAuthors();
            List<Author> authorsNew = book.getAuthors();
            List<Genre> attachedGenresNew = new ArrayList<Genre>();
            for (Genre genresNewGenreToAttach : genresNew) {
                genresNewGenreToAttach = em.getReference(genresNewGenreToAttach.getClass(), genresNewGenreToAttach.getId());
                attachedGenresNew.add(genresNewGenreToAttach);
            }
            genresNew = attachedGenresNew;
            book.setGenres(genresNew);
            List<Author> attachedAuthorsNew = new ArrayList<Author>();
            for (Author authorsNewAuthorToAttach : authorsNew) {
                authorsNewAuthorToAttach = em.getReference(authorsNewAuthorToAttach.getClass(), authorsNewAuthorToAttach.getId());
                attachedAuthorsNew.add(authorsNewAuthorToAttach);
            }
            authorsNew = attachedAuthorsNew;
            book.setAuthors(authorsNew);
            book = em.merge(book);
            for (Genre genresOldGenre : genresOld) {
                if (!genresNew.contains(genresOldGenre)) {
                    genresOldGenre.getBooks().remove(book);
                    genresOldGenre = em.merge(genresOldGenre);
                }
            }
            for (Genre genresNewGenre : genresNew) {
                if (!genresOld.contains(genresNewGenre)) {
                    genresNewGenre.getBooks().add(book);
                    genresNewGenre = em.merge(genresNewGenre);
                }
            }
            for (Author authorsOldAuthor : authorsOld) {
                if (!authorsNew.contains(authorsOldAuthor)) {
                    authorsOldAuthor.getBooks().remove(book);
                    authorsOldAuthor = em.merge(authorsOldAuthor);
                }
            }
            for (Author authorsNewAuthor : authorsNew) {
                if (!authorsOld.contains(authorsNewAuthor)) {
                    authorsNewAuthor.getBooks().add(book);
                    authorsNewAuthor = em.merge(authorsNewAuthor);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = book.getId();
                if (findBook(id) == null) {
                    throw new NonexistentEntityException("The book with id " + id + " no longer exists.");
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
            Book book;
            try {
                book = em.getReference(Book.class, id);
                book.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The book with id " + id + " no longer exists.", enfe);
            }
            List<Genre> genres = book.getGenres();
            for (Genre genresGenre : genres) {
                genresGenre.getBooks().remove(book);
                genresGenre = em.merge(genresGenre);
            }
            List<Author> authors = book.getAuthors();
            for (Author authorsAuthor : authors) {
                authorsAuthor.getBooks().remove(book);
                authorsAuthor = em.merge(authorsAuthor);
            }
            em.remove(book);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Book> findBookEntities() {
        return findBookEntities(true, -1, -1);
    }

    public List<Book> findBookEntities(int maxResults, int firstResult) {
        return findBookEntities(false, maxResults, firstResult);
    }

    private List<Book> findBookEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Book.class));
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

    public Book findBook(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Book.class, id);
        } finally {
            em.close();
        }
    }

    public int getBookCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Book> rt = cq.from(Book.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
