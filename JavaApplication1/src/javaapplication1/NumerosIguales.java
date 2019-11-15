/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class NumerosIguales {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar segundo numero");
        int num2 = teclado.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los numeros iguales");
            
        }else{
            System.out.println("Los numeros no son iguales");
        }
        
     
        
    }
    
}
