/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg06;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int vet1[] = new int[10];
        float vet2[] = new float[10];
        for (int i = 0; i < 10; i++) {

                System.out.println("Insira a nota do aluno " + (i+1) + " (0 a 10)");
                vet1[i]= sc1.nextInt();
 
        }
        
        for (int i = 0; i < 10; i++) {
            
            switch(vet1[i]){
                case 1:
                    vet2[0] = vet2[0]+1;
                    break;
                case 2:
                    vet2[1] = vet2[1]+1;
                    break;
                case 3:
                    vet2[2] = vet2[2]+1;
                    break;
                case 4:
                    vet2[3] = vet2[3]+1;
                    break;    
                case 5:
                    vet2[4] = vet2[4]+1;
                    break;
                case 6:
                    vet2[5] = vet2[5]+1;
                    break;
                case 7:
                    vet2[6] = vet2[6]+1;
                    break;
                case 8:
                    vet2[7] = vet2[7]+1;
                    break;
                case 9:
                    vet2[8] = vet2[8]+1;
                    break;
                case 10:
                    vet2[9] = vet2[9]+1;
                    break;    
            }
        }
            System.out.printf("|  NOTA  |  F A  |  F R  |\n");  
        for (int i = 0; i < 10; i++) {
            
            if(i==9){
                System.out.printf("|   %d   |   %.0f   |  %.1f  |", i+1, vet2[i], vet2[i]/10);
            }else{
                System.out.printf("|   %d    |   %.0f   |  %.1f  |", i+1, vet2[i], vet2[i]/10);
            }
            
            System.out.printf("\n");
            
            
            }
    
    }
}
