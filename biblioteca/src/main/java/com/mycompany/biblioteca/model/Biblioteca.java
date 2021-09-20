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
public class Biblioteca {
    private String razonSocial;
    private String direccion;
    
    private List <Prestamo> prestamos;
    private List<Socio> socios;
    private List<StockLibro> stock;
    private List<User> users;

    public Biblioteca() {
        this.prestamos = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.stock = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Biblioteca(String razonSocial, String direccion) {
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
        this.socios = new ArrayList<>();
        this.stock = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    
    
    
    
    
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List <Prestamo> getPrestamos() {
        return prestamos;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<StockLibro> getStock() {
        return stock;
    }

    public List<User> getUsers() {
        return users;
    }
    
    
    
    
}
