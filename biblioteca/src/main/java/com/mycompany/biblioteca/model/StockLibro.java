/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Ariel
 */
public class StockLibro {
    private Integer cantidad;
    private Libro libro;
    
    private Biblioteca biblioteca;

    public StockLibro() {
    }

    public StockLibro(Integer cantidad, Libro libro, Biblioteca biblioteca) {
        this.cantidad = cantidad;
        this.libro = libro;
        this.biblioteca = biblioteca;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
    
    
    
}
