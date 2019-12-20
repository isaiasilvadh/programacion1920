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
public class matrizuniversidades {
    public static void main(String[] args) {
        //declaracion de matriz con valores conocidos
        
        String nombres [][] = { 
            {"Alexander","Isaias","Dodi","Mario", "Luis"},
            {"Genesis","Diego","Ramiro","Anthonny","Ariel"}  
        };
        //System.out.println(nombres [0][2]);
        //System.out.println(nombres [1][4]);
         //System.out.println("filas: "+nombres.length);//devuelve el numero de filas
        for (int fil = 0; fil <5; fil++) { //recorremos las filas
           // int tam_col = nombres[fil].length;//
         
            for (int col = 0; col < 2; col++) {   //recorreremos columnas
                System.out.print(nombres [col][fil]+("\t"));
            }
            
            System.out.println("");
        }
    }
    
}
