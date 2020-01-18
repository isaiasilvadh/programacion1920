/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PO;

/**
 *
 * @author isaia
 */
public class Cajero {

    private int saldo;
/**
 * permite consultar el saldo
 * @return 
 */
    /**
     * constructor par inicializar el saldo
     * @param saldo 
     */
    public Cajero (int saldo){
        this.saldo = saldo;
        
    }
    public int consultar_saldo() {
        return saldo;
    }

    /**
     * metodo para realizar un deposito
     * @param valor_deposito 
     */
    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo + valor_deposito;
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
/**
 * metodo para retirar dinero 
 */
    }
    public void retirar(int valor_retiro){
        if (valor_retiro <= saldo) {
            saldo = saldo - valor_retiro;
            
        }else{
            System.out.println("El valor ingresado no es correcto");
        }
        
    }

}
