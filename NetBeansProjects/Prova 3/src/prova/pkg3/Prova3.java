/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova.pkg3;
import java.util.Scanner;

public class Prova3 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int qtd = 0;
        char letra;
        
        System.out.printf("Digite uma frase: \n");
        String frase = in.nextLine();
        
        System.out.println("Digite uma letra: ");
        letra = in.next().charAt(0);
        
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                qtd = qtd+1;
            }
        }
        System.out.printf("A frase: %s , tem um total de: %d letras %c", frase, qtd,letra );
    }
    
}
