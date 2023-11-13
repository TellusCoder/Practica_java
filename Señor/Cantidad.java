/**
 * @(#)Cantidad.java
 *
 *
 * @author Carlos Fontal and Victor Cerrud
 * @version 1.00 2020/8/27
 */
import java.text.DecimalFormat; //libreria de java
	
 class Cantidad {	
 	

    //atributo
    private int moneda ;
    //metodos 
    public void asignarCash(int i){
        moneda = i;
    }
    public float calcular () {

        //declarcion de la variable
        float unidaddinero, sencillo ,total;

        //hacer el calculo 
        unidaddinero = moneda/4;
        sencillo = moneda %4;
        total = (sencillo * 0.25f) + unidaddinero;
        return total;
    }
}
 
  // Programa principal
  
 class CantidadDinero {
     public static void main(String[] arg) {

         //declaracion de la variable 
         float result ;
         // se declara y se crea el objeto
         Cantidad coins = new Cantidad ();
         DecimalFormat dollar =  new DecimalFormat();
         //invocar o llamar los metodos de objeto
         coins.asignarCash (12);
         result = coins.calcular ();
         System.out.println ("La Cantidad de dinero que tiene el señor es B/."+dollar.format(result)+ " dolares");
         
     } //fin del método main() 
 }//fin de la clase Cantidaddinero
