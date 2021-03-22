/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg04;

/**
 *
 * @author Marci
 */
public class Questão04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet1[][] = new int[5][5];
        String vet2[] = new String[5];
        vet2[0] = "João |";vet2[1]="Pedro|";vet2[2] = "Maria|";
        vet2[3]="Clara|";vet2[4]="Lucas|";
        
        System.out.printf("\n\n\n\n Defina o nível de amizades entre todos como 0: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                vet1[i][j] = 0;
            }
        }
        
        System.out.printf("     | João  | Pedro | Maria | Clara | Lucas | \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s", vet2[i]);
            for (int j = 0; j < 5; j++) {
                
                System.out.printf("   %d   |", vet1[i][j]);
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n\n\n\nDefina a amizade de Pedro e Lucas como 3: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i==4 && j==2)||(i==2 && j==4)){
                    vet1[i][j] = 3;
                }else{
                    vet1[i][j] = 0;
                }
            }
        }
        
        System.out.printf("     | João  | Pedro | Maria | Clara | Lucas | \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s", vet2[i]);
            for (int j = 0; j < 5; j++) {
                
                System.out.printf("   %d   |", vet1[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n\n\n Defina a amizade de Clara e João como 2: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i==3 && j==0)||(i==0 && j==3)){
                    vet1[i][j] = 2;
                }else{
                    vet1[i][j] = 0;
                }
            }
        }
        
        System.out.printf("     | João  | Pedro | Maria | Clara | Lucas | \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s", vet2[i]);
            for (int j = 0; j < 5; j++) {
                
                System.out.printf("   %d   |", vet1[i][j]);
            }
            System.out.printf("\n");
        }
        
        System.out.printf("\n\n\n\n Defina a amizade de Clara e Maria como 3.: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i==3 && j==2)||(i==2 && j==3)){
                    vet1[i][j] = 3;
                }else{
                    vet1[i][j] = 0;
                }
            }
        }
        
        System.out.printf("     | João  | Pedro | Maria | Clara | Lucas | \n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s", vet2[i]);
            for (int j = 0; j < 5; j++) {
                
                System.out.printf("   %d   |", vet1[i][j]);
            }
            System.out.printf("\n");
        }
        
        
        
        
    }
    
}
