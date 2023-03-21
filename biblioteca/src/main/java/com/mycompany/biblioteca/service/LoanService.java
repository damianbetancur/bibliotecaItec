/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca.service;

import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.Loan;
import com.mycompany.biblioteca.repository.BookRepository;
import com.mycompany.biblioteca.repository.Conexion;
import com.mycompany.biblioteca.repository.LoanRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nadia
 */
public class LoanService {
    private LoanRepository repository;

    public LoanService() {
        this.repository = new LoanRepository(Conexion.getEmf());
    }

    public void save (Loan loan){
        this.repository.create(loan);
    }
}
