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
public class seleccion_multiple {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Empleo de la sentencia switch");
        System.out.println("programa para determinar si un caracter "
                            + "ingresado por teclado es una vocal");
        
        char letra = teclado.next().charAt(0);
        
        switch (letra){// se evaluan variable de tipo char e int
            case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("es una vocal "+letra);
                    break;        
            default:
                System.out.println("no es una vocal: "+letra);
                
        }
        
                            
    }
    
}
