/**
 * @(#)NumerosPositN.java
 *
 *
 * @author:
 *			Victor Cerrud
 *			Carlos Fontal 
 * @version 1.00 2020/9/25
 */
import java.io.*;
public class NumerosPositN {
    //Atributos
    private float n ;
    //Metodos
    public void asignarNumero(float n1) {
        n = n1;   
    }
    public String neutroPositivo (){
        String  result =null;
        if (n == 0) {
            result = "Neutro";
        }
        else{
            if (n > 0) {
                result = "Positivo";
            }
            else{
                result = "Negativo"; 
            }
        }
        return result;
    }
}
//Programa principal
class App {
    public  static void main(String[] args) {
        //Declaracion de variable
        float n;
        String result= null;
        int i;
        // crea un buffer, permitiendo leer desde el teclado cadenas
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //El objeto 
        NumerosPositN obj = new NumerosPositN();
        // crearmo un ciclo para que se repita  7 veces 
        for (i =1 ; i <=7 ; i++){
            try {
                System.out.println("Ingrese un numero: ");
                // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
                n = Float.parseFloat(br.readLine());
                obj.asignarNumero(n);
                result =obj.neutroPositivo();
                System.out.println("El numero es "+result);
            } 
            catch (IOException e) {
                --i;
                System.out.println("Error...en la Entrada de datos"); 
                System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
            }
            catch (NumberFormatException e ){
                --i;
                System.out.println("Error...conversion de tipo de dato");
                System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
            }
        }
        System.out.print("\n\nFinalizón la ejecución del programa");
    }
}

