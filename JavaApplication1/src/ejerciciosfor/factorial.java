/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfor;

/**
 *
 * @author isaia
 */
public class factorial {
    public static void main(String[] args) {
        /*
        int num = 5;
        int acum = 1;
        for (int cont = num; cont >=1 ; cont--) {
            acum = acum * cont;
            
            
        }
        System.out.println(acum);
        */
        int num = 5;
        int acum = 1;
        for (int cont = 1; cont <= num; cont++) {
            acum = acum * cont;
            
        }
        System.out.println(acum);
    }
    
}
