/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;


import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.Loan;
import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.service.BookService;
import com.mycompany.biblioteca.service.PartnerService;

import java.util.List;

/**
 *
 * @author Ariel
 */
public class LoanController {
    private Loan newLoan;
    
    private final PartnerService partnerService;
    private final BookService bookService;

    public LoanController() {
        this.newLoan = new Loan();
        this.partnerService = new PartnerService();
        this.bookService = new BookService();
    }

    public List<Partner> findPartner(String partnerNumber){
        return this.partnerService.findByPartnerNumber(partnerNumber);
    }


    public List<Book> findBookByTittle(String tittle){
        return this.bookService.findByTittle(tittle);
    }

    public Loan getNewLoan() {
        return newLoan;
    }

    
}
