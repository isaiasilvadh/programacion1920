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
public class abecedario {
    public static void main(String[] args) {
        char abecedario [] = new char  [26];
        int indice = 0;
        for (char letra = 'a'; letra <= 'z'; letra++) {
            //System.out.println(letra);
            //operacion de escritura
            abecedario [indice] = letra;
                    indice ++;
        }
        //operacion de lectura
        int tam = abecedario.length;
        
        for (int ind = 0; ind < tam ; ind++) {
            if (ind !=(tam-1)) {
                  System.out.print(abecedario[ind]+",");
            }else{
                  System.out.print(abecedario[ind]);
            }
          
            
        }
    }
    
}
