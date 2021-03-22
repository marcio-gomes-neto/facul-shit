package prova.pkg1;

import java.util.Scanner;
        
public class Prova1 {
//Escrever um programa em Java que leia o preço de n produtos, calcule e mostre o total a ser pago pelo cliente. O cliente tem desconto de 10% se o pagamento for com dinheiro.

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        float qtd,prc,soma=0,cont=0;
        
        System.out.printf("Qual a quatidade de produtos?\n");
        qtd = sc1.nextFloat();
        
        for(int i=0; i<qtd;i++){
            System.out.printf("Por enquanto o total é: %.2f\n", soma);
            System.out.printf("Insira o valor do %d° item\n", i+1);
            prc = sc1.nextFloat();
            
            soma = soma+prc;
        }
        while(cont!= 1 && cont!= 2){
            
            System.out.printf("\n\n\nQual a forma de pagamento?\n");
            System.out.printf("1 - Dinheiro (com o valor de %.2f)\n", soma*0.90);
            System.out.printf("2 - Cartão (com o valor de %.2f)\n",soma);
            cont = sc1.nextFloat();
        } 
        
        if(cont == 1){
            System.out.printf("\n\n\n O preço final ficou em %.2f com pagamento em dinheiro", soma*0.90);
        }else{
            System.out.printf("\n\n\n O preço final ficou em %.2f com pagamento em cartão", soma);
        }
        
    }

}
       

    
