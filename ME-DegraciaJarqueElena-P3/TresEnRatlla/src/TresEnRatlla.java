
import java.util.Random;

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
public class TresEnRatlla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char j1 = 'X';
        char j2 = 'O';
        char buit = '-';
        boolean torn = true;
        char taulell[][] = new char[3][3];
        int fila, columna;
        Scanner s = new Scanner(System.in);
        
        inicialitzarTaulell(taulell, buit);
        mostrarTaulell(taulell);
        if(booleaAleatori()){
            System.out.println("Comença l'ordinador.");
            fila = posOrdinador();
            columna = posOrdinador();
            esPotAfegir(taulell, fila, columna, j1);
            mostrarTaulell(taulell);
                
        }else{
            System.out.println("Comença el jugador.");
            mostrarTaulell(taulell);
        }
        
        while(!jocAcabat(taulell, buit)){
            System.out.println("Digues una fila i una columna.");
            fila = s.nextInt();
            columna = s.nextInt();
            esPotAfegir(taulell, fila, columna, j2);
            mostrarTaulell(taulell);
            //ara li toca a l'ordinador
            System.out.println("Li toca a l'ordinador:");
            fila = posOrdinador();
            columna = posOrdinador();
            esPotAfegir(taulell, fila, columna, j1);
            mostrarTaulell(taulell);
       
            
            
        }
        
    }
    
    static void inicialitzarTaulell(char[][] taulell, char c){
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell.length; j++){
                taulell[i][j] = c; 
            }
        }
        
    }
    static void mostrarTaulell(char[][] taulell){
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                System.out.print(taulell[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
    static boolean booleaAleatori(){
        int low = 1;
        int high = 3;
        Random r= new Random();
        int resultat= r.nextInt(high - low) + low;
        
        if (resultat == 1){
            return true;
        }else{
            return false;
        }
    }
    
    static boolean esPotAfegir(char[][] taulell, int fila, int columna, char f){
        if((fila >= 0 && fila < taulell.length) && (columna >= 0 && columna < taulell.length)){
            if(taulell[fila][columna] == "-".charAt(0)){
                taulell[fila][columna] = f;
                
            } else {
                System.out.println("La casella ja està ocupada.");
                
            }
          return true;  
            
        }
        System.out.println("Posició no vàlida.");
        return false;
        
        
    }
    
    static int posOrdinador(){
        Random r = new Random();
        int low  = 1, hight = 3;
        int pos = r.nextInt(hight - low) + low;
        return pos;
        
    }
    
    static boolean jocAcabat(char[][] taulell, char f){
        if(totPle(taulell, f) || tresEnFila(taulell, f) || tresEnColumna(taulell, f ) || tresEnDiagonal(taulell, f)){
             System.out.println("Joc acabat!");
            return true;
        }
       return false;
    }
    static boolean tresEnFila(char[][] taulell, char f) {
        char fitxa;
        boolean enFila;
        for (int i = 0; i < taulell.length; i++) {
            enFila = true;
            fitxa = taulell[i][0];
            if (fitxa != f) {
                for (int j = 1; j < taulell[0].length; j++) {
                    if(fitxa != taulell[i][j]){
                        enFila = false;
                    } 
                }
                if(enFila){
                    return true;
                }
            }

        }
        return false;
    }
    static boolean tresEnColumna(char[][] taulell, char f) {
        char fitxa;
        boolean enColumna;
        for (int j = 0; j < taulell.length; j++) {
            enColumna = true;
            fitxa = taulell[0][j];
            if (fitxa != f) {
                for (int i = 1; i < taulell[0].length; i++) {
                    if (fitxa != taulell[i][j]) {
                        enColumna = false;
                    }
                }
                if (enColumna) {
                    return true;
                }
            }

        }
        return false;

    }
    static boolean tresEnDiagonal(char[][] taulell, char f){
        char fitxa = taulell[0][0];
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
        fitxa = taulell[0][2];
        if (fitxa != f) {
            for (int i = 1, j = 1; i < taulell.length; i++, j--) {
                if (taulell[i][j] != fitxa) {
                    esDiagonal = false;
                }else{
                    esDiagonal = true;
                }

            }

        }
        return esDiagonal ;  
        
    }
    static boolean totPle(char[][] taulell, char f){
        int c = 0;
        for(int i = 0; i < taulell.length; i++){
            for(int j = 0; j < taulell[0].length; j++){
                if(taulell[i][j] == f){
                    return false;
                }
            }
            
        }
        System.out.println(" Tot ple");
        return true;
    
        
    }
    
    
}
