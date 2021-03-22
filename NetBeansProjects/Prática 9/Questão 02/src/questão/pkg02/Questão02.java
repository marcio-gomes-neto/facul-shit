/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        int[] vet1 = new int[10], vet2 = new int[10], vet3 = new int[20];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o valor " + (i+1) + " do vetor 1");
            vet1[i] = sc1.nextInt();
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira o valor " + (i+1) + " do vetor 2");
            vet2[i] = sc1.nextInt();
        }
        
        System.arraycopy(vet1, 0, vet3, 0, 10); 
        System.arraycopy(vet2, 0, vet3, 10, 10);
        
        System.out.println("O vetor 1 + vetor 2 é igual ao vetor 3: ");
        for (int i = 0; i < 20; i++) {
            
            System.out.println(vet3[i]);
        }
        
    }
    
}
