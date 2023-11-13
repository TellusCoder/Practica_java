import java.io.*;
import java.text.DecimalFormat;
public class NumerDenomi {
    private float num, deno;
    public void asignarNumeros(float a, float b) {
        num = a;
        deno = b;  
    }
    public float calcularDivision() {
        float result = num /deno;
        return result;
    } 
}
class AppDemo {
    public  static void main(String[] args) {
        //Declaracion de variable
        float a=0,b=0, result;
        int i;
        boolean error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumerDenomi obj = new NumerDenomi ();
        DecimalFormat decim =  new DecimalFormat("###,###.##");
        for (i =1 ; i <=2 ; i++){
            do {
                error = false;
                try {
                    System.out.println("Ingrese el numerador: ");
                    a = Float.parseFloat(br.readLine());
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
            } while (error ==true);
            do {
                error = false;
                try {
                    while (b==0) {
                        System.out.println("Ingrese el denominador: ");
                        b= Float.parseFloat(br.readLine()); 
                    }
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
            } while (error ==true);
            obj.asignarNumeros(a,b);
            result =obj.calcularDivision();
            System.out.println("El resultado de la division es "+decim.format(result));
            b=0;
        }
    }
}
