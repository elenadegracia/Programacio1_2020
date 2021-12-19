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


public class NIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fitxers, opcio, random;
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 3;
        Random r= new Random();
        //int resultat= r.nextInt(high-low)+low;
        
        
        System.out.println("Introdueix el numero de fitxers amb els que vols jugar:");
        fitxers = sc.nextInt();
        if (fitxers >= 20 && fitxers < 30){
            System.out.println("Juguem amb "+ fitxers+ " fitxers");
            
            if(booleaAleatori()){
                System.out.println("Comença l'ordinador");
                int eliminats = nombreAleatori(low, high);
                fitxers = fitxers - eliminats;
                System.out.println("L'rdinador agafa " + eliminats + "fitxers.\n Queden" + fitxers + " fitxers.");
            }
            else{
                System.out.println("Comença el jugador");
            }
            
            while(fitxers > 0){
          
            System.out.println("Quants fitxers agafes (1 o 2)?");
            opcio = sc.nextInt();
            switch (opcio){
                case 1: fitxers = fitxers - 1;
                System.out.println("Queden " + fitxers + " fitxers.");break;
                case 2: fitxers = fitxers - 2;
                System.out.println("Queden " + fitxers + " fitxers.");break;
                default:System.out.println("Opcio incorrecta");break;
            }
            int eliminats = nombreAleatori(low, high);
            fitxers = fitxers - eliminats;
            System.out.println("L'rdinador agafa " + eliminats + "fitxers.\n Queden " + fitxers + " fitxers.");
        }
        if(fitxers == 0){
        System.out.println("Queden 0 fitxers. S'ha acabat la partida");
        }
        else if(fitxers < 0){
            System.out.println("Has perdut.");
        }
            
            
        }else{
            System.out.println("Introdueix bé el nombre de fitxers");
            System.out.println("Introdueix el numero de fitxers amb els que vols jugar:");
            fitxers = sc.nextInt();
        }
        
         
    }
    /**
     * 
     * @return boolean
     */
    public static boolean booleaAleatori(){
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
    /**
     * 
     * @param min
     * @param max
     * @return fitxers
     */
    public static int nombreAleatori(int min, int max){
        Random r= new Random();
        int fitxers = r.nextInt(max - min) + min;
        return fitxers;
    }
    
}