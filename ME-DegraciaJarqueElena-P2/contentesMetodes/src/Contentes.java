/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elena
 */
/**
 * ENTRADA             | SORTIDA ESPERADA
 * ------------------------------------------------------------------
 * paraula = zdaa      | Totes les a estan contentes
 * paraula = zadaa     | No totes estan contentes
 * paraula = zdaaa     | Totes les a estan contentes
 */

import java.util.*;
public class Contentes {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            Scanner teclat = new Scanner(System.in);
            System.out.println("Introdueix una paraula:");
            String paraula = teclat.nextLine();
            
            if(esContenta(paraula)){
                System.out.println("Totes les a estan contentes");
            }else{
                System.out.println("No totes estan contentes");
            }
       
            
        }
        /**
         * 
         * @param p
         * @return boolean
         */
        public static boolean esContenta(String p){
            int contador = 0, contenta = 0;
            /**
             * Identificacio de la sequencia: …
             * Primer(): x = 0
             * Seguent() x++
             * FiSeq(): x > p.length()
             * Identificacio de l'esquema:  Recorregut
             */
            for(int x = 0;x < p.length(); x++){
            if (p.charAt(x) == 'a'){
                contador++;
               
                
            }
            if(x == 0) {
                if(p.charAt(x) == 'a' && (p.charAt(x+1) == 'a')) {
                    contenta++;
                    
                }
            }
            else if(x == p.length()-1) {
                if(p.charAt(x) == 'a' && (p.charAt(x - 1) == 'a')) {
                    contenta++;
                    
                }
            }
            else if(p.charAt(x) == 'a'&&((p.charAt(x-1) == 'a'||(p.charAt(x+1) == 'a')))){
                contenta++;
                
            }
            
        }
        if(contenta == contador){
            return true;
        }else{
            return false;
        }
    }

}

