/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.edu.co.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_2;

/**
 *
 * @author user
 */
public class RequerimientoDosTM  extends AbstractTableModel {
    private List<Requerimiento_2> requerimientodos;
   
    public RequerimientoDosTM(){
        this.requerimientodos = new ArrayList<>();
    }
    public RequerimientoDosTM(List<Requerimiento_2> requerimiento){
        this.requerimientodos = requerimiento;
    }
     public void setRequerimientodos(int row,Requerimiento_2 requrimiento){
        requerimientodos.set(row, requrimiento);
    }
    public Requerimiento_2 getRequerimientodos(int row){
        return requerimientodos.get(row);
        
    } 
    @Override
    public int getRowCount() {
         return requerimientodos.size();
    }
    

    @Override
    public int getColumnCount() {
       return 5;
    }

    @Override
    public Object getValueAt(int row, int colunm) {
        Requerimiento_2 requerimiento_2 = requerimientodos.get(row);
        switch(colunm){
            case 0: return requerimiento_2.getiD_MaterialConstruccion();
            case 1 :return requerimiento_2.getNombre_Material();
            case 2 :return requerimiento_2.getCantidad();
            case 3 :return requerimiento_2.getPrecio_Unidad();
            case 4 :return requerimiento_2.getTotal();
            
   
        }
       return null; 
    }
     @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID_MaterialConstruccion";
            case 1:
                return "Nombre Material";
            case 2:
                return "Cantidad";
            case 3 : return "Precio Unidad";
            case 4 : return "Precio Total";
 
        }
        return super.getColumnName(column);
    }
}
