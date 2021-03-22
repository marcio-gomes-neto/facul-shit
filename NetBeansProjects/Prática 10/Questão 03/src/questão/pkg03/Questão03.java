/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg03;

/**
 *
 * @author Marci
 */
public class Questão03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vet1[][] = new int[5][5];
        String vet2[] = new String[5];
        vet2[0] = "João |";vet2[1]="Pedro|";vet2[2] = "Maria|";
        vet2[3]="Clara|";vet2[4]="Lucas|";
        
        System.out.printf("\n\n\n\n Todos são amigos: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(j==i){
                    vet1[i][j] = 0;
                } else {
                    vet1[i][j] = 1;
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
        
        System.out.printf("\n\n\n\n Apenas Pedro e Maria são amigos: \n");
        //Apenas Pedro e Maria são amigos
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if((i==1 && j==2) || (i==2 && j==1)){
                    vet1[i][j] = 1;
                } else {
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
        
        System.out.printf("\n\n\n\n Pedro é amigo de Maria e Clara, João é amigo de Lucas e Pedro: \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                if((i==2 && j==3) || (i==3 && j==2)){
                    vet1[i][j] = 1;
                    
                } else if((i==0 && j==4)||(i==4 && j==0)){
                    vet1[i][j] = 1;
                    
                } else if((i==0 && j==1)||(i==1 && j==0)){
                    vet1[i][j] = 1;
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
