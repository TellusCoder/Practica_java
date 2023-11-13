/**
 * @(#)Bicicleta.java
 *
 *
 * @author Victor Cerrud
 * @version 1.00 2020/8/24
 */

public class Bicicleta {
        
  int cadencia = 0; // nota: la cadencia es la velocidad de pedaleo
  int velocidad = 0;
  int cambio = 1;

   void cambiarCadencia(int nuevoValor) {
    cadencia = nuevoValor;
  }

   void hacerCambio(int nuevoCambio) {
    cambio = nuevoCambio;
  }

   void pedalear(int incremento) {
    velocidad = velocidad + incremento;
  }

   void frenar(int decremento) {
    velocidad = velocidad - decremento;
  }

   void mostrarEstado() {
    System.out.println("cadencia:" +
    	 cadencia + " velocidad:" + 
    	 	velocidad + " cambio:" + cambio);
  }
}
