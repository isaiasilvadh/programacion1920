/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller_arregllos;

/**
 *
 * @author isaia
 */
public class ejercicio3 {
    public static void main(String[] args) {
        int a [] = new int [20];
        int cont =0 ;
        
        for (int i = 0; i <a.length; i++) {
            a [i] = cont + 2;
            cont++;
            cont ++;
            
        }
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
            
        }
    }
}
