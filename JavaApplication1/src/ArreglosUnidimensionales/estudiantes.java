/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosUnidimensionales;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class estudiantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nom[] = new String[3];
        int edad[] = new int[3];
        String un[] = new String[3];
        String cel[] = new String[3];

        //escritura
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("Ingrese el nombre del estudiantes");
            nom[indice] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edad[indice] = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese la universidad del estudiante");
            un[indice] = teclado.nextLine();
            System.out.println("Ingrese el numero de celular del estudiante");
            cel[indice] = teclado.nextLine();

        }
        //operacion de lectura
        int acum = 0;
        for (int indice = 0; indice < edad.length; indice++) {
            acum = acum + edad[indice];
            System.out.println("Nombre: " + nom[indice]);
            System.out.println("Edad: " + edad[indice]);
            System.out.println("Universidad: " + un[indice]);
            System.out.println("Celular: " + cel[indice]);

            System.out.println("--------------");

        }
        System.out.println("Promedio de edades: " + (acum / edad.length));

    }

}
