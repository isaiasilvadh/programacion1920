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
public class serienumeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 1;
        String acum = "";

        System.out.println("Ingresar limite para generar");
        int n = teclado.nextInt();

        while (cont <= n) {

            acum = acum + cont;
            cont = cont + 1;

            System.out.println(acum);
        }

    }
}
