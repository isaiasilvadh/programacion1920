/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_Arreglos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[50];
        int aux = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println("ingresar el número");
            num[i] = teclado.nextInt();
        }

        for (int i = 0; i < num.length-1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] < num[j]) {
                    aux = num[i];
                    num[i] = num[j];
                    num[j] = aux;

                }

            }

        }
        System.out.println("-------------");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            
        }

    }
}
