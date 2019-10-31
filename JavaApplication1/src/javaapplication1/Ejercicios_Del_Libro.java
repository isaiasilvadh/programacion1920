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
public class Ejercicios_Del_Libro {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //ejercicio 1
        /*
        System.out.println("ingresar el largo");
        double lar = teclado.nextDouble();
        System.out.println("Ingresar ancho");
        double anc = teclado.nextDouble();
        System.out.println("ingresar precio por metro cuadrado");
        double prec= teclado.nextDouble ();
        
        double met = (lar * anc);
        double prectot = (met * prec);
        
        double des = (prectot * 0.90);
        
        
        if (prectot >=400){
       
        System.out.println("el costo del terreno con descuento es:"+des);
        }else{
            System.out.println("El precio del terreno es de:"+prectot);
        }
         */
        
        
        //ejercicio 3
        /*
        System.out.println("ingresar valor para x");
           
        double x = teclado.nextDouble();
        double y1 = (3 * x +6); 
        double y2 = Math.pow(x, 2) + 6;
        
        if (x < 0){ 
            System.out.println("El valor de y es:"+y1);
    
        }else{
            if(x>=0){
                System.out.println("el valor de y es: "+y2);}
            }
         */
        
        
        
        //ejercicio 4
        /*
        System.out.println("Ingresar la cantidad del pedido");
        int can = teclado.nextInt();
        System.out.println("Ingrese precio del producto");
        int prec = teclado.nextInt();
        
        double total = (can * prec);
        double ped = (total * 0.85);
        
        if (can > 50){
            System.out.println("El precio con el descuento es: "+ped);
        }else{
            System.out.println("El precio total es: "+total);
        }
         */
        
        
        

        //Ejercicio 5
        /*
        int pago = 0;
        double c1h = 0;
        double c2v = 0;
        double c3a = 0;
        double total1 = 0;
        double total2 = 0;
        
        System.out.println("ingresar cantidad de hojas");
        int hoj = teclado.nextInt();
        System.out.println("Ingresar el precio  de las hojas");
        int prech = teclado.nextInt();
        System.out.println("Ingrese cantidad de viguetas");
        int vig = teclado.nextInt();
        System.out.println("Ingrese el precio de viguetas");
        int precv = teclado.nextInt();
        System.out.println("Ingresar cantidad de armazones");
        int arm = teclado.nextInt();
        System.out.println("Ingresar precio de armazones");
        int preca = teclado.nextInt();
        
        if (pago == 1) {
           c1h = ((hoj*prech) * 0.80 );
           c2v = ((vig * precv) * 0.85);
           c3a = (arm * preca);
           total1 = ((c1h + c2v + c3a)* 0.93 );
            System.out.println("Las hojas tienen un costo de: "+c1h);
            System.out.println("Las viguetas tienen un costo de: "+c2v);
            System.out.println("los armazaones tienen un costo de: " +c3a);
            System.out.println("el costo total en credito es de : "+total1);
            
        }else{
            
            if (pago == 2) {
                c1h = ((hoj * prech) * 0.80);
                c2v = ((vig * precv) * 0.85);
                c3a = (arm * preca);
                
                total2 = (c1h + c2v +c3a);
                System.out.println("Las hojas tienen un costo de : "+c1h );
                System.out.println("Las viguetas tienen un costo de : "+c2v);
                System.out.println("los armazones tienen un costo de : "+c3a);
                System.out.println("el costo total en credito es de : "+total2);
            }
                    
        }
         */
        
        
        
        //Ejercicio 7
        /*
        System.out.println("Ingresar nombre del estudiante");
        String nom = teclado.nextLine();

        System.out.println("Ingresae nota 1");
        int not1 = teclado.nextInt();
        System.out.println("Ingresar nota 2");
        int not2 = teclado.nextInt();
        System.out.println("Ingresar nota 3");
        int not3 = teclado.nextInt();

        double prom = (not1 + not2 + not3) / 3;

        if (not1 >= 70) {
            
            if (not2 >= 70) {

                if (not3 >= 70) {

                    System.out.println("El promedio de:" + nom);
                    System.out.println("es: " + prom);

                } else {
                    System.out.println("NA");
                }
            } else {
                System.out.println("NA");
            }
        } else {
            System.out.println("NA");
        }
         */
        
        
        
        //ejercicio 8
        /*
        System.out.println("Ingresar ángulo a");
        int a = teclado.nextInt();
        System.out.println("Ingresar ángulo b");
        int b = teclado.nextInt();
        System.out.println("Ingresar ángulo c");
        int c = teclado.nextInt();
        
        if (Math.pow(c, 2) != (Math.pow(a, 2) + (Math.pow(b, 2)))){
            if (Math.pow(c, 2) > (Math.pow(a, 2) + (Math.pow(b, 2)))){
            
            System.out.println("El triángulo es obtusángulo");
            }else{
                System.out.println("El triángulo es acutángulo");
            }
        }else{
            System.out.println("el triángulo es rectángulo");
        }
         */
    }

}
