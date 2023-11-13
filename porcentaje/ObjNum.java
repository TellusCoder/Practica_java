/**
 * @(#)ObjNum.java
 *
 *
 * @author :
 *		Victor Cerrud
 *		Carlos Fontal
 * @version 1.00 2020/9/11
 */
import java.io.*;
import java.text.DecimalFormat;
public class ObjNum {
	// atributo
   	private float num;
   //metodos
   	public void asignarNum (float n){
   		num = n ;
   	}
 	public float calcularPorc(){
   		float porcent ;
   		porcent= num/100 ;
   	return 	porcent ;
   	}
}
// Programa principal
 class ObjNumDemo {
 	public static void main(String [] args){
 		// crea un buffer, permitiendo leer desde el teclado cadenas
 		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
  		// declaracion de la variable
    	String cad;
    	float numero=-1;
    	float porcent;
    	char resp='s';
    	//El objeto 
    	ObjNum obj = new ObjNum ();
    	//esta linea nos ayuda a tener almenos 4 decimales, dependiendo del numero agregado
		DecimalFormat decim =  new DecimalFormat("#.####");
    	do {	
			try	
				{	
					//en caso que el usuario agregue un numero fuera del rango de 0-100
					while(numero<0)
					{
						System.out.println("\nIntroduzca un n�mero positivo, su n�mero:");
						cad = br.readLine();
			 			// convierte de cadena a numero flotante
						numero =   Float.parseFloat(cad);	
						}
						// Invocar o llamar los metodos de cada objeto
						obj.asignarNum(numero);
						porcent=obj.calcularPorc();
						System.out.println("El porcentaje es : " +decim.format(porcent) +" %");
						numero=-1;
						System.out.println("\n\nIntroduzcas s para continuar y cualquier otro caracter para terminar");
						resp= (char) br.read();   //lectura de un caracter
						br.skip(1);
    					}	
						catch (IOException y)	
						{
							System.out.print("Error...en la Entrada de datos" +"\n\n"); 
        					System.out.print("El contenido de y:  "+y);
						}	
						catch(NumberFormatException y)			
						{	
							System.out.print("Error...conversion de tipo de dato" +"\n\n");
		   					System.out.print("El contenido de y:  "+y); 
						}			
    		}while (resp =='s');
 			System.out.print("\n\nFinaliz� la ejecuci�n del programa");	
 			}
 }
