package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-28T19:50:34")
@StaticMetamodel(BookStock.class)
public class BookStock_ { 

    public static volatile SingularAttribute<BookStock, Integer> quantity;
    public static volatile SingularAttribute<BookStock, Book> book;
    public static volatile SingularAttribute<BookStock, Long> id;

}