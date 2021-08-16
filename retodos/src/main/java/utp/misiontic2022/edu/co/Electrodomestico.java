package utp.misiontic2022.edu.co;

public class Electrodomestico {
 //----------Atributos-----------------//
    private Double PRECIO_BASE =100.0;
    private char CONSUMO_W_BASE ='F';
    private Integer PESO_BASE = 5;
    protected Integer peso;
    protected char consumoW;
    protected Double precioBase;


 //----------Constructor----------------//   
    public Electrodomestico(){
          this.peso = PESO_BASE;
          this.consumoW = CONSUMO_W_BASE;
          this.precioBase = PRECIO_BASE; 

    }
    public Electrodomestico(Double precioBase, Integer peso){
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = precioBase;
        this.peso = peso;

    }
    public Electrodomestico(Double precioBase, Integer peso , char consumoW){
        comprobarconsumoW(consumoW);
        this.precioBase = precioBase;
        this.peso = peso;
    }

    //-----------Metodos----------------------//
    public void comprobarconsumoW(char consumoW){ 
        if(consumoW <='F'){
             this.consumoW=consumoW; }
         else{
             this.consumoW = CONSUMO_W_BASE;
         }     
           
     }
     public Double calcularPrecio(){ 
         // Código 
        Double adicion =0.0; 
        if(this.consumoW == 'A'){  adicion = 100.0 ; 
        }else if(this.consumoW == 'B'){  adicion = 80.0;}
         else if(this.consumoW == 'C'){ adicion = 60.0 ;}
         else if(this.consumoW == 'D'){ adicion = 50.0 ;}
         else if(this.consumoW == 'E'){ adicion = 30.0 ;}
         else if(this.consumoW == 'F'){ adicion = 10.0 ;}

        if((this.peso >-1) && (this.peso < 19)){ adicion = adicion + 10.0 ;}
        else if((this.peso > 19) && (this.peso < 49)) { adicion = adicion + 50.0 ; } 
        else if((this.peso > 49) && (this.peso < 80)) { adicion = adicion + 80.0 ; } 
        else if(this.peso > 79) { adicion = adicion + 100.0 ; } 
    
        return this.precioBase + adicion; 
        }
}
