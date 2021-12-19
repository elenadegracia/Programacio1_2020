/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elena
 */
import java.util.*;
public class FlotaCorrecteBatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Número de vaixells: ");
        int vaixells = s.nextInt();
        int []mida = new int[vaixells];
        for (int i = 0; i < vaixells; i++) {
            System.out.println("Digues la mida delss vaixells");
            mida[i] = s.nextInt();
            
        }
        System.out.println("Digues la mida del taulell");
        int midaTaula = s.nextInt();
        int[][] taulell = new int[midaTaula][midaTaula];
        
        inicialitzarTaulta(taulell);
        placeBombs(taulell,  mida, vaixells);
        mostrarTaulell(taulell);
        
        
        if(tresEnDiagonal(taulell, 0)){
            System.out.println("Taulell no vàlid");
        }else{
            System.out.println("Taulell vàlid");
        }
        
        
    }
    static void inicialitzarTaulta(int[][] taula){
        for (int i = 0; i < taula.length; i++) {
            for (int j = 0; j < taula.length; j++) {
                taula[i][j] = 0;
            }
            
        }
    }
    static void mostrarTaulell(int[][] taulell){
        for (int i = 0; i < taulell.length; i++) {
            for (int j = 0; j < taulell.length; j++) {
                System.out.print(taulell[i][j] + "");
            }
            System.out.println(" ");
            
        }
        
    }
    static int posVaixell(int min, int max) {
        Random r = new Random();
        int low = min, hight = max;
        int pos = r.nextInt(hight - low) + low;
        return pos;

    }
        static boolean tresEnDiagonal(int[][] taulell, int f){
        int fitxa = taulell[0][0];
        boolean esDiagonal = false;
        
        //diagonal principal
        if (fitxa != f) {
            for (int i = 1; i < taulell.length; i++) {
                if(taulell[i][i] != fitxa){
                    esDiagonal = false;
                }else{
                    esDiagonal = true;
                }

            }
        }
        for (int i = 1, j = taulell.length; i < taulell.length; i++, j--) {
            fitxa = taulell[0][j];
            if (taulell[i][j] != fitxa && fitxa != f) {
                esDiagonal = false;
            } else {
                esDiagonal = true;
            }

        }
       
        
        return esDiagonal;
    }
        static void placeBombs(int[][] taulell, int [] mida, int vaixells){
            for (int i = 0; i < taulell.length; i++) {
                boolean fet = true;
                int x = (int)(Math.random()*vaixells);
                int y = (int)(Math.random()*vaixells);
                int k = 0;
                for (int j = 0; j < mida[k]; j++) {
                    if (taulell[x][y] == 0) {
                        taulell[x][y] = 1;
                        fet = false;

                    }
                    k++;
                    
                }
                
                
            }
            
       
       /* for(int i = 0; i < taulell.length; i++){
            boolean realitzat = true;
            while (realitzat){
                int x = (int)(Math.random()*taulell.length);
                int y = (int)(Math.random()*taulell.length);
                int k = 0;
                for (int j = 0; j < mida[k]; j++) {
                    if (taulell[x][y] == 0) {
                        taulell[x][y] = 1;
                        realitzat = false;

                    }
                    k++;
                    
                }
            }
        }*/
        
    }

}
