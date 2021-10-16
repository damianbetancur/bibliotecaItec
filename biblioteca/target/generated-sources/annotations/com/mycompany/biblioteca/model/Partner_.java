package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Library;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-15T21:22:15")
@StaticMetamodel(Partner.class)
public class Partner_ { 

    public static volatile SingularAttribute<Partner, String> firstName;
    public static volatile SingularAttribute<Partner, String> lastName;
    public static volatile SingularAttribute<Partner, String> partnerNumber;
    public static volatile SingularAttribute<Partner, Library> PartnerLibrary;
    public static volatile SingularAttribute<Partner, Long> id;
    public static volatile SingularAttribute<Partner, String> dni;

}