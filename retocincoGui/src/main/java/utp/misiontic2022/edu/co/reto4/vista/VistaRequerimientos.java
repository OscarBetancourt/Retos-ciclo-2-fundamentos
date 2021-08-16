package utp.misiontic2022.edu.co.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.edu.co.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.edu.co.reto4.modelo.vo.Requerimiento_3;




public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        try {
            // Su código
         
            ArrayList<Requerimiento_1> requerimiento1 = controlador.consultarRequerimiento1();
            for(int i=0 ;i<requerimiento1.size(); i++){
              System.out.println( requerimiento1.get(i).getLider()+' '+requerimiento1.get(i).getCargo()
              +' '+requerimiento1.get(i).getProyectos());
             }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2(){
        try {
           
            ArrayList<Requerimiento_2> requerimiento2 = controlador.consultarRequerimiento2();
            for(int i=0 ;i<requerimiento2.size(); i++){
              System.out.println( requerimiento2.get(i).getiD_MaterialConstruccion()+' '+requerimiento2.get(i).getNombre_Material()
              +' '+requerimiento2.get(i).getCantidad()+' '+requerimiento2.get(i).getPrecio_Unidad()
              +' '+requerimiento2.get(i).getTotal());
             }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3(){
        try {
            ArrayList<Requerimiento_3> requerimiento3 = controlador.consultarRequerimiento3();
            for(int i=0 ;i<requerimiento3.size(); i++){
              System.out.println(requerimiento3.get(i).getID_Proyecto()+' '+requerimiento3.get(i).getCiudad()+' '+
                    requerimiento3.get(i).getClasificacion()+' '+requerimiento3.get(i).getCosto_Proyecto());}
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
