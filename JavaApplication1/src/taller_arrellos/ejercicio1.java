/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_arrellos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor = 0;
        
        int arr[] = new int [10];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("ingresar el numero");
            arr [i] = teclado.nextInt();
            if (arr[i] > mayor) {
                
                mayor = arr[i];
                
            }
           
            
        }
         System.out.println("el numero mayor es; " +mayor);
    }
    
    
}
