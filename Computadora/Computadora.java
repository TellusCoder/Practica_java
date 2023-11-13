

class Computadora {
    // Atributos
    public float kg;

    //metodos
    public void asignar(float a) {
        kg = a;
    }

    public float convertir_libra() {
        float lb = 2.2046f;
        float r;
        r = (kg * lb);
        return r;

    }

}

/**
 * Progrma Principal
 */
class ComputadoraDemo {

    public static void main(String[] arg) {
        float result;
        //El objeto 
        Computadora obj = new Computadora();
        // Invocar o llamar los metodos de cada objeto
        obj.asignar(3.5f);
        result = obj.convertir_libra();
        System.out.println("El Peso en libra es = " + result + " lb ");
    }
}