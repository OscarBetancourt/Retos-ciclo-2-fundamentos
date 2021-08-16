package utp.misiontic2022.edu.co.reto4.modelo.vo;

public class Requerimiento_2 {
    
    private String iD_MaterialConstruccion;
    private String Nombre_Material;
    private String Cantidad; 
    private String Precio_Unidad;
    private String Total;   
    public Requerimiento_2(){

    }
    public String getiD_MaterialConstruccion() {
        return iD_MaterialConstruccion;
    }
    public void setiD_MaterialConstruccion(String iD_MaterialConstruccion) {
        this.iD_MaterialConstruccion = iD_MaterialConstruccion;
    }
    public String getNombre_Material() {
        return Nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        this.Nombre_Material = nombre_Material;
    }
    public String getCantidad() {
        return Cantidad;
    }
    public void setCantidad(String cantidad) {
        this.Cantidad = cantidad;
    }
    public String getPrecio_Unidad() {
        return Precio_Unidad;
    }
    public void setPrecio_Unidad(String precio_Unidad) {
       this.Precio_Unidad = precio_Unidad;
    }
    public String getTotal() {
        return Total;
    }
    public void setTotal(String total) {
        this.Total = total;
    }
    
}
