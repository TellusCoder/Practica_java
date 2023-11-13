/**
 * @(#)Bicicleta.java
 *
 *
 * @author 
 * @version 1.00 2020/8/24
 */
package Interface;

interface Bicicleta {
// wheel revolutions per minute
void cambiarCadencia(int nuevoValor);
void hacerCambio(int nuevoValor);
void pedalear(int incremento);
void frenar(int decremento);
}
 class ACMEBicicleta implements Bicicleta {
        
  int cadencia = 0; // nota: la cadencia es la velocidad de pedaleo
  int velocidad = 0;
  int cambio = 1;

  public void cambiarCadencia(int nuevoValor) {
    cadencia = nuevoValor;
  }

 public  void hacerCambio(int nuevoCambio) {
    cambio = nuevoCambio;
  }

 public  void pedalear(int incremento) {
    velocidad = velocidad + incremento;
  }

   public void frenar(int decremento) {
    velocidad = velocidad - decremento;
  }

   void mostrarEstado() {
    System.out.println("cadencia:" +
    	 cadencia + " velocidad:" + 
    	 	velocidad + " cambio:" + cambio);
  }
}
