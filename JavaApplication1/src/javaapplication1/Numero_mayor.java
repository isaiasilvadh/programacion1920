/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;



/**
 *
 * @author isaia
 */
public class Numero_mayor {
    public static void main(String[] args) {
        
        
        System.out.println("PROGRAMA PARA IDENTIFICAR EL MAYOR DE 3 NUMEROS");
        int n1 = 20;
        int n2 = 20;
        int n3 = 10;
        //inicio del bloque if
        if (n1 >= n2 && n1 >= n3) {
            System.out.println("n1 es el mayor");     
        }else if (n2>=n1 && n2>=n3) {
            System.out.println("n2 es el mayo   ");
        //inicio del bloque if 
        }else if (n3>=n1 && n3>=n2) {
            System.out.println("n3 es el mayor");  
        }else {
            System.out.println("los numeros son iguales");
        }
        
                
    }
    
}
