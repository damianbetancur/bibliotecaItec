/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;


import com.mycompany.biblioteca.model.Loan;
import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.service.PartnerService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ariel
 */
public class LoanController {
    private Loan newLoan;
    
    private PartnerService service;

    public LoanController() {
        this.newLoan = new Loan();
        this.service = new PartnerService();
    }

    public List<Partner> findPartner(String partnerNumber){
        return this.service.findByPartnerNumber(partnerNumber);
    }

    public Loan getNewLoan() {
        return newLoan;
    }

    
}
