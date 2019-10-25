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
public class EntradaDatos {
    
   
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner (System.in);
        /*
        System.out.println("Ingresa tu nombre: ");
        String mi_nombre = teclado.nextLine();
        System.out.println("El nombre ingresado es: "+mi_nombre);
        
        System.out.println("Ingresa nuevamente tu nombre");
        String mi_nombre_2 = teclado.next();
        System.out.println("El nombre ingresado es: "+mi_nombre_2);
        */
        System.out.println("Ingresa tu cedula");
        char letra = teclado.nextLine().charAt(9);
        System.out.println("La letra captada es:"+letra);
        
       
        //sumar dos numeros
        /*System.out.print("Ingrese el valor para numero1: ");
        int numero1 = teclado.nextInt();
        System.out.print("Ingrese el valor para numero2: ");
        int numero2 = teclado.nextInt();
        int suma = numero1 + numero2;
        System.out.print("La suma de los numeros es: "+suma);
        */
    }
    
}
