package com.mycompany.biblioteca.repository;

import com.mycompany.biblioteca.model.Biblioteca;
import com.mycompany.biblioteca.model.Rol;
import com.mycompany.biblioteca.model.Socio;
import com.mycompany.biblioteca.model.User;

import java.util.List;

public class SocioRepository {

    public List<Socio> findAllSocio(){
        Biblioteca biblioteca = new Biblioteca("Biblioteca del pueblo","calle falsa 123");

        Socio s1 = new  Socio("001", "Belen", "Diaz", "38380791", biblioteca);
        Socio s2 = new  Socio("002", "Belen", "Diaz", "38380791", biblioteca);
        Socio s3 = new  Socio("003", "Belen", "Diaz", "38380791", biblioteca);
        Socio s4 = new  Socio("004", "Belen", "Diaz", "38380791", biblioteca);
        Socio s5 = new  Socio("005", "Belen", "Diaz", "38380791", biblioteca);
        Socio s6 = new  Socio("006", "Belen", "Diaz", "38380791", biblioteca);

        biblioteca.getSocios().add(s1);
        biblioteca.getSocios().add(s2);
        biblioteca.getSocios().add(s3);
        biblioteca.getSocios().add(s4);
        biblioteca.getSocios().add(s5);
        biblioteca.getSocios().add(s6);

        return biblioteca.getSocios();
    }

}
