/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoBimestral;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class pro2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        String[] proceso = new String[a.length];
        String procesos2[] = new String[b.length];
        String[] proce1 = new String[a.length];
        String[] proce2 = new String[b.length];
        String[] ProFin = new String[a.length];
        String[] paso1 = new String[a.length];
        String[] paso2 = new String[a.length];
        String[] paso3 = new String[a.length];
        String[] paso4 = new String[a.length];
        String[] paso5 = new String[a.length];
        String[] paso6 = new String[a.length];
        int k = 0;
        for (int i = 0; i < 1; i++) {
            System.out.println("ingrese los valores de x");
            a[0] = teclado.nextInt();
            System.out.println("ingrese los valores de y ");
            a[1] = teclado.nextInt();
            System.out.println("ingrese los valores de respuesta de la ecuacion");
            a[2] = teclado.nextInt();
            proceso[i] = a[0] + " x " + "+ " + a[1] + "y" + " = " + a[2];

        }

        for (int i = 0; i < 1; i++) {
            System.out.println("ingrese los valores de x");
            b[0] = teclado.nextInt();
            System.out.println("ingrese los valores de y");
            b[1] = teclado.nextInt();
            System.out.println("ingrese los valores de respiuesta de la ecuacion");
            b[2] = teclado.nextInt();
            procesos2[i] = b[0] + " x " + "+ " + b[1] + "y" + " = " + b[2];

        }
        String print_ecu = "(1) = ";
        String print_ecu2 = "(2) = ";

        print_ecu = print_ecu + proceso[2];
        print_ecu2 = print_ecu2 + procesos2[2];

        System.out.println("La ecuacion queda de la siguiente forma");
        for (int i = 0; i < a.length; i++) {

            proce1[i] = a[0] * b[0] + " x " + "+ " + a[1] * b[0] + "y" + " = " + a[2] * b[0];
        }
        for (int i = 0; i < b.length; i++) {
            proce2[i] = b[0] * (a[0] * -1) + " x " + "+ " + b[1] * (a[0] * -1) + "y" + " = " + b[2] * (a[0] * -1);
        }
        String mostrar = "Ecuacion 1 = ";
        String mostrar2 = "Ecuacion 2 = ";
        mostrar = mostrar + proce1[2];
        mostrar2 = mostrar2 + proce2[2];
        System.out.println(mostrar);
        System.out.println(mostrar2);
        System.out.println("  ");

        System.out.print("  ");
        System.out.println("  ");

        for (int i = 0; i < a.length; i++) {
            proce1[i] = (a[0] * b[0]) - (a[0] * b[0]) + " x " + "+ " + (a[1] * b[0] + b[1] * (a[0] * -1)) + "y" + " = " + (a[2] * b[0] + b[2] * (a[0] * -1));

        }
        for (int i = 0; i < a.length; i++) {
            ProFin[i] = "y" + " = " + ((a[2] * b[0] + b[2] * (a[0] * -1)) + " / " + (a[1] * b[0] + b[1] * (a[0] * -1)) * -1);
            proce1[i] = "y" + " = " + ((a[2] * b[0] + b[2] * (a[0] * -1)) / (a[1] * b[0] + b[1] * (a[0] * -1)) * -1) * (-1);
        }
        for (int i = 0; i < a.length; i++) {
            k = ((a[2] * b[0] + b[2] * (a[0] * -1)) / (a[1] * b[0] + b[1] * (a[0] * -1)) * -1) * (-1);
            paso1[i] = a[0] + " x " + "+ " + a[1] + "(" + k + ")" + " = " + a[2];
            paso2[i] = a[0] + " x " + "+ " + a[1] * k + " = " + a[2];
            paso3[i] = a[0] + " x " + " = " + a[2] + (a[1] * k) * -1;
            paso4[i] = a[0] + " x " + " = " + (a[2] + (a[1] * k) * -1);
            paso5[i] = " x " + " = " + (a[2] + (a[1] * k) * -1) + "/" + a[0];
            paso6[i] = " x " + "= " + (a[2] + (a[1] * k) * -1) / a[0];

        }

        System.out.println("la incognita de X  es: " + paso6[2]);
        System.out.println("la incognita de Y  es: " + proce1[2]);

    }

}
