
public class CantidadSilla {
    //atributos
    int mesa, maquinas;
    public void asignarCantidad(int chairs,int machine ) {
        mesa = chairs;
        maquinas = machine;
    }
    public int CalcularSillas() {
        mesa *= maquinas;
        return mesa;  
    }
}
class AppDemo{
    public static void main(String[] args) {
        int result;
        CantidadSilla obj = new CantidadSilla();
        obj.asignarCantidad (10,4);
        result = obj.CalcularSillas();
        System.out.println("La cantidad de silla en el laboratorio es: "+result);
    }
}
