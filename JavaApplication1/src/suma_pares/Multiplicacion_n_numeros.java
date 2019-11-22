/*
Programa para realizar la multiplcacion de n numeros ingresado por teclado
 
 */
package suma_pares;

import java.util.Scanner;

/**
 *
 * @author isaia
 */
public class Multiplicacion_n_numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean nuevo_numero = true;
        int acumulador = 1;
        while   (nuevo_numero == true){
            System.out.println("Desea ingresar otro numero si/no");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("Ingrese el numero");
                int numero = teclado.nextInt();
                acumulador = acumulador * numero;
            }else if (respuesta.equals("no") ) {
                nuevo_numero = false; // finaliza el ciclo
            }
            
        }
        
        System.out.println("La multiplicacion de los numeros es: "+acumulador);
    }
    
}
