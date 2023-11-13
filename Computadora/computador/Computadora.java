/**
 * @(#)Computadora.java
 *
 *
 * @author Carlos Fontal and Victor Cerrud
 * @version 1.00 2020/8/25
 */

class Computadora {
    //atributos
    public float peso ;
      
      // metodos
    public void asignar (float Kg) {
        peso = Kg;
    }
    public float convertir_libra() {
        float lb = 2.2046f;
        float r;
        r =  (peso * lb);
        return  r;

    }
}

/**
 * Progrma Principal
 */
 
 class ComputadoraDemo {
 	
    public static void main(String[] args) {
        // Declaracion  de la variable 
          float result;
        //El objeto 
         Computadora obj = new Computadora();
        // Invocar o llamar los metodos de cada objeto
        obj.asignar (3.5f);
        result= obj.convertir_libra ();
        System.out.println("El Peso en libra es = "+result+" lb");
    } // fin del metodo main
}//fin de la clase ComputadoraDemo
