package com.mycompany.biblioteca.view.resources;

import com.mycompany.biblioteca.view.JPanel_ProcesarPrestamo_paso1;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TableModelListenerSocio implements ListSelectionListener {

    private final JPanel_ProcesarPrestamo_paso1 jPanelProcesarPrestamoPaso1;

    public TableModelListenerSocio(JPanel_ProcesarPrestamo_paso1 pantallaContenido) {
        this.jPanelProcesarPrestamoPaso1 = pantallaContenido;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // obtenemos la escuela seleccionada
        this.jPanelProcesarPrestamoPaso1.seleccionarSocio();
        //this.unPanelPersona.getValidador().habilitarBoton(true, this.unPanelPersona.getJbtn_eliminar(), new Color(30, 132, 73), Color.WHITE, null, null);
        //this.unPanelPersona.getValidador().habilitarBoton(true, this.unPanelPersona.getJbtn_modificar(), new Color(30, 132, 73), Color.WHITE, null, null);
       //this.unPanelPersona.getValidador().limpiarCampo(this.unPanelPersona.getJtf_buscarPersona());
    }

}