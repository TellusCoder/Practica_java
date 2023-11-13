
//Cargar un vector con 10 elementos, imprimir el vector. Calcular e imprimir la suma de sus elementos.
import java.io.*;
public class ArregloVector{
    //atributos
    private int [] num = new int [10];
    private int total =0;
    //Metodos 
    void asignarcontiene (int i ,int a) {
            num [i]= a;
            total = total +a;
    }
    int [] mostrarElemetos(){
          return num ;
    }
    int sumtotal(){
        return total;
    } 

}
class App {
    public static void main(String[] args) {
        //declarcion de variable
        int i,sumtotal;
        int [] numeros = null ;
        int a =0;
        boolean error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArregloVector obj = new ArregloVector ();
        for (i=0; i<10; i++){
            do {
                error = false;
                try {
                    System.out.println("Ingrese el numerador "+i+" es : ");
                    // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
                    a= Integer.parseInt(br.readLine());
                    obj.asignarcontiene (i,a);
                } 
                catch (IOException e) {
                    error =true;
                    System.out.println("Error...en la Entrada de datos"); 
                    System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
                }
                catch (NumberFormatException e ){
                    error =true;
                    System.out.println("Error...conversion de tipo de dato");
                    System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
                } 
            }while(error==true);
        }
        numeros= obj.mostrarElemetos();
        for (i=0; i<10; i++){
            System.out.println (" Elemetos ["+i+"]= "+numeros[i]);
        }
        sumtotal = obj.sumtotal();
        System.out.println("La suma de los elemeto es: "+sumtotal);
    }
}