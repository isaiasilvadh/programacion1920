/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class primos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        contabilizar_numeros_primos(10000);
    }
    /**
     * metodo para verificar si un numero es primo
     * @param num
     * @return 
     */
    public static boolean verificar_primo (int num) {
        int cont =0;
        
    
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                cont = cont +1;
            }
                
            }
        boolean resultado = false;
        if (cont ==2) {
            resultado = true;
            
        }
         return resultado ;  
        }
    /**
     * meteodo que permite contabilizar cuantos numeros primos existen hasta el limite indicado
     * @param limite valor maximo para evaluar y contabilizar numeros primos
     */
    public static void contabilizar_numeros_primos(int limite){
        int cont_p = 0;
        for (int i = 1; i < limite; i++) {
            verificar_primo(i);
            if (verificar_primo(i) == true) {
                cont_p++;
                
            }
            
            
        }
        System.out.println("se han encontrado:" +cont_p +"numeros primos hasta el" +limite);
        
    }
            
        
        
              
   }
    

