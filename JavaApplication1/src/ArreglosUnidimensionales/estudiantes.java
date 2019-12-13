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
public class estudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nom [] = new String [5];
        String edad[] = new String[5];
        String un [] = new String [5];
        String cel [] = new String [5];
        
        
        //escritura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("Ingrese el nombres del estudiantes");
            nom[indice] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edad[indice] = teclado.nextLine();
            System.out.println("Ingrese la universidad del estudiante");
            un[indice] = teclado.nextLine();
            System.out.println("Ingrese el numero de celular del estudiante");
            cel[indice] = teclado.nextLine();

        }
        //operacion de lectura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("nombre: " +nom[indice]);
            System.out.println("Edad: " +edad[indice]);
            System.out.println("Universidad: "+un[indice]);
            System.out.println("celular: "+cel[indice]);
            
            System.out.println("//");

        }

    }

}
