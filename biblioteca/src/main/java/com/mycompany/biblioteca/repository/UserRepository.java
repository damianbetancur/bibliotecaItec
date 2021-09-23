package com.mycompany.biblioteca.repository;

import com.mycompany.biblioteca.model.Biblioteca;
import com.mycompany.biblioteca.model.Rol;
import com.mycompany.biblioteca.model.User;

import java.util.List;

public class UserRepository {
    public List<User> getUsers(){
        Biblioteca biblioteca = new Biblioteca("Biblioteca del pueblo","calle falsa 123");

        Rol rol1 =new Rol("bibliotecario");

        User u1 = new User("admin", "admin", rol1, biblioteca);
        User u2 = new User("user1", "user1", rol1, biblioteca);
        User u3 = new User("user2", "user2", rol1, biblioteca);
        User u4 = new User("user3", "user3", rol1, biblioteca);
        User u5 = new User("user4", "user4", rol1, biblioteca);

        biblioteca.getUsers().add(u1);
        biblioteca.getUsers().add(u2);
        biblioteca.getUsers().add(u3);
        biblioteca.getUsers().add(u4);
        biblioteca.getUsers().add(u5);

        return biblioteca.getUsers();
    }
}
