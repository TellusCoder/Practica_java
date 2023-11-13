
import java.io.*;
public class VeloDistan {
    //Atributo
    private  int tiempo;
    //metodos
    public void asignarTiempo(int time) {
        tiempo = time ;  
    }
    public double convertirDistancia() {
        double result_distan;
        //formula fisica d = v*t
        result_distan = 300.000 * tiempo;
        return result_distan ;  
    }
}
//Progrma Principal
class veloDistanDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        // declaracion de la variable
        String cad ;
        int hora,i ;
        double result ;
        //El Objeto
        VeloDistan obj = new VeloDistan();
        for (i = 0; i<10; i++){
            try {
                System.out.println("\nIntroduzca el tiempo en segundo: ");
                cad = br.readLine();
                 // convierte de cadena a numero entero 
                hora =   Integer.parseInt(cad);
                // Invocar o llamar los metodos de cada objeto
                obj.asignarTiempo(hora);
                result = obj.convertirDistancia();
                System.out.println("La distancia que recorre en dicho tiempo es: " + result +" Km");
            } 
            catch (IOException e) {
                --i;
                System.out.print("Error...en la Entrada de datos" +"\n\n"); 
                System.out.print("El contenido de e:  "+e);
            }
            catch (NumberFormatException e){
                --i;
                System.out.print("Error...conversion de tipo de dato" +"\n\n");
                System.out.print("El contenido de e:  "+e);
            }
        }
        System.out.print("\nFinalizó la ejecución del programa");
    }      
}