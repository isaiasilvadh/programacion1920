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
public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){
          System.out.println("se ha iniciado la clase tiempo");
    }

    /**
     * este metodo es el constructor de la clase El constructor se ejecuta al
     * momento de crear un objeto para la clase tiempo
     */
    public Tiempo(int hora, int minuto, int segundo) {
        System.out.println("se ha iniciado la clase tiempo");
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

    }

    /**
     *
     * Metodo que encapsula al atributo hora y sirve para devolver el valor que
     * tiene la variable hora
     *
     * @return
     */
    public int obtener_hora() {

        return hora;
    }

    public int obtener_minuto() {
        return minuto;
    }

    public int obtener_segundo() {
        return segundo;
    }
public String obtener_tiempo_real(){
    String tiempo = hora +":" +minuto +":" +segundo;
    return tiempo;
    
}

}

