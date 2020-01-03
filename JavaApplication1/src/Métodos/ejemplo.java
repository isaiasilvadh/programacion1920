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
public class ejemplo {

    public static void main(String[] args) {
        //llamada al mrtodo, pasando las variables: String e int
        //saludar_nveces("Isaías", 10);
        int resultado = sumar_dos_numeros(10, 7);
        System.out.println("el resultado de la suma es: " + resultado);
        int resultado2 = sumar_dos_numeros(1, 2);
        System.out.println("el resultado de la suma es: " + resultado2);

    }

    /**
     * MÉTODO QUE NO RETORNA VALOR metodo para presentar un saludo en pantalla n
     * veces
     *
     * @param nombre nombre para mostrar en cada saludo
     * @param veces sirve para determinar el numero de saludos que se mostraran
     */
    public static void saludar_nveces(String nombre, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Feliz año 2020: " + nombre);

        }

    }

    /**
     * MÉTODO QUE SI RETORNA UN VALOR
     *
     * @param num1 primer numero a sumar
     * @param num2 segundo numero a sumar
     * @return
     */
    public static int sumar_dos_numeros(int num1, int num2) {
        int suma = 0;
        suma = num1 + num2;
        //retornamos el resultado de la suma
        return suma;

    }

}
