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
 * x1 x2 y1 y2 | resultat
 * ------------------------------------
 * 2  1  3  4  | 1.4142135623730951
 * 2  1  6  3  | 3.1622776601683795
 */
import java.util.*;


public class Distancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int x1, x2, y1, y2;
        double distancia;
        System.out.println("Introdueix el primer punt de coordenades.");
        x1 = t.nextInt();
        x2 = t.nextInt();
         
        System.out.println("Introdueix el segon punt de coordenades.");
        y1 = t.nextInt();
        y2 = t.nextInt();
        
        distancia = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1, 2));
        System.out.println(distancia);
        
    }
    
}
