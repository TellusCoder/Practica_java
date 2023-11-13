/**
 * @(#)Arreglo.java
 *
 *
 * @author:
 *         Victor Cerrud
 * @version 1.00 2020/10/15
 */

public class Arreglo{
    private int [] par = new int [6];
    void  asignarcontiene () {
    	int i;
        for (i=0 ;i<=6; i++){
            par[i]=(i+1)*2;
        }
    }
    int [] retornar_par (){
    	return par;
    }
}
class App {
    public static void main(String[] args) {
        int i;
        Arreglo obj = new Arreglo ();
        int[]respu = null;
        obj.asignarcontiene ();
        respu = obj.retornar_par ();
        for (i=0; i<6; i++){
            System.out.println ("  x["+i+"]= "+ respu [i]);  
        } 
    }
}
