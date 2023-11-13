import java.io.*;
public class Numeros{
    private int [] num = new int [25];
    void asignarNumeros(int i, int data){
        num [i] =data;
    }
    int [] sumtotal(int i){
        int result=0;
        int [] total = new int [4];
        for (i=0; i<25; i++){
            result = num[i] + num [i+1];
            if (result == 75){
                total [i]= num [i];
            }
            else{
                total [0]=-1;
                total [1]= -1;
            }  
        }
        return total;
    } 
}
//
class AppNumeros {
    public static void main(String[] args) {
        int i,data;
        int vresult [];
        boolean error;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Numeros obj= new Numeros ();
        for (i=0; i<25; i++){
            do{
                try{
                    error = false;   
                    System.out.print ("\nIngrese el numero "+i+" es :  ");
                    data =Integer.parseInt(br.readLine());
                    obj.asignarNumeros(i,data);
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
        }
        for (i=0; i<25; i++){
            vresult=obj.sumtotal(i);
            if (vresult [0]!=-1 & vresult [1]!=-1 ) {
                System.out.println("\nLa Suma  es :  "+vresult[0]+","+vresult[1]);
            }
        } 
    }
}