/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.Biblioteca;
import com.mycompany.biblioteca.model.Prestamo;
import com.mycompany.biblioteca.model.Socio;
import com.mycompany.biblioteca.service.SocioService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class ProcesarPrestamoController {
    private Prestamo nuevoPrestamo;
    
    private SocioService service;

    public ProcesarPrestamoController() {
        this.nuevoPrestamo = new Prestamo();
        this.service = new SocioService();
    }

    public List<Socio> buscarSocio(String numeroSocio){
        return this.service.buscarSocioPorNumeroDeSocio(numeroSocio);
    }

    public Prestamo getNuevoPrestamo() {
        return nuevoPrestamo;
    }
    
    
}
