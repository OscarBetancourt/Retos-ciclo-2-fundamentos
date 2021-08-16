package utp.misiontic2022.edu.co.reto4.modelo.dao;
import utp.misiontic2022.edu.co.reto4.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_1;


public class Requerimiento_1Dao {
    public  ArrayList<Requerimiento_1> requerimiento1() throws SQLException {

        
        ArrayList<Requerimiento_1> consultaUno = new ArrayList<Requerimiento_1>();
       //ResultSet rs = null;
       // String sql = "SELECT title, amount as Inventario, Ventas FROM stock s2 JOIN (SELECT b.id as id_book, b.title, SUM(s.amount) as Ventas FROM books b, sales s WHERE b.id = s.id_book AND b.isbn = '"+ibsn+"') as book WHERE book.id_book = s2.id_book;";
       String sql = "SELECT l.Nombre ||' '|| l.primer_Apellido as Lider,l.Cargo as Cargo,count(p.ID_Lider) as Proyectos  FROM Proyecto p JOIN Lider l on (p.ID_Lider = l.ID_Lider ) WHERE  p.Constructora ='Pegaso' GROUP by p.ID_Lider ORDER  by Cargo ,Lider;" ;
       
        try (
            Connection conn = JDBCUtilities.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ) {
            while(rs.next()) {
                Requerimiento_1 consultas = new  Requerimiento_1();
                consultas.setLider(rs.getString("Lider"));
                consultas.setCargo(rs.getString("Cargo"));
                consultas.setProyectos(rs.getString("Proyectos"));

               consultaUno.add(consultas);
            }
          
        }
        return consultaUno;
  
    }
}

    