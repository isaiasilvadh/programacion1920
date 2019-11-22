/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_pares;

/**
 *
 * @author isaia
 */
public class Suma_pares {
    public static void main(String[] args) {
        
        int contador = 1;
        int acumulador =0;
        int par = 0;
            
        while (contador <=100){
            if (contador % 2==0) {
                par = contador;
                acumulador = acumulador + par;
                
            }
           contador++;
           
            
        System.out.println("los numeros pares del 0 al 100 son: "+par);
       
        }
        System.out.println("la suma es: "+acumulador);
        

    }
    
}
