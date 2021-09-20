/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class Libro {
    private String isbn;
    private String nombre;
    
    private List <Genero> generos;
    private List <Autor> autores;

    public Libro() {
        this.generos = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public Libro(String isbn, String nombre) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.generos = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List <Genero> getGeneros() {
        return generos;
    }

    public List <Autor> getAutores() {
        return autores;
    }
    
    
}
