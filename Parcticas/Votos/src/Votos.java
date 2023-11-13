import java.io.*;


public class Votos {
    private int v;
    public void asigarVotos(int voto) {
        v = voto;  
    }
    public String cadena () {
        String resul = null;
        switch (v) {
            case 1:
                resul = "PRD";
     
                break;
            case 2: 
                resul ="CD";
      
                break;
            case 3: 
                resul = "Panameñista";
    
                break;        
            default:
                resul = "Independiente";
  
                break;
        }
        return resul;
        } 
    public int partidos() {
        int  conteo= 0 ;
        switch (v) {
            case 1: 
                conteo +=v ;
                break;
            case 2: 
               conteo += v ;
                break;
            case 3: 
                conteo +=v;
                break;        
            default:
                conteo +=v;
                break;
        }
        return conteo;
       
        }  
    public int conteoVotos() {
        int result = 0, acum=0;
        result += v;
        acum = acum +result;
        return acum;
    }

}

 class App {
    public static void main(String[] args) throws Exception {
        //decaraciones de variables
        int voto = 0;
        int conteo = 0, result =0;
        boolean error,exit = false ;
        char command;
        String p;
        Votos obj = new Votos();
        BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
        do {
            
            do {
                error = false;
                try {
                    System.out.println("\nIngrese su voto  ");
                    System.out.println("- 1 PRD");
                    System.out.println("- 2 CD");
                    System.out.println("- 3 Panameñista");
                    System.out.println("- 4 Independiente");
                   //aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a char.
                    voto = Integer.parseInt(br.readLine());
                    if (voto != 1 & voto != 2 & voto != 3 & voto != 4  ) {
                        error=true; 
                        System.out.println(" Error... el tipo de dato ingresado no es el correcto");
                    }
   
                }
                catch (IOException e) {
                    error =true;
                    System.out.println("Error...en la Entrada de datos"); 
                    System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
                }
                catch (NumberFormatException e) {
                    error =true;
                    System.out.println("Error...en la Entrada de datos"); 
                    System.out.println("El contenido del mensaje de error:  "+e+"\n\n"); 
                }
            } while (error ==true);
            obj.asigarVotos(voto);
            p =obj.cadena();
            conteo = obj.partidos();
            result= obj.conteoVotos();
            System.out.println("El partido es : "+ p + " : "+ conteo +" votos.");
           
            //finalmente, le consultamos al usuario si desea continuar o salir
        	do{
                try{
                    error=false;
                    //imprimimos las opciones disponibles
                    System.out.println("Ingrese uno de los siguientes comandos para continuar: ");
                    System.out.println("- c para continuar calculando ventas");
                    System.out.println("- s para salir");
                   //aqui leemos el valor ingresado por el usuario, entonces procedemos a convertirlo a char.
                   command = (char)br.read();
                   // para evitar si lee algun enter.
                   br.skip(1);
                   //en caso que escribiera el caracter 'c', se continua
                   if(command=='c'){
                       error=false;
                       exit=false;
                   }
                   //en caso que escribiera el caracter 's', sale
                   else 
                       if(command == 's'){
                           error=false;
                           exit=true;
                       
                       }
                       // si escribe otro caracter, para que el usuario intente denuevo.
                       else{
                           error=true;
                           exit=false;
                       }
                       br.skip(1);
                }
                //aqui manejamos las excepciones
                catch(IOException e){
                    error=true;
                    System.out.println("Error...conversion de tipo de dato");
                      System.out.println("El contenido del mensaje de error:  "+e); 
                }
            }while(error==true);
        }while (exit==false);
        System.out.println("Total de votos contabilizados: "+result);
    }
}


