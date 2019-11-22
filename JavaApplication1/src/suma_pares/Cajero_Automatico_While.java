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
public class Cajero_Automatico_While {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean nuevo_numero = true;
        boolean ingreso = true;

        while (ingreso == true) {
            System.out.println("Desea seguir navegando si/no");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();
            if (respuesta.equals("si")) {

            System.out.println("CAJERO AUTOMATICO -- BANCO DE LOJA");
            System.out.println("Digita 1 para realizar un retiro ");
            System.out.println("Digita 2 para realizar un deposito");
            System.out.println("digita 3 para realizar una consulta de saldo");
            System.out.println("Digita 0 si no quieres hacer nada");

            System.out.println("Ingresar valor incial de tu cuenta");
            int saldo_cuenta = teclado.nextInt();
            System.out.println("ingrese la opcion elejida");
            int opcion = teclado.nextInt();

            

                switch (opcion) {
                    case 1:
                        System.out.println("OPCIÓN PARA REALIZAR UN RETIRO");
                        System.out.println("ingrese valor a retirar");
                        int retiro = teclado.nextInt();
                        if (retiro <= saldo_cuenta) {

                            saldo_cuenta = saldo_cuenta - retiro;
                        } else {
                            System.out.println("FONDOS INSUFICIENTES");
                        }

                        break;
                    case 2:
                        System.out.println("OPCIÓN PARA REALIZAR UN DEPOSITO");
                        System.out.println("ingrese el valor a depositar");
                        int deposito = teclado.nextInt();
                        if (deposito > 0) {

                            saldo_cuenta = saldo_cuenta + deposito;
                        } else {
                            System.out.println("esta intentando ingresar un valor negativo");
                        }
                        break;

                    case 3:
                        System.out.println("Saldo de cuenta");
                        System.out.println("su saldo es :$ " + saldo_cuenta);
                        break;
                    case 4:
                        break;
                }
                System.out.println("ahora tu saldo es de:" + saldo_cuenta);

            } else if (respuesta.equals("no")) {
                ingreso = false;

            }

            

        }

        System.out.println("gracias por su visita tenga una buena tarde");
    }

}
