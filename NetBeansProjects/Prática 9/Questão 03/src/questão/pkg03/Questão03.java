/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg03;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int ano,div;
        float tax;
        
        System.out.println("Insira o valor da dívida: ");
        div = sc1.nextInt();
        
        System.out.println("Insira o valor da taxa (em %): ");
        tax = sc1.nextFloat();
        
        System.out.println("Insira a quantidade de anos: ");
        ano = sc1.nextInt();
        
        float[] vet1 = new float[ano*12];

        for (int i = 0; i < vet1.length; i++) {
            if(i==0){
                vet1[i] = div;
            }else{
                vet1[i] = vet1[i-1]*((tax+100)/100);
            } 
        }
        
        System.out.printf("| ANO  |  JAN   |  FEV   |  MAR   |  ABR   |  MAI   |  JUN   |  JUL   |  AGO   |  SET   |  OUT   |  NOV   |  DEZ   | \n");
        for (int i = 0; i < ano; i++) {
            System.out.printf("|------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|");
            System.out.printf("\n| Ano %d |", i+1);
            for (int j = 0; j < 12; j++) {
                
                System.out.printf(" %.2f |", vet1[j + (12*i)]);
                
            }
            
            System.out.printf("\n");
        }
        System.out.printf("|------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|--------|");
    }
        
    }
