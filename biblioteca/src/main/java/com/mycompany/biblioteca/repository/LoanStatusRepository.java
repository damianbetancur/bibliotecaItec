/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.repository;

import com.mycompany.biblioteca.model.LoanStatus;
import com.mycompany.biblioteca.repository.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Ariel
 */
public class LoanStatusRepository implements Serializable {

    public LoanStatusRepository(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(LoanStatus loanStatus) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(loanStatus);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(LoanStatus loanStatus) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            loanStatus = em.merge(loanStatus);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = loanStatus.getId();
                if (findLoanStatus(id) == null) {
                    throw new NonexistentEntityException("The loanStatus with id " + id + " no longer exists.");
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
            LoanStatus loanStatus;
            try {
                loanStatus = em.getReference(LoanStatus.class, id);
                loanStatus.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The loanStatus with id " + id + " no longer exists.", enfe);
            }
            em.remove(loanStatus);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<LoanStatus> findLoanStatusEntities() {
        return findLoanStatusEntities(true, -1, -1);
    }

    public List<LoanStatus> findLoanStatusEntities(int maxResults, int firstResult) {
        return findLoanStatusEntities(false, maxResults, firstResult);
    }

    private List<LoanStatus> findLoanStatusEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(LoanStatus.class));
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

    public LoanStatus findLoanStatus(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(LoanStatus.class, id);
        } finally {
            em.close();
        }
    }

    public int getLoanStatusCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<LoanStatus> rt = cq.from(LoanStatus.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
