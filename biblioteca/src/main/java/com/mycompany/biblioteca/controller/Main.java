/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.repository.Conexion;
import com.mycompany.biblioteca.view.JFrameLogin;


public class Main {
    
    public static void main(String[] args){
        new Conexion();
        JFrameLogin app= new JFrameLogin();
}
    }
