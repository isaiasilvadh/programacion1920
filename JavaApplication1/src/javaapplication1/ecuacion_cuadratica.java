/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class ecuacion_cuadratica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar valor para a");
        double a = teclado.nextDouble();

        System.out.println("ingresar valor para b");
        double b = teclado.nextDouble();

        System.out.println("ingresar valor para c");
        double c = teclado.nextDouble();

        double x1 = (b * (-1)) + (Math.sqrt(b * b) - 4 * a * c) / 2 * a;

        System.out.println(" La respuesta positiva es:" + x1);

        double x2 = (b * (-1)) - (Math.sqrt(b * b) - 4 * a * c) / 2 * a;

        System.out.println(" La respuesta negativa es:" + x2);

    }

}
