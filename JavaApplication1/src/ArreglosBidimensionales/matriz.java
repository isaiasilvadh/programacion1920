/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosBidimensionales;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class matriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR Y ESCRIBIR EN UNA MATRIZ");
        System.out.println("ingresar numero de filas de la matriz ");
        int filas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("ingresar numero de las columnas de la matriz");
        int colum = teclado.nextInt();
        teclado.nextLine();

        String nombres[][] = new String[filas][colum];
        System.out.println("escritura de los elementos de la matriz");
        for (int fil = 0; fil < nombres.length; fil++) {
            int tam_col = nombres[fil].length;
            for (int col = 0; col < tam_col; col++) {
                System.out.println("Ingresar un valor: ");
                String valor = teclado.nextLine();
               
                nombres[fil][col] = valor;

            }

        }
        System.out.println("lectura de los elementos de la matriz");
        //vamos a recorrer la matriz, filas y columnas
        for (int fil = 0; fil < nombres.length; fil++) {
            int tam_col = nombres[fil].length;
            for (int col = 0; col < tam_col; col++) {
                System.out.print(nombres[fil][col] + "\t");

            }
            System.out.println("");
        }

    }

}
