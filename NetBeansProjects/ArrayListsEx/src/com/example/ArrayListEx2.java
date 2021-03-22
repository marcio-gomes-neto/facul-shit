/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList();
        Iterator<Integer> iterator = nums.iterator();
        
        //adicionar numero de 1 a 25
        for (int i = 0; i < 25; i++) {
            nums.add(i+1);
        }
        
        while(iterator.hasNext()){
            
            System.out.println(iterator.next());
        
        }
        
        
        
         
    }
}
