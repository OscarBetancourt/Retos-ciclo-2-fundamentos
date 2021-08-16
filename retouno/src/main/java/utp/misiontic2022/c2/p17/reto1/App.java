package utp.misiontic2022.c2.p17.reto1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CalculaInversion resultadoInversion = new CalculaInversion();
        System.out.println(resultadoInversion.calcularInteresSimple());
        System.out.println(resultadoInversion.calcularInteresCompuesto());
        System.out.println(resultadoInversion.compararInversion(12,2000000.0,5.0));
        System.out.println("prueba");
    }
}
