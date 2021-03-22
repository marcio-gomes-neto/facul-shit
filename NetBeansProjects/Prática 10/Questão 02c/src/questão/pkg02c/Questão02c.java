/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02c;


/**
 *
 * @author Marci
 */
public class Questão02c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet1[][] = new int[3][10];
        int soma=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                vet1[i][j] = j;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                soma = soma + vet1[i][j];
            }
        }
        
        System.out.println("A soma de todos os valores da matriz é: "  + soma);
        
    }
    
}
