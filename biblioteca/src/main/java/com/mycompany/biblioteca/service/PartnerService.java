package com.mycompany.biblioteca.service;


import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.repository.Conexion;
import com.mycompany.biblioteca.repository.PartnerRepository;


import java.util.ArrayList;
import java.util.List;

public class PartnerService {
    private PartnerRepository repository;

    public PartnerService() {
        this.repository = new PartnerRepository(Conexion.getEmf());
    }

    public List<Partner> findByPartnerNumber(String partnerNumber){
        List<Partner> partnersfound = new ArrayList<>();

        for (Partner partnerSearch : repository.findPartnerEntities()) {
            if (partnerSearch.getPartnerNumber().contains(partnerNumber)) {
                partnersfound.add(partnerSearch);
            }
        }
        return partnersfound;
    }
}
