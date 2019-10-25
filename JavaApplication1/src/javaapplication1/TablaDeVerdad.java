/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author isaia
 */
public class TablaDeVerdad {
    
    public static void main(String[] args) {
        System.out.println("Tabla de verdad del operador and");
        System.out.println("______________________________");
        System.out.println("x \t y \t resultado");
        System.out.println("______________________________");
        System.out.println("v \t v \t " + (true && true) );
        System.out.println("______________________________");
        System.out.println("v \t f \t " + (true && false) );
        System.out.println("______________________________");
        System.out.println("f \t v \t " + (false && true) );
        System.out.println("______________________________");
        System.out.println("f \t f \t " + (false && false) );
        System.out.println("______________________________");
    }
    
}
