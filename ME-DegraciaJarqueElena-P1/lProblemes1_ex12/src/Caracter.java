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
 * Paraula | Index | Lletra
 * ------------------------------------
 * Hola    |   3   | a
 * Hola    |   0   | H
 * Hola    |   4   | índex incorrecte  
 * Hola    |   1   | o
 */

import java.util.*;
public class Caracter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String paraula;
        int index;

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix una paraula: ");
        paraula = teclat.next();

        System.out.println("Introdueix un índex: ");
        index = teclat.nextInt();

        while (index < 0 || index > paraula.length() - 1) {
            System.out.println("Índex incorrecte");
            System.out.println("Introdueix un índex per saber quina lletra ocupa la posició: ");
            index = teclat.nextInt();   
        }
    System.out.println("A la posició " + index + " està  el caràcter " + paraula.charAt(index));
    }


    }
    

