package com.mycompany.biblioteca.view.resources;

import com.mycompany.biblioteca.model.Libro;
import com.mycompany.biblioteca.model.Socio;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModelLibro extends AbstractTableModel {

    private static final String[] COLUMNAS = {"ISBN", "Nombre"};
    private List<Libro> libros;
    

    public TableModelLibro() {
        libros = new ArrayList<>();
    }

    @Override
    public int getRowCount() {        
        return libros == null ? 0 : libros.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        Libro libro = libros.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = libro.getIsbn();
                break;
            case 1:
                retorno = libro.getNombre();
                break;           
        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Libro obtenerLibroEn (int fila) {
        return libros.get(fila);
    }

    public int buscarFilaLibro(Libro libroBuscado){
        int fila = 0;
        int contador = 0;
        for (Libro libror : libros) {
            contador = contador +1;
            if (libroBuscado.getIsbn()==libror.getIsbn()) {
                fila = contador;
            }
        }
        return fila;
    }

}
