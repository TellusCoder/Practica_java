import java.io.*;
public class SrTerrenos {
    // Atributos
    private float anchura, longitud,cost_metr_cudrado;
    //metodos
    public void asignarTerrenos( float a,float l, float m) {
        anchura = a;
        longitud = l;
        cost_metr_cudrado = m;
    }
    public float calcularTerrenos() {
        float costo_terr;
        costo_terr = (anchura * longitud) * cost_metr_cudrado; // hacer el calculo de costo de un terreno
        return costo_terr;
    }
}
//Programa Principal
class App {
    public static void main(final String[] args) {
        // crea un buffer, permitiendo leer desde el teclado cadenas
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // declaracion de la variable
        float longitude, ancho, cost_met, costo; 
        // El objeto
        SrTerrenos obj = new SrTerrenos();
        try {
            System.out.println("Ingrese el ancho del terreno : ");
            // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
            ancho = Float.parseFloat(br.readLine()); 
            System.out.println("Ingrese la longitud del terreno : ");
            // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
            longitude = Float.parseFloat(br.readLine());
            System.out.println("Ingrese el costo del metro cuadrado del terreno : ");
            // aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a flotante.
            cost_met = Float.parseFloat(br.readLine());
            obj.asignarTerrenos(ancho, longitude, cost_met);
            costo = obj.calcularTerrenos();
            // presntamos el resultado del costo de un terreno
            System.out.println("El costo de un terreno es : " + costo);
        } 
        catch (IOException e) {
            System.out.print("Error...en la Entrada de datos" + "\n\n");
            System.out.print("El contenido de e:  " + e);
        } 
        catch ( NumberFormatException e) {
            System.out.print("Error...conversion de tipo de dato" +"\n\n");
            System.out.print("El contenido de e:  "+e);
        }
        System.out.print("\nFinalizó del programa");
    }
}
