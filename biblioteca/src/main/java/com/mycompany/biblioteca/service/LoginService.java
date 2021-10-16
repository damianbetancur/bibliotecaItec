/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.service;

import com.mycompany.biblioteca.model.User;
import com.mycompany.biblioteca.repository.UserRepository;


/**
 *
 * @author Ariel
 */
public class LoginService {
    private UserRepository repository;
    
    public Boolean login(User user){    
        Boolean encontrado = false;        
        for (User userSearch : repository.findUserEntities()) {
            if (user.getNickname().equals(userSearch.getNickname())) {
                if (user.getPassword().equals(userSearch.getPassword())) {
                    encontrado = true;
                }
            }
        }        
        return encontrado;
    }
    
    
}
