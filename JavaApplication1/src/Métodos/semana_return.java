/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class semana_return {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar un numero del 1 a 7");
        int num = teclado.nextInt();
        String msg = determinar_dia_semana2(num);
        System.out.println(msg);
    }

    /**
     * Sirve para ingresar un valor y devuelve el dia de la semana
     *
     * @param dia
     */
    public static String determinar_dia_semana2(int num) {
        String mensaje = "";
        if (num == 1) {
            mensaje = "Lunes";
        } else {
            if (num == 2) {
                mensaje = "Martes";
            } else {
                if (num == 3) {
                    mensaje = "Miercoles";
                } else {
                    if (num == 4) {
                        mensaje = "Jueves";
                    } else {
                        if (num == 5) {
                            mensaje = "Viernes";
                        } else {
                            if (num == 6) {
                                mensaje = "Sabado";
                            } else {
                                if (num == 7) {
                                    mensaje = "Domingo";

                                } else {
                                    if ((num > 7) || (num == 0)) {
                                        System.out.println("Numero invalido");
                                    }

                                }

                            }
                        }
                    }

                }

            }
        }
        
        return mensaje;
    }

}
