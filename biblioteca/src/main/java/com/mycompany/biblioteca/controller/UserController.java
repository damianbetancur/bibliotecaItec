package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.model.Biblioteca;
import com.mycompany.biblioteca.model.Rol;
import com.mycompany.biblioteca.model.User;


public class UserController {
    private User userSelected;

    private Biblioteca biblioteca;
    

    public UserController() {        
        load();
    }

    private void load(){
        biblioteca = new Biblioteca("Biblioteca del pueblo","calle falsa 123");
        
        Rol rol1 =new Rol("bibliotecario");
        
        User u1 = new User("admin", "admin", rol1, biblioteca);
        User u2 = new User("user1", "user1", rol1, biblioteca);
        User u3 = new User("user2", "user2", rol1, biblioteca);
        User u4 = new User("user3", "user3", rol1, biblioteca);
        User u5 = new User("user4", "user4", rol1, biblioteca);

        this.biblioteca.getUsers().add(u1);
        this.biblioteca.getUsers().add(u2);
        this.biblioteca.getUsers().add(u3);
        this.biblioteca.getUsers().add(u4);
        this.biblioteca.getUsers().add(u5);

        for (User u: this.biblioteca.getUsers()) {
            System.out.println(u.getUserName()+" "+ u.getPassword());
        }

    }

    public User login(User userAux){
        User userEncontrado = null;
        for (User ur: this.biblioteca.getUsers()) {
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
