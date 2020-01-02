/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_Arreglos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class cedula {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ced[] = new int[10];
        int coe[] = {2, 1, 2, 1, 2, 1, 2, 1, 2, 1};
        int total = 0;
        int total2 = 0;
        int tot = 0;
        int tot2 = 0;
        int tot3 = 0;
        int total3 = 0;
        int dec1 = 0;
        int dec2 = 0;
        int dec3 = 0;
        int dec4 = 0;
        int dec5 = 0;
        int dec6 = 0;
        int comp = 0;
        int comp2 = 0;

        int res[] = new int[10];

        for (int i = 0; i < ced.length; i++) {
            System.out.println("ingrese su numero de cedula digito a digito");
            ced[i] = teclado.nextInt();

        }
        for (int i = 0; i < ced.length; i++) {
            total = coe[i] * ced[i];
            res[i] = total;

            System.out.println("resultado es: " + total);

        }

        for (int i = 0; i < 10; i++) {
            res[i] = total;

            res[i] = coe[i] * ced[i] + (ced[9] * 0);
            total2 += res[i];
            total3 = total2 - ced[9];

        }

        for (int i = 0; i < 10; i++) {
            if (res[i] >= 10) {
                tot2 = tot2 + 1;
                tot3 = tot2 * 9;
                tot = total3 - tot3;

            }
        }
        System.out.println("el total es: " + tot);

        dec1 = tot / 10;
        dec2 = dec1 + 1;
        dec3 = dec2 * 10;
        comp = dec3 - tot;
        System.out.println("la resta es: " + comp);

        if (comp == ced[9] || ced[9] == 0) {
            System.out.println("su numero de ceudla es correcta");

        } else {
            System.out.println("Su numero de cedula no es correcto  favor escribalo de nuevo");
        }

        if (total >= 10) {
            System.out.println(+total3);
            dec4 = total3 / 10;
            dec5 = dec4 + 1;
            dec6 = dec5 * 10;
            comp = dec6 - total3;
            if (comp == ced[9]) {
                System.out.println("su numero de ceudla es correcta");

            } else {
                System.out.println("Su numero de cedula no es correcto  favor escribalo de nuevo");
            }
        }

    }
}