package utp.misiontic2022.edu.co;

public class Lavadora extends Electrodomestico {
    
//-----------ATRIBUTOS-------------//
    private Integer CARGA_BASE = 5 ;
    private Integer carga;
//----------CONSTRUCTOR----------//
   public Lavadora(){
       super();
       this.carga = CARGA_BASE;

   }
   public Lavadora(Double precioBase, Integer peso){
    super(precioBase,peso);
    this.carga = CARGA_BASE;
   }
   public Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga){
    super(precioBase,peso,consumoW);
    this.carga = carga;
   }
//----------METODOS-------------//
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
        if(this.carga > 30){ adicion = adicion+50.0;}  
        return super.precioBase + adicion; 
         }
}
