/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg07;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int vet1[] = new int[10];
        float vet2[] = new float[10];
        float total=0,prcTotal=0,maior=0;
        int posMaior=0;
        
        for (int i = 0; i < 2; i++) {
            System.out.printf("Insira a quantidade do produto %d: ", i+1);
            vet1[i] = sc1.nextInt();
            System.out.printf("Insira o valor do produto %d: ", i+1);
            vet2[i] = sc1.nextFloat();
        
            total = total + (vet1[i] * vet2[i]);
            
            if(vet1[i] > maior ){ 
                maior = vet2[i];
                posMaior = i;
            }
                                   
        }
        
        
        System.out.println("|                  Relatório                   |");
        System.out.printf("|  n° Prod    Qtd      Preço       Total  \n");
        for (int i = 0; i < 10; i++) {
            if(i==9){
                System.out.printf("|    %d        %d       %.2f       %.2f   \n",i+1, vet1[i],vet2[i],vet1[i]*vet2[i]  );
            }else{
                System.out.printf("|    %d         %d       %.2f       %.2f   \n",i+1, vet1[i],vet2[i],vet1[i]*vet2[i]  );
            }  
        }
        System.out.printf("|\n|\n| Objeto mais vendido: n°%d", posMaior+1);
        System.out.printf("\n| Preço: %.2f ", maior);
        
        System.out.printf("\n|\n| Valor total das vendas: %.2f", total);
        System.out.printf("|\n| Valor da Comissão: %.2f\n\n", total*0.05);
       
        
    }
    
}
