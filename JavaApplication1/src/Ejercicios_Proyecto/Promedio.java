/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Proyecto;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class Promedio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
         boolean n = true;
        double acum = 0;
        int cont = 0;
        double tot = 0;
        while   (n == true){
            System.out.println("Desea ingresar otro numero si/no");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Ingrese el numero");
                int numero = teclado.nextInt();
                acum = acum + numero;
                cont=cont+1;
            }else if (respuesta.equals("no") ) {
                n = false; 
                
            }
           
            tot = acum / cont;
        }
        
        System.out.println("el promedio de los numeros es: "+tot);
        
    }
    
}
