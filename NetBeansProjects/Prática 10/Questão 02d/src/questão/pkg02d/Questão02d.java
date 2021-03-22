/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02d;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão02d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int vet1[][] = new int[3][10];
        int aux1=0, soma=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                vet1[i][j] = j;
            }
        }
        
        while ( aux1 != 1 && aux1 != 2 && aux1 != 3){
            System.out.println("Qual linha deseja ver a média? (1,2 ou 3)");
            aux1 = sc1.nextInt();    
        }

        switch(aux1){
            case 1:
                for (int i = 0; i <10; i++) {
                    soma = soma + vet1[aux1-1][i]; 
                }
                System.out.printf("A média da linha %d é: %d", aux1, (soma/vet1[aux1-1].length));
                    
                break;
            case 2:
                for (int i = 0; i <10; i++) {
                    soma = soma + vet1[aux1-1][i]; 
                }
                System.out.printf("A média da linha %d é: %d", aux1, (soma/vet1[aux1-1].length));
                
                break;
            case 3:  
                for (int i = 0; i <10; i++) {
                    soma = soma + vet1[aux1-1][i]; 
                }
                System.out.printf("A média da linha %d é: %d", aux1, soma/vet1[aux1-1].length);
                
                break;
        }
            
        
        
    }
    
}
