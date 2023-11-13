/*Cargue dos arreglos de 3 elementos positivos (sin contar el 0) y encuentre e imprima los numeros en comun entre los dos arreglos*/

import java.io.*;

class ArreglosRep {
  
  private int arreglo2[] = new int[3];
  private int arreglo1[] = new int[3];

  void asignar_arr1(int x, int num1) {
    arreglo1[x] = num1;
  }

  void asignar_arr2(int x, int num2) {
    arreglo2[x] = num2;
  }

  float mostrar_arreglo1(int i) {
    return arreglo1[i];
  }

  float mostrar_arreglo2(int i) {
    return arreglo2[i];
  }

  public int[] getArreglo1() {
    return arreglo1;
  }

  public int[] getArreglo2() {
    return arreglo2;
  }

  int[] Encontrar_Repetidos() {
    int repetidos[] = new int[4];
    repetidos[0] = -1;
    for (int i = 0; i < 3; i++) {
      for (int x = 0; x < 3; x++) {
        if (arreglo1[i] == arreglo2[x]) {
          repetidos[i + 1] = arreglo2[x];
          repetidos[0] = 1;
        }
      }
    }
    return repetidos;
  }
}

// Programa Principal
class Numeros_Repetidos {
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num1;
    int num2;
    int repetidos[];
    int i;
    ArreglosRep obj = new ArreglosRep();
    for (i = 0; i < 3; i++) {
      try {
        System.out.println("Ingrese los datos del primer arreglo");
        num1 = Integer.parseInt(br.readLine());
        obj.asignar_arr1(i, num1);
      } catch (IOException x) {
        System.out.println("Error en la entrada de datos, Vuelva a ingresar el numero" + x);
        i--;
      } catch (NumberFormatException x) {
        System.out.println("Error!! Por Favor Ingrese un valor numerico\n" + x + "\n\n ");
        i--;
      }
    }
    for (i = 0; i < 3; i++) {
      try {
        System.out.println("Ingrese los datos del segundo arreglo");
        num2 = Integer.parseInt(br.readLine());
        obj.asignar_arr2(i, num2);
      } catch (IOException x) {
        System.out.println("Error en la entrada de datos, Vuelva a ingresar el numero" + x);
        i--;
      } catch (NumberFormatException x) {
        System.out.println("Error en la conversion de datos" + x);
        i--;
      }
    }
    repetidos = obj.Encontrar_Repetidos();
    System.out.println("\nArreglo#1:\tArreglo #2");
    for (i = 0; i < 3; i++) {
      System.out.println(obj.mostrar_arreglo1(i) + "\t\t " + obj.mostrar_arreglo2(i));
    }
    if (repetidos[0] == -1)
      System.out.println("No hay numeros repetidos");
    else {
      System.out.print("\n");
      for (i = 1; i < 4; i++) {
        if (repetidos[i] != 0)
          System.out.println(repetidos[i] + " es un numero repetido");
      }
    }
  }
}