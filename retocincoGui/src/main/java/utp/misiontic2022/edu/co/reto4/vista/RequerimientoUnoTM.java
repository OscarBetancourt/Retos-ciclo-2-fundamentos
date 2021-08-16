/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.edu.co.reto4.vista;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author user
 */
public class RequerimientoUnoTM  extends AbstractTableModel{
    private List<Requerimiento_1> requerimientouno;
    
    public RequerimientoUnoTM(){
       this.requerimientouno = new ArrayList<>();
    }
    
    public RequerimientoUnoTM(List<Requerimiento_1> requerimiento) {
        this.requerimientouno = requerimiento;
    }

    RequerimientoUnoTM(ArrayList<Requerimiento_2> Requerimientodos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setRequerimientouno(int row,Requerimiento_1 requrimiento){
        requerimientouno.set(row, requrimiento);
    }
    public Requerimiento_1 getRequerimientouno(int row){
        return requerimientouno.get(row);
        
    }
    @Override
    public int getRowCount() {
       return requerimientouno.size(); 
    }

    @Override
    public int getColumnCount() {
       return 3;
    }

    @Override
    public Object getValueAt(int row, int colunm) {
        Requerimiento_1 requerimiento_1 = requerimientouno.get(row);
        switch(colunm){
            case 0 : return requerimiento_1.getLider();
            case 1 : return requerimiento_1.getCargo();
            case 2 : return requerimiento_1.getProyectos();
        
    }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Lider";
            case 1:
                return "Cargo";
            case 2:
                return "#Proyecto";
 
        }
        return super.getColumnName(column);
    }
    
 
}
