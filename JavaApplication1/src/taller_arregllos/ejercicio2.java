/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_arregllos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class ejercicio2 {
    public static void main(String[] args) {
    String[] arreglo1 = {"a", "b", "c", "d", "e", "f"};
        String[] arreglo2 = {"g", "h", "i", "j", "k"};
        String[] salida = new String[arreglo1.length + arreglo2.length];
        int aux = 0;
        // Proceso
        for (int i = 0; i < salida.length; i++) {
            if (i < arreglo1.length) {
                salida[i] = arreglo1[i];
            } else {
                salida[i] = arreglo2[aux];
                aux++;
            }
        }
        // Salida
        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + ", ");
        }
    }
}
