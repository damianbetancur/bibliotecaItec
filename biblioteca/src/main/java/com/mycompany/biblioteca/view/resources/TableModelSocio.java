package com.mycompany.biblioteca.view.resources;

import com.mycompany.biblioteca.model.Partner;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class TableModelSocio extends AbstractTableModel {

    private static final String[] COLUMNAS = {"N° Socio", "Nombre", "Apellido", "DNI"};
    private List<Partner> partners;
    

    public TableModelSocio() {
        partners = new ArrayList<>();
    }

    @Override
    public int getRowCount() {        
        return partners == null ? 0 : partners.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNAS.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object retorno = null;
        Partner partner = partners.get(rowIndex);

        switch (columnIndex) {
            case 0:
                retorno = partner.getPartnerNumber();
                break;
            case 1:
                retorno = partner.getFirstName();
                break;
            case 2:
                retorno = partner.getLastName();
                break;
            case 3:
                retorno = partner.getDni();
                break;
        }
        return retorno;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNAS[column];
    }

    public void setPartners(List<Partner> partners) {
        this.partners = partners;
    }

    public Partner getPartnerIn (int row) {
        return partners.get(row);
    }

    public int findRowPartner(Partner partnerSearch){
        int row = 0;
        int accountant = 0;
        for (Partner partnerR : partners) {
            accountant = accountant +1;
            if (partnerSearch.getPartnerNumber()==partnerR.getPartnerNumber()) {
                row = accountant;
            }
        }
        return row;
    }

}
