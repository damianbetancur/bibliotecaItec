package com.mycompany.biblioteca.view.resources;

import com.mycompany.biblioteca.model.Socio;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModelSocio extends AbstractTableModel {

    private static final String[] COLUMNAS = {"N° Socio", "Nombre", "Apellido", "DNI"};
    private List<Socio> socios;
    

    public TableModelSocio() {
        socios = new ArrayList<>();
    }

    @Override
    public int getRowCount() {        
        return socios == null ? 0 : socios.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        Socio socio = socios.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = socio.getNumeroSocio();
                break;
            case 1:
                retorno = socio.getNombre();
                break;
            case 2:
                retorno = socio.getApellido();
                break;
            case 3:
                retorno = socio.getDni();
                break;
        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public Socio obteneSocioEn (int fila) {
        return socios.get(fila);
    }

    public int buscarFilaSocio(Socio socioBuscado){
        int fila = 0;
        int contador = 0;
        for (Socio socior : socios) {
            contador = contador +1;
            if (socioBuscado.getNumeroSocio()==socior.getNumeroSocio()) {
                fila = contador;
            }
        }
        return fila;
    }

}
