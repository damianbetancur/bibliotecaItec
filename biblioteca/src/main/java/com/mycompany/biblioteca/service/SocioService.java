package com.mycompany.biblioteca.service;

import com.mycompany.biblioteca.model.Socio;
import com.mycompany.biblioteca.repository.SocioRepository;

import java.util.ArrayList;
import java.util.List;

public class SocioService {
    private SocioRepository repository;

    public SocioService() {
        this.repository = new SocioRepository();
    }

    public List<Socio> buscarSocioPorNumeroDeSocio(String numeroSocio){
        List<Socio> sociosEncontrados = new ArrayList<>();

        for (Socio socioR : repository.findAllSocio()) {
            if (socioR.getNumeroSocio().contains(numeroSocio)) {
                sociosEncontrados.add(socioR);
            }
        }
        return sociosEncontrados;
    }
}
