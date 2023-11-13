/**
 * @(#)Suma.java
 *
 *
 * @author 
 * @version 1.00 2020/9/3
 */
 
public class Suma{
	//Atributo
	private int n1;
	private int n2;
	
	public void asignarVariable (int x, int y){
		n1 = x;
		n2 = y;
	}		
	public int calcularSuma (){
		int resul_sum ;
		resul_sum = n1 + n2;
		return resul_sum ;
		
	}
	public double calcularPromedio (){
		double resul_prom;
		resul_prom =  ( n1 + n2) /2 ;
		return resul_prom ;	
	}					
	
}
  public class SumaProm {
        
   
    public static void main(String[] args) {
    	Suma sumpro = new Suma ();
    	 
    	sumpro.asignarVariable(90,80);
    		
    	System.out.println ("Suma = "+sumpro.calcularSuma ());
    	
    	System.out.println ("Promedio = "+sumpro.calcularPromedio());
    	
       
    }
}
