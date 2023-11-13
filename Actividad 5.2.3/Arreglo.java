/**
 * @(#)Arreglo.java
 *
 *
 * @author :
 *          Victor Cerrud 
 *          Carlos Fontal  
 * @version 1.00 2020/10/21
 */
import java.io.*;
public class Arreglo {
	//Atributos
    private int [] num;
    private int len;
    //constructor 
    Arreglo(int cant){
        len=cant+1;
        num= new int [len];//Crea el arreglo con la  cantidad de elementos
    }
    //metodos
    void asignarArreglo(int pos, int data){
        pos=pos+1;
        num[pos]=data;
    }
    int [] evaluarArreglo(){
        //Primera solución
        num[0]=num[len-1];
        num[len-1]=0;
        //Segunda solución
        /*int i;
        int aux = num[len-1];
        for (i = len -2 ; i>=0; i--){
            num [i]= num [i+1];
        }
        num [0]=aux;*/
        
        return num;
    }
}
class arregloDemo{
     public static void main (String[]Args){
     	//declaracion de variable
        int [] listanum= null;
        boolean eval=true;
        int size=0;
        int data=0;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        do{
            try{
                eval=true;
                System.out.print ("Ingrese cuantos numeros desea en el arreglo: ");
                size = Integer.parseInt(br.readLine());
                if (size <= 0){
                	eval=false;
                    System.out.println("Error...la cantidad de elemetos debe ser positivo o y no cero");
                }
            }
            catch(IOException e){
                eval=false;
                System.out.println("Ingrese un entero");    
            }
            catch(NumberFormatException e){
                 eval=false;
                 System.out.println("Error recuerde que debe ingresar un numero. Error tipo: "+e);
             }
        }while(eval==false);
        Arreglo objArreglo = new Arreglo(size);
        for(int i=0; i<size;i++){
            do{
                try{
                    eval=true;
                    System.out.print ("Ingrese un numero: ");
                    data = Integer.parseInt(br.readLine());
                    objArreglo.asignarArreglo(i,data);
                }
                catch(IOException e){
                    eval=false;
                    System.out.println("Ingrese un entero");    
                }
                catch(NumberFormatException e){
                     eval=false;
                     System.out.println("Error recuerde que debe ingresar un numero. Error tipo: "+e);
                 }
            }while(eval==false);
        }  
        listanum= objArreglo.evaluarArreglo();
        System.out.println("Lista de numeros enteros");
        for (int i=0; i<size; i++){
            System.out.print(" "+listanum[i]);
        }
                     
     }
}
