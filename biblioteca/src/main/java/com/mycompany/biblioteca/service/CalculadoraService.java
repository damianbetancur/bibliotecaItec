package com.mycompany.biblioteca.service;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraService {

    private List<Integer> listaDeNumeros;

    public CalculadoraService() {
        listaDeNumeros = new ArrayList<>();
    }

    public Float sumar(Float numeroA, Float numeroB){
        return numeroA+numeroB;
    }

    public void agregar(Integer numero){
        listaDeNumeros.add(numero);
    }

    public List<Integer> getListaDeNumeros() {
        return listaDeNumeros;
    }
}
