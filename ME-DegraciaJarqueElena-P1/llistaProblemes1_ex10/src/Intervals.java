/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elena
 */

/**
 * interval 1  | interval 2 |intersequen
 * ------------|------------|-------------------
 *   [2 4]     |   [2 3]    | Sí s'intersequen 
 *   [2 4]     |   [1 3]    | Sí s'intersequen 
 *   [2 4]     |   [1 5]    | Sí s'intersequen 
 *   [2 4]     |   [3 6]    | Sí s'intersequen 
 *   [2 4]     |   [0 1]    | No s'intersequen 
 */

import java.util.*;
public class Intervals {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        
        Scanner teclat = new Scanner(System.in);
        
        System.out.println("Introdueix l'interval 1 [ x1 x2]: ");
        x1 = teclat.nextDouble();
        x2 = teclat.nextDouble();
        
        System.out.println("Introdueix l'interval 2 [ y1 y2]: ");
        y1 = teclat.nextDouble();
        y2 = teclat.nextDouble();
        
        if( y1 == x1){
            System.out.println("Els intervals intersequen. ");    
        }
        else if( y1 <= x1 && y2 <= x2 && y2 >= x1){
            System.out.println("Els intervals intersequen. "); 
        }
 
        else if( y1 <= x1 && y2 >= x2 ){
            System.out.println("Els intervals intersequen. "); 
        }
        else if( y1 >= x1 && y1 <= x2){
          System.out.println("Els intervals intersequen. ");   
        }
        else{
            System.out.println("Els intervals no s'intersequen");
        }
        
    }
    
}
