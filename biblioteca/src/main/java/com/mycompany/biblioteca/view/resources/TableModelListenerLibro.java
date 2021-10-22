package com.mycompany.biblioteca.view.resources;

import com.mycompany.biblioteca.view.JPanel_ProcesarPrestamo_paso2;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableModelListenerLibro implements ListSelectionListener {

    private final JPanel_ProcesarPrestamo_paso2 jPanelProcesarPrestamoPaso2;

    public TableModelListenerLibro(JPanel_ProcesarPrestamo_paso2 pantallaContenido) {
        this.jPanelProcesarPrestamoPaso2 = pantallaContenido;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // obtenemos la escuela seleccionada
        
        this.jPanelProcesarPrestamoPaso2.seleccionarLibro();
        //this.jPanelProcesarPrestamoPaso2.seleccionarSocio();
        //this.unPanelPersona.getValidador().habilitarBoton(true, this.unPanelPersona.getJbtn_eliminar(), new Color(30, 132, 73), Color.WHITE, null, null);
        //this.unPanelPersona.getValidador().habilitarBoton(true, this.unPanelPersona.getJbtn_modificar(), new Color(30, 132, 73), Color.WHITE, null, null);
       //this.unPanelPersona.getValidador().limpiarCampo(this.unPanelPersona.getJtf_buscarPersona());
    }

}