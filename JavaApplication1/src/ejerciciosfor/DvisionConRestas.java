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
public class DvisionConRestas {

    public static void main(String[] args) {

        int div = 7;
        int divsor = 2;

        int cont; 
        for (cont = 0; div >= divsor; cont++) {

            div = div - divsor;
           

        }
         System.out.println("el resultado de la division es : "+cont);
        
    }

}
