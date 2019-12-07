/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.  System.out.println("*");
 */
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class puenteEnClase {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese la distancia del puente");
        int p = teclado.nextInt();
        System.out.println("ingrese la altura de columnas");
        int c = teclado.nextInt();
        System.out.println("ingrese la distancia entre columnas");
        int e = teclado.nextInt();

        for (int dis = 0; dis < p; dis++) {
            System.out.print("_ ");

        }
        System.out.println("");

        for (int fila = 0; fila < c; fila++) {
            for (int col = 1; col <= p; col++) {
                if (col % (e + 1) == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
