/**
 * @(#)Distancia.java
 *
 *
 * @author :
 *			Victor Cerrud
 *			Carlos Fontal
 * @version 1.00 2020/9/17
 */
//estas son las librerias utilizadas
import java.io.*;
import java.text.DecimalFormat;
//aqui declaramos la clase publica, con metodos publicos pero con atributos privados
public class Distancia{
	//declaramos las variables.
	private float tiempo;
	//aqui declaramos la flotante que es la velocidad de la luz equivalente a 300,000km/s
	//en este metodo asignamos el tiempo
	public void asignarTiempo(float t){
		tiempo=t;
	}
	//en este metodo se cálcula la distancia y se retorna el resultado
	public float calcularDis(){
		final int vluz= 300000;
		float distancia;
		distancia=tiempo*vluz;
		return distancia;
	}
}
class DistanciaDemo{

    public static void main (String[]Args){
    	//Aqui declaramos las variables
    	float t = -1;
    	float dis;
    	char comando = 'n';
    	char trigger= 'c';
    	//Aqui creamos el objeto, se llamara "objdis".
    	Distancia objDis= new Distancia();
    	//aqui declaramos el objeto para el control de decimales
    	DecimalFormat decim =  new DecimalFormat("#.####");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        do {
        	//Usando un ciclo "for" general, permitimos que el usuario ingrese 10 diferentes valores
        	for(int i =0;i<10;i++){
        		try{
        			//en este while, nos aseguramos que el usuario no ingrese un valor negativo
        			while(t<0){        		
        				System.out.println("Ingrese el Tiempo en segundos, el valor: ");
        				//aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
        				t = Float.parseFloat(br.readLine());
        			}
        			//asignamos el tiempo, usando el metodo "asignarTiempo"
        			objDis.asignarTiempo(t);
        			//calculamos la distancia
  					dis = objDis.calcularDis();
  					
  					//Presentamos el resultado de la distancia
        			System.out.println("La distancia es: " +decim.format(dis) +"km");
        			//reiniciamos la variable de almacenamiento, en caso que el usuario desee volver a calcular otra distancia
        			t = -1;
        		}
        		//aqui manejamos las excepciones
        		catch (IOException e)
				{	
					//en caso de presentarse una excepcion se debe reiniciar el contador i
					i--;
					System.out.println("Error...en la Entrada de datos"); 
        			System.out.println("El contenido del mensaje de error:  "+e+"\n\n");  
				}
				catch(NumberFormatException e)
				{  	
					//en caso de presentarse una excepcion se debe reiniciar el contador i
					i--;
					//reiniciamos la variable "t", para que el usuario vuelva a ingresar un nuevo dato
					t=-1;
					System.out.println("Error...conversion de tipo de dato");
		   			System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
				}
        	}
        	try{
        		//con esta forma, nos aseguramos que el usuario solo escoja una de las dos opciones y el programa repita nuevamente o salga
        		while((comando!='c')&(comando!='s')){
        			//presentamos las opciones en caso de querer continuar o salir
        			System.out.println("\n\nSeleccione una de las siguientes opciones: ");
        			System.out.println("c. Calcular distancia nuevamente");
        			System.out.println("s. salir");
        			//leemos el comando escrito por el usuario
        			comando=(char)br.read();
        			br.skip(1);
        		}
        		//este trigger identifica que el usuario desea salir y es momento de terminar
        		if(comando=='s'){
        			trigger='s';
        		}
        	}
        	catch(IOException e){
        		System.out.println("Error...en la Entrada de datos"); 
        		System.out.println("El contenido del mensaje de error:  "+e+"\n\n");
        	}
        	//reiniciamos la variable comando a su estado original
        	comando='n';
		//cuando el usuario escriba '2', entonces el programa se detiene, porque desea salir
        }while(trigger=='c');
        //enviamos un mensaje que le indica al usuario que estamos saliendo del programa.
        System.out.println("Cerrando el programa...");
    }
}