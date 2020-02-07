/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author isaia
 */
public class EjecutaTiempo {
    public static void main(String[] args) {
        //vamos a llamar a instancear a la clase tiempo, para ello llamamos un objeto
        Tiempo tiempo = new Tiempo(20,17,30);
        System.out.println("valor de hora: " +tiempo.obtener_hora());
        System.out.println("valor de minuto: " +tiempo.obtener_minuto());
        System.out.println("valor de segundo: " +tiempo.obtener_segundo());
        System.out.println(tiempo.obtener_tiempo_real());
        
        //vamos a crear un segundo objeto de la clase tiempo 
        Tiempo tiempo2 = new Tiempo (20,17,30);
        System.out.println("valor de la hora; " +tiempo2.obtener_hora());
    }
    
    
    
}
