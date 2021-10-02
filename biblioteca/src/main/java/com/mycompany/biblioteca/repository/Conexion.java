/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Ariel
 */
public class Conexion {

    private static EntityManagerFactory emf;
    private static EntityManager em;

    public Conexion() {
        Conexion.conectar();
    }

    private static void conectar() {
        if (em == null) {
            Conexion.emf = Persistence.createEntityManagerFactory("com.mycompany_biblioteca_jar_1.0-SNAPSHOTPU");
            Conexion.em = Conexion.emf.createEntityManager();
        }
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }

    public static void setEmf(EntityManagerFactory emf) {
        Conexion.emf = emf;
    }

    public static EntityManager getEm() {
        return em;
    }

    public static void setEm(EntityManager em) {
        Conexion.em = em;
    }      
}
