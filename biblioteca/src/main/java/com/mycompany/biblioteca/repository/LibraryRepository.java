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
import com.mycompany.biblioteca.model.User;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.model.Loan;
import com.mycompany.biblioteca.model.BookStock;
import com.mycompany.biblioteca.model.Library;
import com.mycompany.biblioteca.repository.exceptions.NonexistentEntityException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Ariel
 */
public class LibraryRepository implements Serializable {

    public LibraryRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Library library) {
        if (library.getUsers() == null) {
            library.setUsers(new ArrayList<User>());
        }
        if (library.getPartners() == null) {
            library.setPartners(new ArrayList<Partner>());
        }
        if (library.getLoans() == null) {
            library.setLoans(new ArrayList<Loan>());
        }
        if (library.getBookStocks() == null) {
            library.setBookStocks(new ArrayList<BookStock>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<User> attachedUsers = new ArrayList<User>();
            for (User usersUserToAttach : library.getUsers()) {
                usersUserToAttach = em.getReference(usersUserToAttach.getClass(), usersUserToAttach.getId());
                attachedUsers.add(usersUserToAttach);
            }
            library.setUsers(attachedUsers);
            List<Partner> attachedPartners = new ArrayList<Partner>();
            for (Partner partnersPartnerToAttach : library.getPartners()) {
                partnersPartnerToAttach = em.getReference(partnersPartnerToAttach.getClass(), partnersPartnerToAttach.getId());
                attachedPartners.add(partnersPartnerToAttach);
            }
            library.setPartners(attachedPartners);
            List<Loan> attachedLoans = new ArrayList<Loan>();
            for (Loan loansLoanToAttach : library.getLoans()) {
                loansLoanToAttach = em.getReference(loansLoanToAttach.getClass(), loansLoanToAttach.getId());
                attachedLoans.add(loansLoanToAttach);
            }
            library.setLoans(attachedLoans);
            List<BookStock> attachedBookStocks = new ArrayList<BookStock>();
            for (BookStock bookStocksBookStockToAttach : library.getBookStocks()) {
                bookStocksBookStockToAttach = em.getReference(bookStocksBookStockToAttach.getClass(), bookStocksBookStockToAttach.getId());
                attachedBookStocks.add(bookStocksBookStockToAttach);
            }
            library.setBookStocks(attachedBookStocks);
            em.persist(library);
            for (User usersUser : library.getUsers()) {
                usersUser.setUserLibrary(library);
                usersUser = em.merge(usersUser);
            }
            for (Partner partnersPartner : library.getPartners()) {
                partnersPartner.setPartnerLibrary(library);
                partnersPartner = em.merge(partnersPartner);
            }
            for (Loan loansLoan : library.getLoans()) {
                loansLoan.setLoanLibrary(library);
                loansLoan = em.merge(loansLoan);
            }
            for (BookStock bookStocksBookStock : library.getBookStocks()) {
                bookStocksBookStock.setBookStockLibrary(library);
                bookStocksBookStock = em.merge(bookStocksBookStock);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Library library) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Library persistentLibrary = em.find(Library.class, library.getId());
            List<User> usersOld = persistentLibrary.getUsers();
            List<User> usersNew = library.getUsers();
            List<Partner> partnersOld = persistentLibrary.getPartners();
            List<Partner> partnersNew = library.getPartners();
            List<Loan> loansOld = persistentLibrary.getLoans();
            List<Loan> loansNew = library.getLoans();
            List<BookStock> bookStocksOld = persistentLibrary.getBookStocks();
            List<BookStock> bookStocksNew = library.getBookStocks();
            List<User> attachedUsersNew = new ArrayList<User>();
            for (User usersNewUserToAttach : usersNew) {
                usersNewUserToAttach = em.getReference(usersNewUserToAttach.getClass(), usersNewUserToAttach.getId());
                attachedUsersNew.add(usersNewUserToAttach);
            }
            usersNew = attachedUsersNew;
            library.setUsers(usersNew);
            List<Partner> attachedPartnersNew = new ArrayList<Partner>();
            for (Partner partnersNewPartnerToAttach : partnersNew) {
                partnersNewPartnerToAttach = em.getReference(partnersNewPartnerToAttach.getClass(), partnersNewPartnerToAttach.getId());
                attachedPartnersNew.add(partnersNewPartnerToAttach);
            }
            partnersNew = attachedPartnersNew;
            library.setPartners(partnersNew);
            List<Loan> attachedLoansNew = new ArrayList<Loan>();
            for (Loan loansNewLoanToAttach : loansNew) {
                loansNewLoanToAttach = em.getReference(loansNewLoanToAttach.getClass(), loansNewLoanToAttach.getId());
                attachedLoansNew.add(loansNewLoanToAttach);
            }
            loansNew = attachedLoansNew;
            library.setLoans(loansNew);
            List<BookStock> attachedBookStocksNew = new ArrayList<BookStock>();
            for (BookStock bookStocksNewBookStockToAttach : bookStocksNew) {
                bookStocksNewBookStockToAttach = em.getReference(bookStocksNewBookStockToAttach.getClass(), bookStocksNewBookStockToAttach.getId());
                attachedBookStocksNew.add(bookStocksNewBookStockToAttach);
            }
            bookStocksNew = attachedBookStocksNew;
            library.setBookStocks(bookStocksNew);
            library = em.merge(library);
            for (User usersOldUser : usersOld) {
                if (!usersNew.contains(usersOldUser)) {
                    usersOldUser.setUserLibrary(library);
                    usersOldUser = em.merge(usersOldUser);
                }
            }
            for (User usersNewUser : usersNew) {
                if (!usersOld.contains(usersNewUser)) {
                    usersNewUser.setUserLibrary(library);
                    usersNewUser = em.merge(usersNewUser);
                }
            }
            for (Partner partnersOldPartner : partnersOld) {
                if (!partnersNew.contains(partnersOldPartner)) {
                    partnersOldPartner.setPartnerLibrary(library);
                    partnersOldPartner = em.merge(partnersOldPartner);
                }
            }
            for (Partner partnersNewPartner : partnersNew) {
                if (!partnersOld.contains(partnersNewPartner)) {
                    partnersNewPartner.setPartnerLibrary(library);
                    partnersNewPartner = em.merge(partnersNewPartner);
                }
            }
            for (Loan loansOldLoan : loansOld) {
                if (!loansNew.contains(loansOldLoan)) {
                    loansOldLoan.setLoanLibrary(library);
                    loansOldLoan = em.merge(loansOldLoan);
                }
            }
            for (Loan loansNewLoan : loansNew) {
                if (!loansOld.contains(loansNewLoan)) {
                    loansNewLoan.setLoanLibrary(library);
                    loansNewLoan = em.merge(loansNewLoan);
                }
            }
            for (BookStock bookStocksOldBookStock : bookStocksOld) {
                if (!bookStocksNew.contains(bookStocksOldBookStock)) {
                    bookStocksOldBookStock.setBookStockLibrary(library);
                    bookStocksOldBookStock = em.merge(bookStocksOldBookStock);
                }
            }
            for (BookStock bookStocksNewBookStock : bookStocksNew) {
                if (!bookStocksOld.contains(bookStocksNewBookStock)) {
                    bookStocksNewBookStock.setBookStockLibrary(library);
                    bookStocksNewBookStock = em.merge(bookStocksNewBookStock);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = library.getId();
                if (findLibrary(id) == null) {
                    throw new NonexistentEntityException("The library with id " + id + " no longer exists.");
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
            Library library;
            try {
                library = em.getReference(Library.class, id);
                library.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The library with id " + id + " no longer exists.", enfe);
            }
            List<User> users = library.getUsers();
            for (User usersUser : users) {
                usersUser.setUserLibrary(library);
                usersUser = em.merge(usersUser);
            }
            List<Partner> partners = library.getPartners();
            for (Partner partnersPartner : partners) {
                partnersPartner.setPartnerLibrary(library);
                partnersPartner = em.merge(partnersPartner);
            }
            List<Loan> loans = library.getLoans();
            for (Loan loansLoan : loans) {
                loansLoan.setLoanLibrary(library);
                loansLoan = em.merge(loansLoan);
            }
            List<BookStock> bookStocks = library.getBookStocks();
            for (BookStock bookStocksBookStock : bookStocks) {
                bookStocksBookStock.setBookStockLibrary(library);
                bookStocksBookStock = em.merge(bookStocksBookStock);
            }
            em.remove(library);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Library> findLibraryEntities() {
        return findLibraryEntities(true, -1, -1);
    }

    public List<Library> findLibraryEntities(int maxResults, int firstResult) {
        return findLibraryEntities(false, maxResults, firstResult);
    }

    private List<Library> findLibraryEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Library.class));
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

    public Library findLibrary(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Library.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibraryCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Library> rt = cq.from(Library.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
