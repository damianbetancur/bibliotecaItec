/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Ariel
 */
public class Prestamo {
    private LocalDate InicioPrestamo;
    private LocalDate finPrestamo;
    
    private Biblioteca biblioteca;
    
    private User user;
    private Libro libro;
    private EstadoPrestamo estadoPrestamo;

    public Prestamo() {
    }

    public Prestamo(LocalDate finPrestamo, Biblioteca biblioteca, User user, Libro libro, EstadoPrestamo estadoPrestamo) {
        this.finPrestamo = finPrestamo;
        this.biblioteca = biblioteca;
        this.user = user;
        this.libro = libro;
        this.estadoPrestamo = estadoPrestamo;
    }

    public LocalDate getInicioPrestamo() {
        return InicioPrestamo;
    }

    public void setInicioPrestamo(LocalDate InicioPrestamo) {
        this.InicioPrestamo = InicioPrestamo;
    }

    public LocalDate getFinPrestamo() {
        return finPrestamo;
    }

    public void setFinPrestamo(LocalDate finPrestamo) {
        this.finPrestamo = finPrestamo;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public EstadoPrestamo getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(EstadoPrestamo estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
    
    
}
