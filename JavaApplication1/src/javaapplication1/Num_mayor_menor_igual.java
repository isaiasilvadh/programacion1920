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
public class Num_mayor_menor_igual {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingresar segundo numero");
        int num2 = teclado.nextInt();
        
           if (num1 == num2) {
                System.out.println("Los numeros son iguales");
            
        }else{
        
        if (num1>num2) {
            System.out.println("El numero: " +num1 +"es el mayor");
            
        }else {
            System.out.println("El numero: "+ num2 +"es el mayor");
        }
           }
            if (num1<num2) {
                System.out.println("el numero: "+num1+"es el menor");
                
            }else if(num2<num1) {
                
                System.out.println("El numero: " +num2 +"es el menor");
        }
         
    }
        
        
}

