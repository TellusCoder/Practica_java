//Identificar el uso de arreglos de una dimensi�n para el almacenamiento y acceso r�pido de los datos. 
//Resolver problemas aplicando arreglos de una dimensi�n. 

//Escriba una aplicaci�n que lea 25 n�meros n1, n2, ..., n25 e imprimir en l�neas separadas cada par de n�meros cuya suma sea 75.
import java.io.*;
class Suma{
  private int [] vector= new int [5];
  void asignar(int t, int a){
    vector[a]=t; 
  }  
  
  int[] sumapar(int a){
  int r=0;
  int [] vec = new int [2];
      r=vector[a]+vector[a+1];
    if(r==75){
    vec[0]=a;
    vec[1]=a+1;
    return vec;
    }else{
      vec[0]=-1;
      vec[1]=-1;
      return vec;
    }
    
  }
}
  
class Numeros{
  public static void main(String[] args) {
    //zona de declarativas
  int w=0;
  int vec[];
  int a;
    BufferedReader b= new  BufferedReader(new InputStreamReader(System.in));
    Suma p = new Suma();
    //zona de instrucciones
    for(a=0;a<=4;a++){
  System.out.println("Ingrese los números");
  try{
  w=Integer.parseInt(b.readLine());
  p.asignar(w,a);
  }
  catch(NumberFormatException e){
    System.out.println("error en la conversión"+e);
  }
  catch(IOException e){
    System.out.println("error en la entrada de datos"+e);
  }}
  for(a=0;a<=3;a++){
  vec=p.sumapar(a);
  if(vec[0]!=-1 && vec[1]!=-1)
  System.out.println("Los pares de números con suma de 75 son: "+vec[0]+","+vec[1]);
  }

    }
}