package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Book;
import com.mycompany.biblioteca.model.LoanStatus;
import com.mycompany.biblioteca.model.Partner;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-11-20T00:27:37")
@StaticMetamodel(Loan.class)
public class Loan_ { 

    public static volatile SingularAttribute<Loan, LocalDate> finalDate;
    public static volatile SingularAttribute<Loan, Partner> partner;
    public static volatile SingularAttribute<Loan, Book> book;
    public static volatile SingularAttribute<Loan, LoanStatus> loanStatus;
    public static volatile SingularAttribute<Loan, Long> id;
    public static volatile SingularAttribute<Loan, LocalDate> initialDate;

}