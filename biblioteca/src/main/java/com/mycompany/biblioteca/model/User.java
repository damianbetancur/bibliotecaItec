/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.model;

/**
 *
 * @author Belén
 */
public class User {

    private String userName;
    private String password;

    private Rol rol;

    private Biblioteca biblioteca;

    public User() {
    }

    public User(String userName, String password, Rol rol, Biblioteca biblioteca) {
        this.userName = userName;
        this.password = password;
        this.rol = rol;
        this.biblioteca = biblioteca;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

}
