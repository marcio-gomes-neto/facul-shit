/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg05;

import java.util.Stack;

/**
 *
 * @author Marci
 */
public class Questão05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack < Integer > customer = new Stack <>();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Cliente " +(i+1)+ " entrou!");
            customer.push(i);
        }
        
        System.out.println("\n\n\n");
        
        for (int i = 0; i < customer.size(); i++) {
            System.out.println("Cliente " + (customer.pop()+1) + " saiu!");
            i--;
        }
    }
    
}
