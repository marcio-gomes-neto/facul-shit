/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02a;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão02a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int vet1[][] = new int[3][10];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                vet1[i][j] = j;
            }
        }
        
        System.out.println("A matriz tem " + (vet1.length) + " linhas.");
    }
    
}
