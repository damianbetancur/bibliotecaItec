package com.mycompany.biblioteca.model;

import com.mycompany.biblioteca.model.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-10-28T19:50:34")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile ListAttribute<User, Rol> rols;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> nickname;
    public static volatile SingularAttribute<User, Long> id;

}