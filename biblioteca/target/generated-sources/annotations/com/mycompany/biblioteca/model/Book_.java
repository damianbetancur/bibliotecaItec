package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Author;
import com.mycompany.biblioteca.model.Genre;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-15T21:22:15")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile ListAttribute<Book, Genre> genres;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile SingularAttribute<Book, String> name;
    public static volatile SingularAttribute<Book, Long> id;
    public static volatile ListAttribute<Book, Author> authors;

}