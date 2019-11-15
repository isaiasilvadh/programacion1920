/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

//ingresar una nota y verificar si es Insuficiente, Suficiente, Bien o Notable  
public class notaIf {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar nota de 0 a 10");
        int nota = teclado.nextInt();
        if (nota >=0 && nota <=4) {
            System.out.println("Insuficiente");
            
        }else if (nota >=5 && nota <=6){
            System.out.println("Suficiente");
            
        }else if(nota >=7 && nota <=8){
            System.out.println("Bien");
            
        }else if(nota >=9 && nota <=10){
            System.out.println("Notable");
            
        }else{
            System.out.println("La nota ingresada esta fuera del rango ");
        }
        
    }
    
}
