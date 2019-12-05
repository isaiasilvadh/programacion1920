/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma_pares;

import java.util.Scanner;

/**
 * frac = num / den;
 * @author isaia
 */
public class seriefraccion {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar limite de las serie");
        int n = teclado.nextInt();
        
        int cont =1 ;
        int num = 0 ;
        int den = 1;
        double frac =0;
        double sum =0;
        while   (cont<=n){
            
            
            num = 1;
            den = den + 1;
            sum =  sum + ((double)num / den);

            cont = cont +1;
            
            System.out.print(num +"/"  +den +" + ");
        }
        System.out.println(" = " +sum);
    }
    
    
    
    
}
