/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.Biblioteca;
import com.mycompany.biblioteca.model.Prestamo;
import com.mycompany.biblioteca.model.Socio;

/**
 *
 * @author Ariel
 */
public class ProcesarPrestamoController {
    private Prestamo nuevoPrestamo;
    
    private Biblioteca biblioteca;

    public ProcesarPrestamoController(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        this.nuevoPrestamo = new Prestamo();
    }
    
    
    
    
    public Socio buscarSocio(String numeroSocio){
        Socio socioEncontrado = null;
        for (Socio socioR : biblioteca.getSocios()) {
            if (socioR.getNumeroSocio().equals(numeroSocio)) {
                socioEncontrado=socioR;
            }
        }
        return socioEncontrado;
    }
}
