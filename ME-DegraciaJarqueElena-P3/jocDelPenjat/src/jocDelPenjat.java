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
public class jocDelPenjat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int PENJAT = 7;
        int intents = 0;
        final int NUM_PARAULES = 10;
        String[] llistaParaules = new String[NUM_PARAULES];
        initLlistaDeParaules(llistaParaules);
        String paraulaEndevinar = novaPartida(llistaParaules);
        //System.out.println(paraulaEndevinar);
        boolean [] lletresEncertades = new boolean[paraulaEndevinar.length()];
        Scanner s = new Scanner(System.in);
        

        initLletrasEncertades(lletresEncertades,paraulaEndevinar);
        
        while(intents <= PENJAT && !jocAcabat(lletresEncertades)){
            System.out.println("La paraula te " + paraulaEndevinar.length() + " lletres.");
            System.out.println("Escull una lletra i la seva posició: ");
            char lletra = s.next().charAt(0);
            int pos = s.nextInt();
            
            if(lletraEncertada(paraulaEndevinar, pos,lletra , lletresEncertades)){
                mostraParaula(paraulaEndevinar,lletresEncertades);
                
            }else{
                System.out.println("No es correcte");
                intents++;
            }
      
        
        }
        System.out.println("S'ha acabat la partida!, la paraula era " + paraulaEndevinar);
    }
    static void initLlistaDeParaules(String [] llistaParaules){
    
        llistaParaules[0] = "casa";
        llistaParaules[1] = "gos";
        llistaParaules[2] = "gat";
        llistaParaules[3] = "programacio";
        llistaParaules[4] = "animal";
        llistaParaules[5] = "capitol";
        llistaParaules[6] = "mirar";
        llistaParaules[7] = "caminar";
        llistaParaules[8] = "flor";
        llistaParaules[9] = "maxim";
        
    }
    static String novaPartida(String [] llistaParaules){
        Random r = new Random();
        int low  = 1, hight = 10;
        int index = r.nextInt(hight - low) + low;
        return llistaParaules[index];
        
    }
    static void initLletrasEncertades(boolean [] lletresEncertades,String paraulaEsbrinar){
        int mida = paraulaEsbrinar.length();
        
        for(int i = 0; i < mida; i++){
            lletresEncertades[i] = false;
        }
        
    }
    static boolean lletraEncertada (String paraulaEsbrinar, int pos, char c, boolean [] lletresEncertades){
        
        if(paraulaEsbrinar.charAt(pos) == c){
            lletresEncertades[pos] = true;
            //System.out.println("encertat");
            return true;
        }
        return false;

    }
    static String mostraParaula(String paraulaEsbrinar, boolean [] lletresEncertades){
        String p = " ";
        for(int i = 0; i < paraulaEsbrinar.length(); i++){
            if(lletresEncertades[i] == true){
                p += paraulaEsbrinar.charAt(i);
            }else{
                p += "?";
            }
                  
        }
        System.out.println(p);
        return p;
    }
    static boolean jocAcabat(boolean [] lletresEncertades){
        int encertades = 0;
        for( int i = 0; i < lletresEncertades.length; i++ ){
            if(lletresEncertades[i] == true){
                encertades += 1;
            }
        }
        if(encertades == lletresEncertades.length){
            System.out.println("Has endevinat la paraula!");
            return true;
        }else{
            return false;
        }
    
    }

    
}
