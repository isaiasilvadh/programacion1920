/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoBimestral;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class proyecto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String a [] = new String [7];
        String b [] = new String [7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingresar datos de la primera ecuacion de la siguiente forma, ejemplo: 2x+3y=3");
            a[i] = teclado.nextLine();
            System.out.println("Ingresar datos de la segunda ecuacion de la siguiente forma, ejemplo: 2x+3y=3");
            b[i] = teclado.nextLine();
        }
    }
    
}