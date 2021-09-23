/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.view;

import com.mycompany.biblioteca.controller.ProcesarPrestamoController;
import com.mycompany.biblioteca.controller.UserController;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Belén
 */
public class JPanelMenu extends javax.swing.JPanel {

    UserController controlador;
    /**
     * Creates new form JPanelMenu
     */
    public JPanelMenu(UserController controladorP) {
        this.controlador = controladorP;
        initComponents();
        
        this.jlbl_userName.setText(this.controlador.getUserSelected().getUserName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_boton = new javax.swing.JPanel();
        jbtn_procesarPrestamo = new javax.swing.JButton();
        jbtn_procesar_devolucion = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel_contenido = new javax.swing.JPanel();
        jPanel_usuario = new javax.swing.JPanel();
        jlbl_userName = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1014, 650));
        setMinimumSize(new java.awt.Dimension(1014, 650));
        setPreferredSize(new java.awt.Dimension(1014, 650));
        setLayout(null);

        jPanel_boton.setBackground(new java.awt.Color(153, 255, 102));
        jPanel_boton.setMaximumSize(new java.awt.Dimension(200, 600));
        jPanel_boton.setMinimumSize(new java.awt.Dimension(200, 600));
        jPanel_boton.setPreferredSize(new java.awt.Dimension(200, 600));

        jbtn_procesarPrestamo.setText("Procesar Prestamo");
        jbtn_procesarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_procesarPrestamoActionPerformed(evt);
            }
        });

        jbtn_procesar_devolucion.setText("Procesar Devolucion");
        jbtn_procesar_devolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_procesar_devolucionActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        javax.swing.GroupLayout jPanel_botonLayout = new javax.swing.GroupLayout(jPanel_boton);
        jPanel_boton.setLayout(jPanel_botonLayout);
        jPanel_botonLayout.setHorizontalGroup(
            jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn_procesarPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_botonLayout.createSequentialGroup()
                        .addGroup(jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addComponent(jbtn_procesar_devolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_botonLayout.setVerticalGroup(
            jPanel_botonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_botonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtn_procesarPrestamo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtn_procesar_devolucion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addContainerGap(389, Short.MAX_VALUE))
        );

        add(jPanel_boton);
        jPanel_boton.setBounds(0, 0, 200, 600);

        jPanel_contenido.setBackground(new java.awt.Color(102, 153, 255));
        jPanel_contenido.setMaximumSize(new java.awt.Dimension(814, 600));
        jPanel_contenido.setMinimumSize(new java.awt.Dimension(814, 600));
        jPanel_contenido.setPreferredSize(new java.awt.Dimension(814, 600));

        javax.swing.GroupLayout jPanel_contenidoLayout = new javax.swing.GroupLayout(jPanel_contenido);
        jPanel_contenido.setLayout(jPanel_contenidoLayout);
        jPanel_contenidoLayout.setHorizontalGroup(
            jPanel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 814, Short.MAX_VALUE)
        );
        jPanel_contenidoLayout.setVerticalGroup(
            jPanel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(jPanel_contenido);
        jPanel_contenido.setBounds(206, 0, 814, 600);

        jPanel_usuario.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_usuario.setMaximumSize(new java.awt.Dimension(50, 1014));
        jPanel_usuario.setMinimumSize(new java.awt.Dimension(50, 1014));
        jPanel_usuario.setPreferredSize(new java.awt.Dimension(50, 1014));

        jlbl_userName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl_userName.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_userName.setText("jLabel1");

        javax.swing.GroupLayout jPanel_usuarioLayout = new javax.swing.GroupLayout(jPanel_usuario);
        jPanel_usuario.setLayout(jPanel_usuarioLayout);
        jPanel_usuarioLayout.setHorizontalGroup(
            jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_usuarioLayout.setVerticalGroup(
            jPanel_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbl_userName)
                .addContainerGap(986, Short.MAX_VALUE))
        );

        add(jPanel_usuario);
        jPanel_usuario.setBounds(0, 611, 1020, 1014);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_procesarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_procesarPrestamoActionPerformed
       
       //1-crear controlador
       ProcesarPrestamoController controlador = new ProcesarPrestamoController();


       //2- crear panel enchufando el controlador creado en paso 1
       JPanel_ProcesarPrestamo_paso1 panelPaso1 = new JPanel_ProcesarPrestamo_paso1(this, controlador);
       panelPaso1.setSize(814, 600);
       
       this.jPanel_contenido.removeAll();
       this.jPanel_contenido.add(panelPaso1);
       this.repaint();
       this.validate();
       
       bloquearBotones(false);
    }//GEN-LAST:event_jbtn_procesarPrestamoActionPerformed

    private void jbtn_procesar_devolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_procesar_devolucionActionPerformed
     JPanel_ProcesarDevolucion_paso1 panelDPaso1 = new JPanel_ProcesarDevolucion_paso1(this);
     panelDPaso1.setSize(814, 600);

     this.jPanel_contenido.removeAll();
     this.jPanel_contenido.add(panelDPaso1);
     this.repaint();
     this.validate();
     
     bloquearBotones(false);
    }//GEN-LAST:event_jbtn_procesar_devolucionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel_boton;
    private javax.swing.JPanel jPanel_contenido;
    private javax.swing.JPanel jPanel_usuario;
    private javax.swing.JButton jbtn_procesarPrestamo;
    private javax.swing.JButton jbtn_procesar_devolucion;
    private javax.swing.JLabel jlbl_userName;
    // End of variables declaration//GEN-END:variables

    public void bloquearBotones(boolean estado){
        this.jbtn_procesarPrestamo.setEnabled(estado);
        this.jbtn_procesar_devolucion.setEnabled(estado);
        this.jButton3.setEnabled(estado);
        this.jButton4.setEnabled(estado);
        this.jButton5.setEnabled(estado);
        this.jButton6.setEnabled(estado);        
    }
    
    public void limpiarPanelContenido(){
       this.jPanel_contenido.removeAll();
       this.repaint();
       this.validate();
    }

    public javax.swing.JPanel getjPanel_contenido() {
        return jPanel_contenido;
    }
    
    
}
