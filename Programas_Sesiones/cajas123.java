/*Un distribuidor de juguetes ha hecho una excelente compra de 10,000 juguetes en cajas rectangulares de diversos tamaños. El distribuidor desea poner las cajas en esferas plásticas de brillantes colores y sellarlas como paquetes sorpresas. Las esferas son de 4 diámetros diferentes: 4,6, 8 y 10 pulgadas, por lo que para realizar todo en orden desea saber cuántas esferas de cada diámetro debe comprar. Puesto que la diagonal de una caja rectangular cuyas dimensiones son A, B y C está dada por 
...
d= a**2 + b**2 + c**2
y es, además, la dimensión mayor, el distribuidor debe calcular las longitudes de las diagonales de las cajas y determinar el número de las que son de 4 pulgadas o menos las comprendidas entre 4 y 6 pulgadas etc. Diseñe una aplicación que lea las dimensiones de cada caja, calcule la longitud de sus diagonales e imprima el número de esferas de cada tamaño que necesita comprar para empacar los juguetes.*/

import java.io.*;

class CantidaddeCajas {
    //tamaño de 5 solo debido a demostracion en la sesiones
    private float largo[] = new float[5];
    private float ancho[] = new float[5];
    private float profundidad[] = new float[5];
    private int cantidad[]=new int[5];
    void asignar(int i, float a, float b, float c, int cant) {
        largo[i] = a;
        ancho[i] = b;
        profundidad[i] = c;
        cantidad[i]=cant;
    }

    float[] calcularDiametro(){
        float[] diametro=new float[5];
        for(int i=0;i<5;i++){
            diametro[i]=(largo[i]*largo[i])+(ancho[i]*ancho[i])+(profundidad[i]*profundidad[i]);
        }
        return diametro;
    }

    public float[] getAncho() {
        return ancho;
    }

    public float[] getLargo() {
        return largo;
    }

    public float[] getProfundidad() {
        return profundidad;
    }

    int[] Calcular_rango(){
        int rango[]=new int[4];
        float[] diametro=new float[5];
        diametro=calcularDiametro();
        for(int i=0;i<5;i++){
            if(diametro[i]<4 && diametro[i]>0)
                rango[0]=rango[0]+cantidad[i];
            if(diametro[i]>=4 && diametro[i]<6)
                rango[1]+=cantidad[i];
            if(diametro[i]>=6 && diametro[i]<8)
                rango[2]+=cantidad[i];
            if(diametro[i]>=8 && diametro[i]<=10)
                rango[3]+=cantidad[i];
        }
        return rango;
    }
}
class Cajas_juguetes{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float largo=0;
        float ancho=0;
        float profundidad=0;
        int rangos[];
        int cant=0;
        int i=0;
        int lim=0;
        boolean error=true;
        CantidaddeCajas obj = new CantidaddeCajas();
        while(lim<10000){
        do {
            try {
                System.out.println("Ingrese el largo de la caja");
                largo = Float.parseFloat(br.readLine());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("error en la conversión de datos" + e);
                System.out.println("¡ERROR!Escriba solo numeros");
            } catch (IOException e) {
                System.out.println("error en la entrada de datos" + e);
            }
        } while (error == true);
        error=true;
        do {
            try {
                System.out.println("Ingrese el ancho de la caja");
                ancho = Float.parseFloat(br.readLine());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("error en la conversión de datos" + e);
                System.out.println("¡ERROR!Escriba solo numeros de horas");
            } catch (IOException e) {
                System.out.println("error en la entrada de datos" + e);
            }
        } while (error == true);
        error=true;
        do {
            try {
                System.out.println("Ingrese la profundidad de la caja");
                profundidad = Float.parseFloat(br.readLine());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("error en la conversión de datos" + e);
                System.out.println("¡ERROR!Escriba solo numeros de horas");
            } catch (IOException e) {
                System.out.println("error en la entrada de datos" + e);
            }
        } while (error == true);
        error=true;
        do {
            try {
                System.out.println("Cuantas cajas tienen esas dimensiones?");
                cant = Integer.parseInt(br.readLine());
                error = false;
                if(cant>10000){
                    System.out.println("Ha ingresado mas de 10,000 cajas\n");
                    error=true;
                }
            } catch (NumberFormatException e) {
                System.out.println("error en la conversión de datos" + e);
                System.out.println("¡ERROR!Escriba solo numeros de horas");
            } catch (IOException e) {
                System.out.println("error en la entrada de datos" + e);
            }
        } while (error == true);
        error=true;
        obj.asignar(i, ancho, largo, profundidad, cant);
        lim+=cant;
        i++;
    }
    rangos=obj.Calcular_rango();
    System.out.println("Cantidad de cajas menor a 4 pulgadas: "+rangos[0]);
    System.out.println("Cantidad de cajas entre 4 y 6: "+rangos[1]);
    System.out.println("Cantidad de cajas entre 6 y 8: "+rangos[2]);
    System.out.println("Cantidad de cajas entre 8 y 10: "+rangos[3]);
}
}