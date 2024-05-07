import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Fechas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la primera fecha en formato DD/MM/AAAA por favor: ");
        String f1 = entrada.next();
        System.out.println("Ingrese la segunda fecha en formato DD/MM/AAAA por favor: ");
        String f2 = entrada.next();
        int f1dia = parseInt(f1.substring(0,2));
        int f1mes = parseInt(f1.substring(3,5));
        int f1anio = parseInt(f1.substring(6));
        int f2dia = parseInt(f2.substring(0,2));
        int f2mes = parseInt(f2.substring(3,5));
        int f2anio = parseInt(f2.substring(6));

        if(f1anio<f2anio){
            System.out.println("persona 1 es mayor");
        }else{
            if(f1anio>f2anio){
                System.out.println("persona 2 es mayor");
            }else{
                if(f1mes<f2mes){
                    System.out.println("persona 1 es mayor");
                }else{
                    if(f1mes>f2mes){
                        System.out.println("persona 2 es mayor");
                    }else{
                        if(f1dia<f2dia){
                            System.out.println("persona 1 es mayor");
                        }else{
                            if(f1dia>f2dia){
                                System.out.println("persona 2 es mayor");
                            }else{
                                System.out.println("tienen la misma edad");
                            }
                        }
                    }
                }
            }
        }

    }
}