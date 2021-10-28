package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Book;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-28T19:50:34")
@StaticMetamodel(Genre.class)
public class Genre_ { 

    public static volatile ListAttribute<Genre, Book> books;
    public static volatile SingularAttribute<Genre, String> description;
    public static volatile SingularAttribute<Genre, Long> id;

}