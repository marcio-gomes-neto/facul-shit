/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02;

import java.util.LinkedList;
import java.util.Scanner;

public class Questão02 {


    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        LinkedList < Integer > list1 = new LinkedList < >();
        int aux1;
        
        list1.push(1);
        list1.push(2);
        list1.push(3);
        list1.push(4);
        list1.push(5);
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - " + list1.get(i));
        }
        System.out.println("Qual elemento deseja remover? ");
        aux1 = sc1.nextInt();
        
        list1.remove(aux1);
        System.out.println(aux1 + " foi removido!");
        
        System.out.println("A pilha ficou: ");
        
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(i + " - " + list1.get(i));
        }
        
    }
    
}
