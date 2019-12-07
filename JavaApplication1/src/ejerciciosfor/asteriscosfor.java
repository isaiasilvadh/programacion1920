/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosfor;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class asteriscosfor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar numero de filas");
        int fi = teclado.nextInt();
        System.out.println("Ingresar numero de columnas");
        int col = teclado.nextInt();
        
        String acum = "";
        String acum2 = "";
        
        for (int cont = 1; cont <= fi; cont++) {

            acum = acum + "*";
            
            System.out.print(acum);

            for (cont = 1; cont <= col; cont++) {

                acum2 = acum2 + "*";
                
                System.out.println( acum2);
            }
            
        }

    }

}
