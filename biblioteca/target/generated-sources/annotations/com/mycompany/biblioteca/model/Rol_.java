package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-28T19:50:34")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, String> description;
    public static volatile SingularAttribute<Rol, Long> id;
    public static volatile ListAttribute<Rol, User> users;

}