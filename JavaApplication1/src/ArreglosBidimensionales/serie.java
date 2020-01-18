/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosBidimensionales;

/**
 *
 * @author isaia
 */
public class serie {
    public static void main(String[] args) {
        int num = 1;
        int den = 3;
        int lim = 5;
        System.out.println(num +"/"+den);
        
        for (int i = 1; i < lim; i++) {
            num = num + 3;
            int aux = den;
            den = num + aux;
            
            System.out.println(num +"/" +den );
        }
    }
    
}
