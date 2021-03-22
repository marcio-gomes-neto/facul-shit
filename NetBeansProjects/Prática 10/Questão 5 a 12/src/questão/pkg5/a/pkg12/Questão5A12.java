/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg5.a.pkg12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão5A12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<String> jogos = new ArrayList();
        int aux1 =0, aux3=0,aux4=0,tam=0;
        String aux2,swapAux;
        
        System.out.println("Array de Jogos ");
       
        while(aux1 != 9){
            System.out.println("Selecione sua opção: ");
            System.out.println("1 - Adicionar um jogo no array ");
            System.out.println("2 - Printar o array ");
            System.out.println("3 - Inserir elemento na primeira posição ");
            System.out.println("4 - Escolher elemento específico ");
            System.out.println("5 - Ordenar array ");
            System.out.println("6 - Ordenar aleatóriamente ");
            System.out.println("7 - Ordenar reversamente ");
            System.out.println("8 - Trocar 2 elementos de posição ");
            System.out.println("9 - Sair ");
            tam = jogos.size();
            aux1 = sc1.nextInt();
            
            switch(aux1){
                case 1:
                    System.out.println("Insira o nome do jogo: ");
                    aux2 = sc1.next();
                    jogos.add(aux2);
                    System.out.printf("\n\n\n\n\n%s foi adicionado!\n", aux2);
                    break;
                
                case 2:
                    System.out.println("\n\n\n\n\nO array é: ");
                    for (int i = 0; i < tam; i++) {
                        System.out.printf("%d - %s\n",i+1,jogos.get(i));
                    }
                    break;
                
                case 3:
                    System.out.println("Insira o valor da primeira posição: ");
                    aux2 = sc1.next();
                    jogos.add(0,aux2);
                    System.out.printf("\n\n\n\n\n%s foi adicionado na posição 1!\n",aux2);
                    break;
                
                case 4:
                    if(tam ==0){
                        System.out.printf("\n\n\n\n\nNão há elementos no array!");
                        break;
                    }
                    aux3 = 0;
                    while(aux3 <= 0){
                        System.out.println("Qual posição deseja acessar? (maior que 0!)");
                        aux3 = sc1.nextInt();
                    }
                    
                    if(aux3>(tam)){
                        while(aux3>(tam)){
                            System.out.printf("Selecione um tamanho igual ou menor que %d!\n",tam);
                            aux3 = sc1.nextInt();
                        }
                        System.out.printf("\n\n\n\n\nNa posição %d, temos o jogo %s \n", aux3, jogos.get(aux3-1));
                    }else{
                        System.out.printf("\n\n\n\n\nNa posição %d, temos o jogo %s \n", aux3, jogos.get(aux3-1));
                        
                    }
                    break;
                case 5:
                    Collections.sort(jogos);
                    System.out.println("\n\n\n\n\nO array ordenado é: ");
                    for (int i = 0; i < tam; i++) {
                        System.out.printf("%d - %s\n",i+1,jogos.get(i));
                    }
                    break;
                case 6:
                    Collections.shuffle(jogos);
                    System.out.println("\n\n\n\n\nO array ordenado aleatóriamente é: ");
                    for (int i = 0; i < tam; i++) {
                        System.out.printf("%d - %s\n",i+1,jogos.get(i));
                    }
                    break;
                case 7:
                    Collections.reverse(jogos);
                    System.out.println("\n\n\n\n\nO array ordenado reversamente é: ");
                    for (int i = 0; i < tam; i++) {
                        System.out.printf("%d - %s\n",i+1,jogos.get(i));
                    }
                    break;
                case 8:
                    if(tam == 1 || tam == 0){
                        System.out.printf("\n\n\n\n\nO array não tem elementos suficientes!\n");
                        break;
                    }
                    
                    aux3 =0; aux4=0;
                    System.out.println("Quais elementos vc deseja trocar de posição? (maior que 0!)");
                    
                    while(aux3 <= 0){  
                        System.out.println("1° posição: ");
                        aux3 =sc1.nextInt();
                        if(aux3>tam){
                            System.out.println("Tamanho inválido, deve ser menor ou igual "+ tam + "!");
                            aux3=0;
                        }
                    }
                    
                    while(aux4 <= 0){  
                        System.out.println("2° posição: ");
                        aux4=sc1.nextInt();
                        
                        if(aux4>tam){
                            System.out.println("Tamanho inválido, deve ser menor ou igual "+ tam + "!");
                            aux4=0;
                        }
                    }
                    swapAux = jogos.get(aux3-1);
                    jogos.set(aux3-1, jogos.get(aux4-1));
                    jogos.set(aux4-1,swapAux);
                    
                    System.out.printf("\n\n\n\n\nAgora, na posição %d temos %s e na posição %d temos %s\n", aux3, jogos.get(aux3-1),aux4,jogos.get(aux4-1));
                    break;
                
                case 9:    
                    System.out.println("Bye Bye");
                    break;
            }
        }
        
    }
    
}
