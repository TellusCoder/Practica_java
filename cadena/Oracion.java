import java.io.*;

public class Oracion {
	//atributos
    private String cadena1;
    //metodos
    public void asignarCadenas(String cad1) {
        cadena1=cad1;
    }
    public String concatenarCadenas(){
        String resul= "Hola " + cadena1;
        return resul;
    }
}
//Programa Principal
class OracionDemo{
    public static void main (String[]Args){
    	//declaracion de la cadena
        String cad1;
        String resul;
        char resp = 'S' ;
        //objeto 
        Oracion objora=new Oracion();
        // crea un buffer, permitiendo leer desde el teclado cadenas
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        // Estructura Repetitiva para tener un ciclo indefino para diga si dea continuar 
        do {
            try{ 
                System.out.println("Ingrese su nombre: ");            
                cad1 = br.readLine();
                //asignamos el tiempo, usando el metodo "asignarCadenas"
                objora.asignarCadenas(cad1);
                resul= objora.concatenarCadenas();
                // se imprime la cadena concatenada 
                System.out.println("Esta es la cadena concatenada: "+ resul);
                // se mada imprimir si el usario dea continuar 
                System.out.print("\n¿Desea Continuar? Escriba S o s para continuar o cualquier otro caracter para terminar el programa.\n");
                //leer carcter
                resp = (char)br.read();	 
               	//convierte un caracter s en mayuscula  
                resp = Character.toUpperCase(resp); 
                br.skip(1); 
            }  
            catch(IOException e){
                System.out.println("Error...en la Entrada de  datos" +"\n" ); 
                System.out.println("El contenido del mensaje de error:  "+e);  
            }
        } while (resp =='S');
        System.out.print("\n\nFinalizó la ejecución del programa");
    }
}
