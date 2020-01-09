/*
 *Por:Isaias Silva, Romero Ramirez, Dody Guaman
 */
package Métodos;

import static Métodos.semana_return.determinar_dia_semana2;
import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class semana_metodos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar un numero del 1 a 7");
        int num = teclado.nextInt();
       // determinar_dia_semana(num);
        String msg = determinar_dia_semana2(num);
        System.out.println(msg);
        

    }

    /**
     * Sirve para ingrsar un valor y devuelve el dia de la semana
     *
     * @param dia
     */
    public static void determinar_dia_semana(int num) {

        if (num == 1) {
            System.out.println("Lunes");
        }else{
            if(num == 2) {
                System.out.println("Martes");
                }else{
                if (num == 3) {
                    System.out.println("Miercoles");
                    }else{
                    if (num == 4) {
                        System.out.println("Jueves");
                        }else{
                        if (num == 5) {
                            System.out.println("Viernes");
                            }else{
                            if (num == 6) {
                                System.out.println("sabado");
                                }else{
                                if (num == 7) {
                                    System.out.println("Domingo");

                                }else{
                                    if ((num>7)||(num==0)) {
                                        System.out.println("Numero invalido");
                                    }
                                    
                                }

                            }
                        }
                    }

                }

            }
        }

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


