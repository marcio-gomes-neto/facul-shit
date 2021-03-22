/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.pkg2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Marci
 */
public class Prova2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String n = "";
        ArrayList<Double> numeros = new ArrayList();
        int  total=0, mid=0;
        double num = 0, media = 0, mediana,maior=0,menor=0;

        while(!n.equals("*")){
            System.out.printf("Insira um número, caso deseje sair, digite * \n");
            n = sc1.next();
            
            if(n.equals("*")){
                break;
                
            }else{
                //converte string pra double
                num = Double.parseDouble(n);
                //push no array
                numeros.add(num);
                //adiciona na média
                media = media + num;
                
                if(num>maior){
                    maior = num;
                }
                
                if(menor==0){
                    menor = num;
                }
                
                if(menor>num){
                    menor = num;
                }
                
                total=total+1;
            }
        }
        
        Collections.sort(numeros);
        int tam = numeros.size();
        
        if(tam%2==1){
            mid = tam/2;
            mediana = numeros.get(mid);
        }else{
            mid = tam/2;
            mediana = (numeros.get(mid) + numeros.get(mid-1))/ 2.0;
        }
        
        System.out.printf("O maior número é: %.1f\n", maior);
        System.out.printf("O menor número é: %.1f\n", menor);
        System.out.printf("A mediana é: %.1f\n", mediana);
        System.out.printf("A média é: %.1f\n", media/total);
        
    }
    
}
