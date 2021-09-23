package com.mycompany.biblioteca.service;

import com.mycompany.biblioteca.model.User;
import com.mycompany.biblioteca.repository.UserRepository;

import java.util.List;

public class UserService {
    UserRepository repository;

    public UserService() {
        this.repository = new UserRepository();
    }

    public List<User> getUsers(){
        return repository.getUsers();
    }
}
