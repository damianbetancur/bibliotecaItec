package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-11-20T00:27:37")
@StaticMetamodel(BookStock.class)
public class BookStock_ { 

    public static volatile SingularAttribute<BookStock, Integer> quantity;
    public static volatile SingularAttribute<BookStock, Book> book;
    public static volatile SingularAttribute<BookStock, Long> id;

}