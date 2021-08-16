package utp.misiontic2022.c2.p17.reto1;

public class CalculaInversion {

    //Atributos
    private Double diferencia ;
    private Double interesCompuesto ;
    private Double interesSimple;
    private int tiempo;
    private Double capital;
    private Double interes;
   
    CalculaInversion(){
        setTiempo(0);
        setCapital(0.0);
        setInteres(0.0);

   }
    
    CalculaInversion(int pTiempo, double pCapital,double pInteres){
         setTiempo(pTiempo);
         setCapital(pCapital);
         setInteres(pInteres);

    }

    //Metodos
    public double compararInversion( ) { 
    //    setDiferencia(0.0);
    //    this.interesCompuesto = 0.0;
    //    setInteresSimple(0.0);
    //    setTiempo(0);
    //    setInteres(0.0);
    //    setCapital(0.0);
    //    return this.diferencia;
    setDiferencia(calcularInteresCompuesto()-calcularInteresSimple());
    return getDiferencia();

    }
    
    public double calcularInteresSimple(){
        // setCapital(0.0);
        // setTiempo(0);
        // setInteres(0.0);
        this.interesSimple = getCapital()*getTiempo()*(getInteres()/100);
        return Math.round(this.interesSimple);
    }
    public double calcularInteresCompuesto(){
        this.interesCompuesto = getCapital()*(Math.pow((1 + getInteres()/100),getTiempo())-1);
        
        return Math.round(getInteresCompuesto());
    }
    public double compararInversion ( int pTiempo, double pCapital, double pInteres ) {
         setTiempo(pTiempo);
         setCapital(pCapital);
         setInteres(pInteres);
        //  calcularInteresCompuesto();
        //  calcularInteresSimple();
         setDiferencia(calcularInteresCompuesto()-calcularInteresSimple());
         return getDiferencia();
        }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double diferencia) {
        this.diferencia = diferencia;
    }

    public Double getInteresCompuesto() {
        return interesCompuesto;
    }

    public void setInteresCompuesto(Double interesCompuesto) {
        this.interesCompuesto = interesCompuesto;
    }

    public Double getInteresSimple() {
        return interesSimple;
    }

    public void setInteresSimple(Double interesSimple) {
        this.interesSimple = interesSimple;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    } 
   


    
}
