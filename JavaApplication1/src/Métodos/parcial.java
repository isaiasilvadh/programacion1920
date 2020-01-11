/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

/**
 *
 * @author isaia
 */
public class parcial {

    public static boolean detectar_par(int num) {
        boolean resultado;
        if (num % 2 == 0) {
            resultado = true;

        } else {
            resultado = false;
        }
        return resultado;
    }


    public static void main(String[] args) {

        int a[] = {2, 3, 4, 2, 4, 5, 6, 2, 1, 2};
        int b[] = new int[a.length];
        String proc[] = new String[a.length];
        String print_n = "Numeros";
        String print_c = "Cuadrados";
        String print_p = "Proceso";
        for (int i = 0; i < a.length; i++) {
            int cuad = a[i] * a[i];
            proc[i] = a[i] + "x" + a[i];
            b[i] = cuad;

        }

        for (int i = 0; i < a.length; i++) {
            print_n = print_n + a[i] + ", ";
            print_c = print_c + b[i] + ", ";
            print_p = print_p + proc[i] + ", ";
        }
        System.out.println(print_n);
        System.out.println(print_c);
        System.out.println(print_p);

        int acum = 0;
        for (int i = 0; i < a.length; i++) {
            boolean par = detectar_par(a[i]);
            if (par == true) {
                acum = acum + a[i];

            }

        }
        System.out.println("La suma de los numeros pares es: " + acum);

    }

}
