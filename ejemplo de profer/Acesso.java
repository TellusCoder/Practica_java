/**
 * @(#)Acesso.java
 *
 *
 * @author 
 * @version 1.00 2020/9/5
 */

// Acceso por defecto, publico, privado y protegido
// a los miembros de la clase (datos y metodos)
class Acceso{ 
            char caracter;
  public    String palabra;
  private   int num;
  protected int num2;

  void asignar (String p, int n, int n2, char c) {
  	     palabra = p;
         num = n;
         num2 = n2;
         caracter = c; }

  public char mostrar_caracter ()  { 
  	     return caracter;}//el atributo caracter 
      	                  //es visible en la clase
  
  protected String mostrar_palabra (){
         return palabra;}//el atributo palabra
                         //es visible en la clase
 
  int mostrar_num (){
         return num; }//el atributo num
                      //es visible en la clase
  
   int mostrar_num2 (){
         return num2;}//el atributo num2
                   //es visible en la clase
 
}


class Acceso_miembros{
      public static void main(String [] args){    
         Acceso ob = new Acceso();

         ob.asignar ("universidad",1,9,'u');
         // el metodo asignar()es visible para el objeto

         System.out.print("\nCaracter="+ob.mostrar_caracter());
         //el metodo imprime_caracter()es visible para el objeto

         System.out.print("\nPalabra="+ob.mostrar_palabra());
         //el metodo imprime _palabra()es visible para el objeto

         System.out.print("\nNumero"+ob.mostrar_num());
         //el metodo imprime_num()es visible para el objeto

         System.out.print("\nNumero 2="+ob.mostrar_num2());
         //el metodo imprime_num2()no es visible para el objeto porque es privado


         //por favor despues del error en tiempo de compilacion
         //elimine el modo de acceso private
  
  
 }}
