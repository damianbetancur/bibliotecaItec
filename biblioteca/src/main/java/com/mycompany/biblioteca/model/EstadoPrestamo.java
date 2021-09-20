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
public class EstadoPrestamo {
    private String descripcion;

    public EstadoPrestamo(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoPrestamo() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
