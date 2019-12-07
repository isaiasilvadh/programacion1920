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
public class puente {
    public static void main(String[] args) {
  
        String  acum = "";
        int n = 10;
        int c = 3;
        int e = 2;

        for (int  i = 0; i < n; i++) {
            acum = acum + "_" ; 
        }
        acum = acum + "\n" ; 
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < c; k++) {
                for (int j = 0; j < e; j++) {
                acum = acum + " " ;
                
                }
            acum = acum + "*" ;
            i= i + 1;
            }
            acum = acum + "\n" ;
        }

        System.out.printf(acum);
                
    }
    
}
