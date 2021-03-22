/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg1;

import java.util.ArrayList;

/**
 *
 * @author Marci
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> estudantes = new ArrayList();
        
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");
        
        for (int i = 0; i < estudantes.size(); i++) {
            System.out.println("Índice "+i+ " - " + estudantes.get(i));
            
        }
        System.out.println("Tamanho do Array List: " + estudantes.size());
        System.out.printf("\n\n\nParte 2:\n");
        
        estudantes.add(0,"Nick");
        estudantes.add(1,"Mike");
        estudantes.remove(3);
        
        for (int i = 0; i < estudantes.size(); i++) {
            System.out.println("Índice "+i+ " - " + estudantes.get(i));
            
        }
        System.out.println("Tamanho do Array List: " + estudantes.size());
        
    
    }
    
}
