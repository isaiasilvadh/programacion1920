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
public class numero_primo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar un numero a verificar ");
        int cont = 2;
        int contp = 1;
        while (contp <= 10) {
            int num = cont;

            int cnt = num;
            int acum = 0;

            while (cnt >= 1) {
                if (num % cnt == 0) {
                    acum = acum + 1;
                }
                cnt = cnt - 1;
            }
            if (acum == 2) {
                System.out.print( + num + ",");
                contp++;
            }
            cont++;
        }
    }

}
