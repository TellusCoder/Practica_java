
import java.io.*;
public class EstaturasEstu{
    float   x []= new float [20];
    void asignar (int i, Float size){
        x[i]=size;
    }
    float estaturaAlto (){
        float altura;
        int i ;
        altura = x[0];
        for (i=0; i <20; i++){
            if (x[i]>altura){
                altura = x[i];
             }  
         }
         return altura;
    }
    int [] posicionVector() {
        float altura;
        int i;
        int vector [] = new int [20] ;
        altura = x[0];
        for (i=0; i <20; i++){
            if (x[i]>altura){
                altura = x[i];
             }  
        }
        for (i=0; i <20; i++){
            if (x[i] == altura){
                vector[i] = i;
             }
             else {
                 vector [i]=-1;
             }
         }
         return vector;
    }

}

class InnerEstaturasEstu {
    public static void main(String[] args) {
        // declaracion de varaible
        float size =0.0f;
        int i=0;
        int [] resuelt = new int [20]; 
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        EstaturasEstu obj = new EstaturasEstu ();
        for (i=0; i<20; i++){
            try {
                System.out.print ("Ingrese la altura de estudiante  "+i+": ");
                size = Float.parseFloat(br.readLine());
                if (size< 0) {
                    System.out.println("Error recuerde que debe ingresar un numero positivos. Error tipo: ");
                    --i;
                }
                else{
                    obj.asignar(i,size);
                } 
            } 
            catch (IOException e) {
                System.out.println("Error recuerde que debe ingresar un numero. Error tipo: "+e);
                --i;
            }
            catch ( NumberFormatException e){
                --i;
                System.out.println("Error recuerde que debe ingresar un numero. Error tipo: "+e);
            }
        }
        resuelt =obj.posicionVector();
        for(i=0; i<20; i++){
            if (resuelt[i]!=-1 ) {
                System.out.println("\nLa estatura mas alto de estudiante es :  "+obj.estaturaAlto ()+" Y se encuentra en la posición : "+resuelt[i]);
            }
        }
                  
    }

}