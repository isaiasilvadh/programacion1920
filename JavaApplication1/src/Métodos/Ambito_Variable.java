/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

/**
 *
 * @author isaia
 */
public class Ambito_Variable {
    
        
    
    int sueldo_basico = 400;
    double aporte_iess = 0.09;
    /**
     * metodo para calcular el aporte al iess
     * @return 
     */
    
    public double calcular_aporte(){
        double aporte = sueldo_basico * aporte_iess;
        
        return aporte;
        
        /**
         * metodo para calcular el valor loquido a depositar
         */
    }
    public double valor_depositar(){
        double valor_liquido = sueldo_basico - calcular_aporte();
        
        return valor_liquido;
    }
    
    public static void main(String[] args) {
        Ambito_Variable objeto = new Ambito_Variable();
        double calculo = objeto.calcular_aporte();
        System.out.println("sueldo basico: "+objeto.sueldo_basico);
        System.out.println("el aporte al iess es: " +calculo);
        System.out.println("valor a depositar al trabajador: " +objeto.valor_depositar()); 
        
        
        
      
    }
    
    
}
