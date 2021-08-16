package utp.misiontic2022.edu.co;



public class Television extends Electrodomestico{
//-------------ATRIBUTOS--------------//
    private Integer PULGADAS_BASE = 20 ;
    private Integer pulgadas;
    private Boolean sintetizadorTDT = false;
//------------CONSTRUCTOR------------//
    public Television(){
        super();
        this.pulgadas = PULGADAS_BASE;

    }
    public Television(Double precioBase, Integer peso){
        super(precioBase,peso);
        this.pulgadas = PULGADAS_BASE; 
        // Código 
    }
    public Television(Double precioBase, Integer peso, char consumoW,
     Integer pulgadas, boolean sintetizadorTDT){
        super(precioBase, peso,consumoW);
        this.pulgadas = pulgadas;
        this.sintetizadorTDT = sintetizadorTDT;
     }
     //-----------METODOS-----------------//
     @Override
     public Double calcularPrecio(){
        Double adicion =0.0; 
        if(super.consumoW == 'A'){  adicion = 100.0 ; 
        }else if(super.consumoW == 'B'){  adicion = 80.0;}
         else if(super.consumoW == 'C'){ adicion = 60.0 ;}
         else if(super.consumoW == 'D'){ adicion = 50.0 ;}
         else if(super.consumoW == 'E'){ adicion = 30.0 ;}
         else if(super.consumoW == 'F'){ adicion = 10.0 ;}

        if((super.peso > -1) && (super.peso < 19)){ adicion = adicion + 10.0 ;}
        else if((this.peso > 19) && (super.peso < 49)) { adicion = adicion + 50.0 ; } 
        else if((super.peso > 49) && (super.peso < 80)) { adicion = adicion + 80.0 ; } 
        else if(super.peso > 79) { adicion = adicion + 100.0 ; } 

        if(this.sintetizadorTDT){ adicion = adicion+50.0;}  
        if (this.pulgadas> 40){super.precioBase = super.precioBase+ super.precioBase*0.3;}
        return super.precioBase + adicion; 
         }    

}
