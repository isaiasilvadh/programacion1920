/*
 *Clase para realizar el intercambio de contenido entre dos variables con ayuda de un auxiliar
 */
package javaapplication1;

/**
 *
 * @author isaia
 */
public class Intercambio {
    
    public static void main(String[] args) {
        
        String vaso_jugo = "contiene jugo";
        String vaso_gaseosa = "contiene sprit";
        String vaso_auxiliar = " ";
        System.out.println("vaso_jugo = "+vaso_jugo);
        System.out.println("vaso_gaseosa = "+vaso_gaseosa);
        System.out.println("1. Pasamos vaso de jugo a vaso auxiliar");
        vaso_auxiliar = vaso_jugo;
        System.out.println("2. Pasamos vaso de gaseosa a vaso de jugo");
        vaso_jugo = vaso_gaseosa;
        System.out.println("3. Pasamos vaso auxiliar a vaso de gaseosa");
        vaso_gaseosa = vaso_auxiliar;
        
        System.out.println("vaso_jugo = "+vaso_jugo);
        System.out.println("vaso_gaseosa = "+vaso_gaseosa);
        
        
    }
    
    
}
