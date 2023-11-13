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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        NumerosPositN obj = new NumerosPositN();
        for (i =1 ; i <=7 ; i++){
            try {
                System.out.println("Ingrese un numero: ");
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
    }
}


