package utp.misiontic2022.edu.co.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.edu.co.reto4.util.JDBCUtilities;


public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList<Requerimiento_3> consultaTres = new ArrayList<Requerimiento_3>();
      
        String sql = "WITH proyecto_total AS (SELECT c.ID_Proyecto,c.ID_MaterialConstruccion,SUM(Cantidad * Precio_Unidad) AS Costo_Proyecto FROM Compra c  Natural JOIN MaterialConstruccion GROUP by c.ID_Proyecto)SELECT ID_Proyecto ,Ciudad,Clasificacion,Costo_Proyecto FROM  Proyecto	p2 natural join proyecto_total WHERE (Ciudad = 'Pereira' or Ciudad = 'Sta. Rosa de Cabal') and Costo_Proyecto > 87000 ORDER  BY Ciudad,Clasificacion;"; 
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()){ 
                Requerimiento_3 consulta = new  Requerimiento_3();
                consulta.setID_Proyecto(rs.getString("ID_Proyecto"));
                consulta.setCiudad(rs.getString("Ciudad"));
                consulta.setClasificacion(rs.getString("Clasificacion"));
                consulta.setCosto_Proyecto(rs.getString("Costo_Proyecto"));
                consultaTres.add(consulta);
            }
        } 

        return consultaTres;
    }
}