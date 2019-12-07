/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosUnidimensionales;

/**
 *
 * @author isaia
 */
public class ejemplo {

    public static void main(String[] args) {
        // declaracion de valores iniciales
        String universidades[] = {"utpl", "unl", "ucuenca"};
        // 2. declaracion de arreglo, indicando su longitud
        String estudiantes [] = new String [20];
        estudiantes [0] = "Inicio";
        estudiantes [10] = "Isaias";
        estudiantes [19] = "Final";
        for (int indice = 0; indice < estudiantes.length ; indice++) {
            System.out.println("estudiantes["+indice + "] = "+estudiantes [indice]);
            
        }
        
        //obtenemos el valor de la segunda posición
        for (int indice = 0; indice < universidades.length ; indice++) {
             System.out.println(universidades[indice]);
         
        }
      
    }

}
