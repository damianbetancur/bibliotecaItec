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
public class Rol {
    private String descripcion;

    public Rol(String descripcion) {
        this.descripcion = descripcion;
    }

    public Rol() {
    }
        
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
