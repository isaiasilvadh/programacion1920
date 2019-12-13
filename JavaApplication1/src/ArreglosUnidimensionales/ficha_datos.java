/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class ficha_datos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int edad [] = new int [5];
        //escritura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("Ingrese la edad del estudiante");
            
            edad[indice] = teclado.nextInt();
            
        }
        //operacion de lectura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println(edad[indice]);
            
        }
    }
    
}
