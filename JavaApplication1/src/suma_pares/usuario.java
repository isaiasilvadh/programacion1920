/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_pares;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class usuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
       String usuario = "isaias";
       String clave = "isaias123";
       
       boolean autenticacion = false;
    
       while (!autenticacion){
           
       
        System.out.println("autentiquese con su usuario y clave");
        String us = teclado.nextLine();
        String clav = teclado.nextLine();      
        if ((usuario.equals(us)) && (clave==clav)) {
            
            System.out.println("Bienvenido al sistema");
            autenticacion = true;
            
        }else{
            System.out.println("Autenticacion incorrecta");
        }
        
       } 
      
       
    }
    
}
