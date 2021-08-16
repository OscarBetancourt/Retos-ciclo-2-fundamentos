package utp.misiontic2022.edu.co.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.edu.co.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.edu.co.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.edu.co.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_3;



public class ControladorRequerimientos {
    private static Requerimiento_1Dao requerimiento_1Dao ;
    private static Requerimiento_2Dao requerimiento_2Dao;
    private static Requerimiento_3Dao requerimiento_3Dao;
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        requerimiento_1Dao = new Requerimiento_1Dao();
        ArrayList<Requerimiento_1> requerimiento_1 = new ArrayList<Requerimiento_1>();
        requerimiento_1 = requerimiento_1Dao.requerimiento1();      
        return requerimiento_1; 
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        requerimiento_2Dao = new Requerimiento_2Dao();
        ArrayList<Requerimiento_2> requerimiento_2 = new ArrayList<Requerimiento_2>();
        requerimiento_2 = requerimiento_2Dao.requerimiento2();
        return requerimiento_2;
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        requerimiento_3Dao = new Requerimiento_3Dao();
        ArrayList<Requerimiento_3> requerimiento_3 = new ArrayList<Requerimiento_3>();
        requerimiento_3 = requerimiento_3Dao.requerimiento3();
        return requerimiento_3;
    }
}