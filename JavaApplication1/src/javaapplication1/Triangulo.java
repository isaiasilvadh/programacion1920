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
public class Triangulo {
    public static void main(String[] args)
    {
        //Calculo del área de un triángulo
        Scanner entrada = new Scanner (System.in);
        
        float base;
        float alt;
        float area;
        
        System.out.println("Ingrese la base del triángulo");
        base = entrada.nextFloat ();
        System.out.println("Ingrese la altura del triángulo");
        alt = entrada.nextFloat();
        
        area = (base * alt) / 2;
        
        System.out.println("El area del triángulo es:"+" " +area);
        
                
        
        
    }
}
