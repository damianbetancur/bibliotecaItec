package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    User userSelected;

    List <User> users;

    public UserController() {
        this.users = new ArrayList<>();
        load();
    }

    private void load(){
        User u1 = new User("admin", "admin");
        User u2 = new User("user1", "user1");
        User u3 = new User("user2", "user2");
        User u4 = new User("user3", "user3");
        User u5 = new User("user4", "user4");

        this.users.add(u1);
        this.users.add(u2);
        this.users.add(u3);
        this.users.add(u4);
        this.users.add(u5);

        for (User u: this.users) {
            System.out.println(u.getUserName()+" "+ u.getPassword());
        }

    }

    public User login(User userAux){
        User userEncontrado = null;
        for (User ur: this.users) {
            if (ur.getUserName().equals(userAux.getUserName())){
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
