package com.mycompany.biblioteca.controller;


import com.mycompany.biblioteca.model.User;
import com.mycompany.biblioteca.service.UserService;


public class UserController {
    private User userSelected;

    private UserService service;
    

    public UserController() {        
        this.service = new UserService();
    }


    public User login(User userAux){
        User userEncontrado = null;
        for (User ur: this.service.getUsers()) {
            if (ur.getNickname().equals(userAux.getNickname())){
                if (ur.getPassword().equals(userAux.getPassword())){
                    userEncontrado = ur;
                }else{
                    System.out.println("la contraseña es invalida");
                }
            }else{
                System.out.println("el usuario no existe");
            }
        }

        return userEncontrado;
    }

    public User getUserSelected() {
        return userSelected;
    }

    public void setUserSelected(User userSelected) {
        this.userSelected = userSelected;
    }
    
    
}
