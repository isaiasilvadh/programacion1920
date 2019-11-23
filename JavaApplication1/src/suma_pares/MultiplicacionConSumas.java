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
public class MultiplicacionConSumas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int cont = 1;
        int acum = 0;

        System.out.println("Ingresar el primer numero");
        int a = teclado.nextInt();
        System.out.println("Ingresar segundo numero");
        int b = teclado.nextInt();

        while (cont <= b) {
            acum = acum + a;
            cont = cont + 1;

        }
        System.out.println("El resultado es:" +acum);

    }

}
