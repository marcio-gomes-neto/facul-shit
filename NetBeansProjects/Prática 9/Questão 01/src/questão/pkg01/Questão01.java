/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg01;
import java.util.Scanner;

public class Questão01 {
public static void main(String[] args) {
    
    Scanner sc1 = new Scanner(System.in);
    int num, qtd=0,p=0;
    int[] vet = new int[10];
    float div;
    
    System.out.println("Insira 10 números no vetor");
    
       for(int j = 0; j < 10; j++) {        
           qtd = 0;
           System.out.println("Insira o "+ (j+1) + "° número");
           num = sc1.nextInt();
           vet[j] = num;        
        }
        
        for (int j = 0; j < 10; j++) {
            
            
            for(int i = 1; i<=vet[j];i++){
                
                div = vet[j]%i;
                if(div == 0){
                    qtd = qtd+1;
                }
            }
            
            if(qtd == 2){
                    System.out.println("O número " + vet[j] + " na posição " + j + " é primo!");
                }
            qtd = 0;
        }   
    }
}