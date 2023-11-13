/**
 * @(#)BicicletaDemo.java
 *
 *
 * @author Victor Cerrud
 * @version 1.00 2020/8/24
 */

public class BicicletaDemo  {
        
   public static  void main(String[] args) {
    
        // Crear dos bicicletas diferentes y nuevas
// objetos
Bicicleta bici1 = new Bicicleta();
Bicicleta bici2 = new  Bicicleta();

// Invocar o llamar los metodos de cada objeto
bici1.cambiarCadencia(50);
bici1.pedalear(10);
bici1.hacerCambio(2);
bici1.mostrarEstado();

bici2.cambiarCadencia(50);
bici2.pedalear(10);
bici2.hacerCambio(2);
bici2.cambiarCadencia(40);
bici2.pedalear(10);
bici2.hacerCambio(3);
bici2.mostrarEstado();

  }
}
