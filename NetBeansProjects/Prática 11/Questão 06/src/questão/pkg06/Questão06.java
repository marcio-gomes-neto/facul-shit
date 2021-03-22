/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg06;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.*;
import java.util.Stack;

/**
 *
 * @author Marci
 */
public class Questão06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        LinkedList < String > test = new LinkedList < >();
        Stack < Character > palavraPilha = new Stack <>();
        Queue < Character > palavraFila = new LinkedList < >();
        
        int cont;
        String str1;
        char[] letras;
        
        System.out.println("Palindrômica ou não?");
        System.out.println("Digite uma palavra: ");
        str1 = sc1.next();
        letras = str1.toCharArray();
        int tam=letras.length;
        
        for (int i = 0; i < letras.length; i++) {
            
            palavraPilha.push(letras[i]);
            palavraFila.add(letras[i]);
        }        
        cont = 0;
        for (int i = 0; i < letras.length; i++) {
            if(letras[i] == palavraPilha.pop()){
                cont++;
            }
        
        }
        if(cont == letras.length){
            System.out.println("\n\nUsando o método de pilha descobri que: ");
            System.out.println("A palavra " + str1 + " é Palindrômica");
        }else{
            System.out.println("\n\nUsando o método de pilha descobri que: ");
            System.out.println("A palavra " + str1 + " não é Palindrômica");
        }
        
        
        //metodo de fila

        Character[] letrasReverse = new Character[letras.length];

        for (int i = 0; i < letrasReverse.length; i++) {
            tam = tam-1;
            letrasReverse[i] = letras[tam];
        } 
        
        cont = 0;
        for (int i = 0; i < letras.length; i++) {
            if(Objects.equals(letrasReverse[i], palavraFila.poll())){
                cont++;
            }
        
        }
        if(cont == letras.length){
            System.out.println("\n\nUsando o método de fila descobri que: ");
            System.out.println("A palavra " + str1 + " é Palindrômica");
        }else{
            System.out.println("\n\nUsando o método de fila descobri que: ");
            System.out.println("A palavra " + str1 + " não é Palindrômica");
        }
    
    }
}
