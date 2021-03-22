/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício.pkg2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marci
 */
public class Exercício2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList();
        
        System.out.println("Com números pares: ");
        //adicionar numero de 1 a 25
        for (int i = 0; i < 25; i++) {
            nums.add(i+1);
        }
        
        for(Integer i:nums ){
            
            System.out.println(i);
        }
        for (int i = 0; i < nums.size(); i++) {
            
            if(nums.get(i)%2==0){
                nums.remove(i);
            }
        }
        System.out.println(" ");
        System.out.println("Sem números pares: ");
        for(Integer i:nums ){
            
            System.out.println(i);
        }
        
        
    }
    
}
