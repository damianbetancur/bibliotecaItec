package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.Library;
import com.mycompany.biblioteca.model.LoanStatus;
import com.mycompany.biblioteca.model.Partner;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-15T21:22:15")
@StaticMetamodel(Loan.class)
public class Loan_ { 

    public static volatile SingularAttribute<Loan, Date> finalDate;
    public static volatile SingularAttribute<Loan, Partner> partner;
    public static volatile SingularAttribute<Loan, Library> LoanLibrary;
    public static volatile SingularAttribute<Loan, Book> book;
    public static volatile SingularAttribute<Loan, LoanStatus> loanStatus;
    public static volatile SingularAttribute<Loan, Long> id;
    public static volatile SingularAttribute<Loan, Date> initialDate;

}