import java.io.*;
public class NElemetos{
    private int[] x; // Declarar el arreglo x
    private int limelem;
    NElemetos (int n){
        limelem = n+1;
        x = new int [limelem];//Crea el arreglo con la  cantidad de elementos
    }
    void asignarElemetos(int i,int data){
        i=i+1;
        x[i]=data;
    }
    int [] mostrarElemetos(){
        x[0]=x [limelem-1];
        x[limelem-1]=0;
        
       /* Segunda solucion
        int i;
        int aux = x [len-1];
        for (i = len -1 ; i<=0; i--){
            x [i]= x [i-1];
        }
        x[0]=aux;*/
        return x;
    }

}
class app {
    public static void main(String[] args) {
        //declarcion de variable
        int i,data;
        int [] numeros = null ;
        int n =0;
        boolean error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            try{
                error = false;   
                System.out.print("\nEntre la cantidad de elementos que necesita el arreglo: ");
                n=Integer.parseInt(br.readLine());
                if (n <= 0){
                    error=true;
                    System.out.println("Error...la cantidad de elemetos debe ser positivo o y no cero");
                }
            }
             catch(IOException e){
                   System.out.print("\nError...de entrada de datos");
                   error=true;
                   } 
             catch(NumberFormatException e){
                   System.out.print("\nError...de conversión de datos");
                   error=true;
                  }       	
        }while(error==true);
        NElemetos obj = new NElemetos (n);
        for (i=0; i<n; i++){
            try{   
                System.out.print ("\nIngrese el numero "+i+" es :  ");
                data =Integer.parseInt(br.readLine());
                obj.asignarElemetos(i,data);
            }  
            catch(IOException e){
                System.out.print("\nError...de entrada de datos");
                --i;
            } 
            catch(NumberFormatException e){
                System.out.print("\nError...de conversión de datos");
                --i;
            }       	
        }
        numeros = obj.mostrarElemetos();
        System.out.print("\n Vector desplazaso es :\n");
        for (i =0; i<n; i++){
            System.out.println("Número "+i+": "+numeros[i]);
        }

    }
}
