/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02e;

/**
 *
 * @author Marci
 */
public class Questão02e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet1[][] = new int[3][10];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                vet1[i][j] = j;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if(vet1[i][j]%2 == 0 ){
                //par
                    vet1[i][j] = 1;
                }else{
                //ímpar
                    vet1[i][j] = -1;
                }
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf(" %d ",vet1[i][j]);
            }
            System.out.printf("\n");
        }
        
        
        
    }
    
}
