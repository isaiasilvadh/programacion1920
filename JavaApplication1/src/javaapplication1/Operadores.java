/*
Esta clase va a servir para trabajar con las distintas clases de operadores en java
 */
package javaapplication1;

/**
 *
 * @author isaia
 */
public class Operadores {
    
    public static void main(String[] args) {
       //1.OPERADORES ARITMÉTICOS
       int suma = 14 + 14;
       int resta = 20 - 10;
       double multiplicacion = 50 * 0.12;
       int division = 100 / 50;
       int residuo = 7 % 2;
        System.out.println("1. OPEADORES ARITMETICOS");
        System.out.println("La suma es " +suma);
        System.out.println("La resta es "+resta);
        System.out.println("la multiplicación es"+multiplicacion);
        System.out.println("la división es" +division);
        System.out.println("el residuo es"+residuo);
        //2. OPERADORES DE INCREMENTO Y DECREMENTO
        int nota = 15;
        nota = nota + 1;
        System.out.println("2. OPERADORES DE INCREMENTO Y DECREMENTO");
        System.out.println("incrememento como nota = nota +1 :"+nota);
        nota +=1;
        System.out.println("Incremento como nota +=1 :" +nota);
        nota++;
        System.out.println("Incremento como nota++ :"+nota);
        
        nota = nota -1 ;
        System.out.println("decremento de la variable nota");
        System.out.println("decremento como nota = nota -1 :"+nota);
        nota -= 1;
        System.out.println("decremento como nota -=1:"+nota);
        
        nota--;
        System.out.println("decremento como nota--:"+nota);
        
        
       
    }
    
}
