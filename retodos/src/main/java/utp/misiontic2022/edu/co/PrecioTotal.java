package utp.misiontic2022.edu.co;

public class PrecioTotal {
//--------------ATRIBUTOS-----------//
   private Double totalElectrodomesticos =0.0;
   private Double totalLavadoras=0.0;
   private Double totalTelevisiones=0.0;
   private Electrodomestico[] listaElectrodomesticos;
  
//-------------CONSTRUCTOR----------//
    PrecioTotal(Electrodomestico[] pElectrodomesticos){

        this.listaElectrodomesticos= pElectrodomesticos; 

    }
//-------------METODOS--------------//
   public void mostrarTotales(){
    Electrodomestico Electro = new Electrodomestico();
    Electrodomestico Lavadora = new Lavadora();
    Electrodomestico Tv =new Television();
    // if(this.listaElectrodomesticos[i] instanceof Electrodomestico){ //
    for(int i =0 ; i< this.listaElectrodomesticos.length;i++){

      if (Electro.getClass().getSimpleName()== this.listaElectrodomesticos[i].getClass().getSimpleName()){   
        totalElectrodomesticos= this.listaElectrodomesticos[i].calcularPrecio()+totalElectrodomesticos;
        }
        if (Lavadora.getClass().getSimpleName()== this.listaElectrodomesticos[i].getClass().getSimpleName()){ 
        totalLavadoras= this.listaElectrodomesticos[i].calcularPrecio()+totalLavadoras;}
        if (Tv.getClass().getSimpleName()== this.listaElectrodomesticos[i].getClass().getSimpleName()){ 
            totalTelevisiones= this.listaElectrodomesticos[i].calcularPrecio()+totalTelevisiones;}
    }
    totalElectrodomesticos = totalElectrodomesticos+totalTelevisiones+totalLavadoras;
    System.out.println("La suma del precio de los electrodomésticos es de " + 
    totalElectrodomesticos);

    System.out.println("La suma del precio de las lavadoras es de " + totalLavadoras);
    System.out.println("La suma del precio de las televisiones es de " + totalTelevisiones);
   }
    
}
