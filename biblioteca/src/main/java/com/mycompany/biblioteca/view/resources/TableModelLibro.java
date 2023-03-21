package com.mycompany.biblioteca.view.resources;



import com.mycompany.biblioteca.model.Book;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModelLibro extends AbstractTableModel {
    private static final String[] COLUMNAS = {"ISBN", "Nombre"};
    private List<Book> books;

    public TableModelLibro() {
        books = new ArrayList<>();
    }

    @Override
    public int getRowCount() {        
        return books == null ? 0 : books.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        Book book = books.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = book.getIsbn();
                break;
            case 1:
                retorno = book.getName();
                break;           
        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Book getBookIn (int row) {
        return books.get(row);
    }

    public int findRowBook(Book bookSearch){
        int row = 0;
        int accountant = 0;
        for (Book bookR : books) {
            accountant = accountant +1;
            if (bookSearch.getIsbn()==bookR.getIsbn()) {
                row = accountant;
            }
        }
        return row;
    }
}
