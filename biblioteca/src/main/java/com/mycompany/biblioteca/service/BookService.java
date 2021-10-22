package com.mycompany.biblioteca.service;

import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.repository.BookRepository;
import com.mycompany.biblioteca.repository.Conexion;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    private BookRepository repository;

    public BookService() {
        this.repository = new BookRepository(Conexion.getEmf());
    }

    public List<Book> findByTittle(String tittle){
        List<Book> booksfound = new ArrayList<>();

        for (Book bookSearch : repository.findBookEntities()) {
            if (bookSearch.getName().contains(tittle)) {
                booksfound.add(bookSearch);
            }
        }
        return booksfound;
    }
}
