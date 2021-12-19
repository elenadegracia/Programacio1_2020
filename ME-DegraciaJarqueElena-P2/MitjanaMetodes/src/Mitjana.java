
import java.util.*;

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
 * ENTRADA                      | SORTIDA ESPERADA
 * ------------------------------------------------------
 * Introdueix un nombre n: 3    |
 * Introdueix els enters: 1,2,3 | La mitjana és: 2.0
 * 
 */
public class Mitjana {

  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Introdueix un nombre n:");
        int n = t.nextInt();
        mitjana(n);
    }
    /**
     * 
     * @param num
     * @return mit
     */
    public static double mitjana(int num){
        Scanner t = new Scanner(System.in);
        double mit;
        int s = 0, n;
        System.out.println("Introdueix els enters: ");
         /**
             * Identificacio de la sequencia: …
             * Primer(): i = 1
             * Seguent() i++
             * FiSeq(): i >= num
             * Identificacio de l'esquema:  Recorregut
             */
        for( int i = 1; i <= num; i++){
            n = t.nextInt();
            s += n;
        }
        mit = s / (double)(num);
        System.out.println("La mitjana és: " + mit);
        return mit;
    }
    
    
}
