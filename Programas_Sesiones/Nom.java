
/** Escriba un programa que lea 3 nombres de trabajadores una empresa, cuantas horas trabajaron en el mes y cual es la cantida de años que le faltan para jubilarse*/
import java.io.*;

class Procesos2 {

    private String nom[] = new String[3];
    private int c[] = new int[3];
    private int f[] = new int[3];
    private int sex[] = new int[3];
    private int co[] = new int[3];

    void asignar_nombres(int a, String b) {
        nom[a] = b;
    }

    void asignar_horas_de_trabajo(int a, int b) {
        c[a] = b;
    }

    void asignar_años_jubi(int a, int b) {
        f[a] = b;
    }

    void asignar_sexos(int a, int b) {
        sex[a] = b;
    }

    int[] calcular_jubi() {
        for (int i = 0; i < 3; i++) {
            if (f[i] >= 57 && sex[i] == 1) {
                f[i] = f[i] - 57;
                co[i] = 0;
            } else if (f[i] >= 62 && sex[i] == 2) {
                f[i] = f[i] - 62;
                co[i] = 0;
            } else if (f[i] < 57 && sex[i] == 1) {
                f[i] = 57 - f[i];
                co[i] = 1;
            } else if (f[i] < 62 && sex[i] == 2) {
                f[i] = 62 - f[i];
                co[i] = 1;
            }
        }
        return f;
    }

    String mostrar_nom(int a) {
        return nom[a];
    }

    int mostrar_horas_de_trabajo(int a) {
        return c[a];
    }

    int mostrar_sexos(int a) {
        return sex[a];
    }

    int mostrar_co(int a) {
        return co[a];
    }

    String[] get_nom() {
        return nom;
    }

    int[] get_c() {
        return c;
    }

    int[] get_f() {
        return f;
    }

    int[] get_sexo() {
        return sex;
    }

    int[] get_co() {
        return co;
    }
}

class Nom {
    public static void main(String[] args) {
        // zona de declarativas
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        Procesos2 h = new Procesos2();
        int codsex = 3;
        String nom = "hg";
        int horas = 0;
        int años = 0;
        boolean error = true;
        int[] ser;
        // zona de instrucciones
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("ingrese su nombre: ");
                nom = b.readLine();
            } catch (IOException e) {
                System.out.println("error en la entrada de datos" + e);
            }

            do {
                try {
                    System.out.println("ingrese su sexo \n 1)Femenino\n 2)Masculino ");
                    codsex = Integer.parseInt(b.readLine());
                    if (codsex == 1 || codsex == 2)
                        error = false;
                    else
                        System.out.println("!!ERROR¡¡, Ingrese si es Masculino o Femenino por favor");
                } catch (IOException e) {
                    System.out.println("error en la entrada de datos" + e);
                } catch (NumberFormatException e) {
                    System.out.println("error en la conversión de datos" + e);
                    System.out.println("¡ERROR!Escriba solo la opción 1 o 2");
                }
            } while (error == true);
            error = true;
            h.asignar_nombres(i, nom);
            h.asignar_sexos(i, codsex);
            do {
                try {
                    System.out.println("Ingrese la cantidad de horas trabajadas");
                    horas = Integer.parseInt(b.readLine());
                    error = false;
                } catch (NumberFormatException e) {
                    System.out.println("error en la conversión de datos" + e);
                    System.out.println("¡ERROR!Escriba solo numeros de horas");
                } catch (IOException e) {
                    System.out.println("error en la entrada de datos" + e);
                }
            } while (error == true);
            error = true;
            h.asignar_horas_de_trabajo(i, horas);
            do {
                try {
                    System.out.println("Ingrese su edad");
                    años = Integer.parseInt(b.readLine());
                    error = false;
                } catch (NumberFormatException e) {
                    System.out.println("error en la conversión de datos" + e);
                    System.out.println("¡ERROR!Escriba solo los años en numeros");
                } catch (IOException e) {
                    System.out.println("error en la entrada de datos" + e);
                }
            } while (error == true);
            error = true;
            h.asignar_años_jubi(i, años);
        }
        ser = h.calcular_jubi();
        for (int i = 0; i < 3; i++) {
            if (h.mostrar_co(i) == 0 && h.mostrar_sexos(i) == 1 || h.mostrar_co(i) == 0 && h.mostrar_sexos(i) == 2) {
                System.out.println("Hola " + h.mostrar_nom(i) + " está jubilado por :" + ser[i] + " años.");
                System.out.println(" lleva " + h.mostrar_horas_de_trabajo(i) + " horas trabajadas este mes");
            } else if (h.mostrar_co(i) == 1 && h.mostrar_sexos(i) == 1) {
                System.out.println("Hola " + h.mostrar_nom(i) + " le faltan:" + ser[i]
                        + " años para jubilarse, la jubilación Femenina es a los 57 años ");
                System.out.println(" lleva " + h.mostrar_horas_de_trabajo(i) + " horas trabajadas este mes");
            } else if (h.mostrar_co(i) == 1 && h.mostrar_sexos(i) == 2) {
                System.out.println("Hola " + h.mostrar_nom(i) + " le faltan:" + ser[i]
                        + " años para jubilarse, la jubilación Masculina es a los 62 años");
                System.out.println(" lleva " + h.mostrar_horas_de_trabajo(i) + " horas trabajadas este mes");
            }
        }
    }
}