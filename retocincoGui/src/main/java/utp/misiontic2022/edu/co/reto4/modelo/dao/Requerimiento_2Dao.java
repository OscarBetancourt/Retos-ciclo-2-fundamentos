package utp.misiontic2022.edu.co.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.edu.co.reto4.util.JDBCUtilities;


public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> consultaDos = new ArrayList<Requerimiento_2>();
      
        String sql = "SELECT ID_MaterialConstruccion,Nombre_Material,Cantidad,Precio_Unidad,(Cantidad * Precio_Unidad) as Total  FROM Compra c  Natural JOIN MaterialConstruccion WHERE  ID_Proyecto in (14,20,18,36,45,48,56) ORDER BY ID_Proyecto ,Precio_Unidad DESC ;" ;
        
         try (
             Connection conn = JDBCUtilities.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
         ) {
             while(rs.next()) {
                 Requerimiento_2 consultas = new  Requerimiento_2();
                 consultas.setiD_MaterialConstruccion(rs.getString("ID_MaterialConstruccion"));
                 consultas.setNombre_Material(rs.getString("Nombre_Material"));
                 consultas.setCantidad(rs.getString("Cantidad"));
                 consultas.setPrecio_Unidad(rs.getString("Precio_Unidad"));
                 consultas.setTotal(rs.getString("Total"));
 
                consultaDos.add(consultas);
             }
           
         }
        return consultaDos;
    }
}