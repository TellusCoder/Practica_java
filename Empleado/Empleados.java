/** 
 * @(#)Empleados.java
 *
 *
 * @author :
 *			Victor Cerrud
 *			Carlos Fontal
 * @version 1.00 2020/9/29
 */
import java.io.*;
import java.text.DecimalFormat;
public class Empleados {
    //atributos
    private String n = null;
    private char t,diafer;
    private int ht;
    //metodos
    public void asignarEmpleados( String nom, char inout , int time, char holiday){
        n =nom;
        t= inout;
        ht = time;
        diafer = holiday;
    }
    public String nombreEmpleado() {
        return n;
    }
    public float calculoSalarioEmpleado(){
        final float thd = 15.00f;
        final float thn =20.00f;
        float result;
        if (t == 'd'& diafer == 'N' ) {
            result = ht*thd; 
        }
        else
            if (t == 'n'& diafer == 'N' ) {
                result = ht *thn;
            }
            else {
                result = ht *thn*2;
            }
            return result;
    }
}
//Programa Principal
class App {
    public static void main(String[] args){
        //Declaracion de variable
        String nom = null, cad =null;
        char inout=0,holiday=0;
        int time= 0;
        float result;
        boolean error;
        // crea un buffer, permitiendo leer desde el teclado cadenas
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //El objeto 
        Empleados obj = new Empleados ();
        DecimalFormat dollar =  new DecimalFormat("###,###.##");
        do {
            error = false;
            try {
                System.out.println("\nIngrese su nombre: ");
                // aqui leemos la cadena
                nom = br.readLine();
            } 
            catch (IOException e) {
                error =true;
                System.out.println("Error...en la Entrada de datos"); 
                System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
            }
        } while (error ==true);
        do {
            error = false;
            try {
                System.out.println("\nIngrese uno de los siguientes comandos para indicar si es diurno o nocturno: ");
                System.out.println("- d para turno diurno");
                System.out.println("- n para Turno nocturno");
               //aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a char.
                inout = (char)br.read();
                 //en caso que el usuario escribiera otro  caracter
                if (inout !='d' &inout != 'n') {
                    error=true; 
                    System.out.println(" Error... el tipo de dato ingresado no es el correcto");
                }
                // para evitar si lee algun enter.
                br.skip(1);
            }
            catch (IOException e) {
                error =true;
                System.out.println("Error...en la Entrada de datos"); 
                System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
            }
        } while (error ==true);
        
        do {
            error = false;
            try {
                System.out.println("Ingrese las horas trabajadas: ");
                // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a entero.
                time = Integer.parseInt(br.readLine());
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
        
        if(inout=='n'){
            do {
                   error = false;
                try {
                    System.out.println("\nIngrese uno de los siguientes comandos para indicar si es dia feriado o no: ");
                    System.out.println("- S para indicar que el dia es feriado ");
                    System.out.println("- N para indicar que el dia no es feriado");
                       //aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a char.
                    holiday = (char)br.read();	 
                       //convierte un caracter s en mayuscula  
                    holiday= Character.toUpperCase(holiday); 
                    //en caso que el usuario  escribiera  otro  caracter
                    if (holiday !='S' & holiday!= 'N') {
                        error=true;
                        System.out.println("\nError... el tipo de dato ingresado no es el correcto");
                    } 
                    // para evitar si lee algun enter.
                    br.skip(1);
                    }
                catch (IOException e) {
                    error =true;
                    System.out.println("Error...en la Entrada de datos"); 
                    System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
                }
            } while (error ==true);
        }
        else{
            holiday='N';
        }
        obj.asignarEmpleados(nom, inout, time, holiday);
        cad = obj.nombreEmpleado();
        result = obj.calculoSalarioEmpleado();
        System.out.println("\nEl nombre del empleado es "+cad+ " el salario diario es B/. "+ dollar.format(result));

    }
}
