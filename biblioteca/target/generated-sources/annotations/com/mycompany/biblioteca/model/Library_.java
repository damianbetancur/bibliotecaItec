package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.BookStock;
import com.mycompany.biblioteca.model.Loan;
import com.mycompany.biblioteca.model.Partner;
import com.mycompany.biblioteca.model.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-15T21:22:15")
@StaticMetamodel(Library.class)
public class Library_ { 

    public static volatile SingularAttribute<Library, String> address;
    public static volatile ListAttribute<Library, Partner> partners;
    public static volatile ListAttribute<Library, Loan> loans;
    public static volatile SingularAttribute<Library, String> name;
    public static volatile ListAttribute<Library, BookStock> bookStocks;
    public static volatile SingularAttribute<Library, Long> id;
    public static volatile ListAttribute<Library, User> users;

}