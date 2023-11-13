/**
 * @(#)HoraTiempo.java
 *
 *
 * @author 
 * @version 1.00 2020/9/3
 */
 public class Hora {
 	private int hora ;
 	 public void asignarTime  (int h){
 	 	hora = h;
 	 }
 	public int convertirMinutos (){
 		int result_minu;
 		result_minu = hora*60;
 		return result_minu;	
 	}
 	public int convertirSegundos () {
 		int result_segun ;
 		result_segun = hora *3600;
 		return result_segun;	
 	}
 	public int convertirDia (){
 		int result_dia;
 		result_dia = hora /24 ;
 		return result_dia ;			
 	}
 }

 class HoraTiempo {
    public static void main(String[] args) {
        Hora tiempo = new Hora ();
        tiempo.asignarTime (48);
        
        System.out.println ("Minutos = "+tiempo.convertirMinutos ()+" mini");
    	System.out.println ("Segundos = "+tiempo.convertirSegundos()+" s");
    	System.out.println ("Dias = "+tiempo.convertirDia());
    }
}
