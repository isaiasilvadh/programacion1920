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
public class Condicional {
    public static void main(String[] args) {
        System.out.println("Programa para determinar si una persona es mayor de edad");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();
        if ( edad >=18 ) {
            System.out.println("ERES MAYOR DE EDAD : tienes "+edad +" años");
        }else   {   //Caso que no se cumpla la primera condición
            System.out.println("AÚN ERES MENOR DE EDAD");
        }
        
                
    }
         
    
}
