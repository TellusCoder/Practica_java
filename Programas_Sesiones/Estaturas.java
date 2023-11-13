
//Dado un vector con las estaturas de 20 estudiantes identifique la estatura del más alto y en qué posición del vector se encuentra. contemplando que las estaturas podrían repetirse.
import java.io.*;

class Problema123 {
    float vect[] = new float[20];

    void asignar_vect(int i, float num) {
        vect[i] = num;
    }

    int[] calc_estatura_max() {
        int index_max[] = new int[20];
        float max = vect[0];
        for (int i = 1; i < 20; i++) {
            if (vect[i] > max) {
                max = vect[i];
            }
        }
        for (int i = 0; i < 20; i++) {
            if (vect[i] == max) {
                index_max[i] = i;
            } else {
                index_max[i] = -1;
            }
        }
        return index_max;
    }

    public float[] getVect() {
        return vect;
    }

    float mostrar_arr(int i) {
        return vect[i];
    }
}

class Principal_12 {
    public static void main(String[] args) {

        float numero = 0.0f;
        int i = 0;
        int[] index_max = new int[20];
        Problema123 obj = new Problema123();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < 20; i++) {
            try {
                System.out.println("Ingrese una estatura: ");
                numero = Float.parseFloat(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Error!! ingrese un valor numerico");
                i--;
            } catch (IOException e) {
                System.out.println("Error de entrada" + e);
                i--;
            }
            obj.asignar_vect(i, numero);
        }
        index_max = obj.calc_estatura_max();
        for (int x = 0; x < 20; x++) {
            if(index_max[x]!=-1)
            System.out.println("El numero maximo es: "+obj.mostrar_arr(index_max[x])+" y se encuentra en: " + index_max[x] + "\n");
        }
    }
}