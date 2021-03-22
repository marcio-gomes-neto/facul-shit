/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg01;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        double vet1[][] = new double[2][5];
            
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Insira o valor da posição " + (i+1) + "-" + (j+1));
                vet1[i][j] = sc1.nextDouble();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.printf(" %.0f ",vet1[i][j]);
                
            }
            System.out.printf("\n");
        }
        
    }
    
}
