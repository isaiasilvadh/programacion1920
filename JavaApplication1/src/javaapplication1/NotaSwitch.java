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
public class NotaSwitch {

    public static void main(String[] args) {
        System.out.println("Nota de 0 a 4 Insuficiente");
        System.out.println("Nota de 5 a 6 Suficiente");
        System.out.println("Nota de 7 a 8 Bien");
        System.out.println("Nota de 9 a 10 Notable");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar nota de 1 a 10");
        int nota = teclado.nextInt();
       
        switch(nota){
            
            case 0:
                if (nota ==0){
                    System.out.println("Insuficiente");
                }
            case 1:
                if (nota ==1) {
                    System.out.println("Insuficiente");
                }
            case 2:
                if (nota ==2) {
                    System.out.println("Insuficiente");
                }
            case 3:
                if (nota ==3) {
                    System.out.println("Insuficiente");
                    
                }
            case 4:
                if (nota==4) {
                    System.out.println("Insuficiente");
                   
                }
            case 5:
                if (nota==5) {
                    System.out.println("Suficiente");
                    
                }
            case 6:
                if (nota==6) {
                    System.out.println("Suficiente");
                    
                }
            case 7:
                if (nota==7) {
                    System.out.println("Bien");
                    
                }
            case 8:
                if (nota==8) {
                    System.out.println("Bien");
                    
                }
            case 9:
                if (nota==9) {
                    System.out.println("Notable");
                    
                }
            case 10:
                if (nota==10) {
                    System.out.println("Notable");
                    
                }
            default: if (nota>10) {
                System.out.println("La nota ingresada es invalida");
                    
                }
    
        }
        

    }

}
