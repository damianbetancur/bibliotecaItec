/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author ARIEL
 */
public class Socio {
    private String numeroSocio;
    private String nombre;
    private String apellido;
    private String dni;
    
    private Biblioteca biblioteca;

    public Socio() {
    }

    public Socio(String numeroSocio, String nombre, String apellido, String dni, Biblioteca biblioteca) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.biblioteca = biblioteca;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    
    
    
}
