/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg09;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int vet1[] = new int[30], vet2[] = new int [30];
        int x;
        
        for (int i = 0; i <30; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor A");
            
            vet1[i] = sc1.nextInt(); 
        }
        
        for (int i = 0; i <30; i++) {
            System.out.println("Digite o " + (i+1) + "° valor do vetor B");
            
            vet2[i] = sc1.nextInt(); 
        }
        
        System.out.println("Digite o valor de X");
        x = sc1.nextInt();
        
        for (int i = 0; i < 30; i++) {
            
            if(vet1[i] == x){
                System.out.println("O valor de X aparece na posição " + i+5 + " do vetor A");
                System.out.println("E nessa mesma posição no vetor B, temos: " + vet2[i]);
            
            }
        }
    }
    
}
