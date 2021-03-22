/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg05;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int gab[] = new int[20], resp[] = new int [20];
        int x=0,mat=0,crt;
        
        System.out.println("Insira o Gabarito (1-a/2-b/3-c/4-d): ");
        for (int i = 0; i < 20; i++) {
            x=0;
            
            while(x!=1 && x!=2 && x!=3 && x!=4 ){
                System.out.printf("%d - ", i+1);
                x = sc1.nextInt();
                gab[i] = x;
            }  
        }
        
        while(mat!= 999999){
            crt=0;
            System.out.println("Digite o número da matrícula: ");
            mat = sc1.nextInt();
            
            System.out.println("Digite suas respostas (1-a/2-b/3-c/4-d)");
            for (int i = 0; i <20; i++) {
                x=0;
                
                while(x!=1 && x!=2 && x!=3 && x!=4 ){
                    System.out.printf("%d - ", i+1);
                    x = sc1.nextInt();
                    resp[i] = x;
                }
                
                if(gab[i]==resp[i]){
                    crt++;
                
                }
            }
            System.out.println("Número do candidato: " + mat);
            System.out.println("Número de acertos: " + crt);
            if(crt>=14){
                System.out.println("SITUAÇÃO: APROVADO");
            }else{
                System.out.println("SITUAÇÃO: REPROVADO");
            }
        }
        
        
    }
    
}
