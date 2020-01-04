/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class par_metodo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar numero a determinar");
        int num = teclado.nextInt();
       // determinar_par(num);
        String msg = determinar_par2(num); 
        System.out.println(msg);

    }

    /**
     * es un metodo que si retorna valor
     * Determina si un numero es par o no
     * @param num 
     * @return 
     */
    public static String determinar_par2(int num) {
        String mensaje = "";
        if (num % 2 == 0) {
            mensaje = "es par";
        } else {
            mensaje = "No es par";

    
        }
        return mensaje ;
    }
    
}
/**
 * Es un metodo que no retorna 
 * Determina si un numero es par o no
 *
 * @param num es el numero a evaluar
 */
   /**  public static void determinar_par(int num) {
        if (num % 2 == 0 ) {
            System.out.println("el numero es par");
            
        }else
            System.out.println("no es par");

    }

}
**/