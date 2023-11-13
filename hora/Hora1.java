/**
 * @(#)ejmplo1.java
 *
 *
 * @author 
 * @version 1.00 2020/9/4
 */

class Hora1 {
    
    public int horas;
    public void asignarTime(int time){
        horas=time;
    } 
    public int convertirDias(){
        int dias;
        dias= horas/24;
        return dias;
    }    
    public int convertirMinutos() {
        int minutos;
        minutos= horas*60;
        return minutos;
    } 
    public int convertirSegundos(){
        int segundos;
        segundos=horas*3600;
        return segundos;
    }
}

 

class horaDemo{
    
    public static void main(String[] args) {
        // declaracion de las variables
        int horas= 15;
        int dias;
        int minutos,segundos;
        //El objeto
        Hora1 obj = new Hora1();
        //aqui asignamos la cantidad de horas a trabajar
        obj.asignarTime(horas);
        //aqui convertimos las horas a dias, usando este metodo del objeto
        dias= obj.convertirDias();
        //aqui convertimos las horas en minutos, usando este metodo del objeto
        minutos= obj.convertirMinutos();
        //aqui convertimos las horas en segundos, usando este metodo del objeto
        segundos= obj.convertirSegundos();
        //presentacion de los resultados
        System.out.println("La conversion de: "+ horas+" es igual a: "+ dias+ " dias; "+ minutos+" minutos; " + segundos+" segundos" );
            
    }
    
}
