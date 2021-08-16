/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.misiontic2022.edu.co.reto4.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_3;

/**
 *
 * @author user
 */
public class RequerimientotresTM  extends AbstractTableModel{
    private List<Requerimiento_3> requerimientotres; 
    
    public RequerimientotresTM(){
        this.requerimientotres = new ArrayList<>();
    }
    public RequerimientotresTM(List<Requerimiento_3> requerimiento){
        this.requerimientotres = requerimiento;
    }
       public void setRequerimientotres(int row,Requerimiento_3 requrimiento){
        requerimientotres.set(row, requrimiento);
    }
    public Requerimiento_3 getRequerimientodos(int row){
        return requerimientotres.get(row);
        
    } 
    @Override
    public int getRowCount() {
          return requerimientotres.size();   
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int colunm) {
        Requerimiento_3 requerimiento_3 = requerimientotres.get(row);
        switch(colunm){
            case 0: return requerimiento_3.getID_Proyecto();
            case 1 :return requerimiento_3.getCiudad();
            case 2 :return requerimiento_3.getClasificacion();
            case 3 :return requerimiento_3.getCosto_Proyecto(); 
        }
       return null; 
    }
    
      public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID Proyecto";
            case 1:
                return "Ciudad";
            case 2:
                return "Clasificacion";
            case 3 : return "Costo Proyecto";
            
 
        }
        return super.getColumnName(column);
    }
}
