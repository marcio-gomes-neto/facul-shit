
package questão.pkg04;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;


public class Questão04 {
    static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc1 = new Scanner(System.in);
        LinkedList < String > list1 = new LinkedList < >();
        Stack < Integer > intList = new Stack < >();
        
        String ins = "asd";
        
        
         while(!ins.equals("*")){
             ins = "asd";
            while(ins.length()>1){
                
                System.out.printf("Insira um caractere, caso deseje sair, digite * \n");
                ins = sc1.next();
                
                
                if(ins.equals("*")){
                    System.out.println("Até mais!");
                
                }else if(ins.length()>1){
                    
                    System.out.println("\nDigite apenas 1 caractere!");
                }else{
                    System.out.println("");
                    list1.push(String.valueOf(ins)); 
                }
            }
        } //FIM DA CONSTRUÇÃO DA LISTA
         
        System.out.printf("\n\n\nLista encadeada completa = [");
        for (int i = 1; i <= list1.size(); i++) {
            if(i == list1.size()){
                System.out.printf("%s] ",list1.get(i-1));
            }else{
                System.out.printf("%s, ",list1.get(i-1));
            }
            
        }
        
        for (int i = 0; i < list1.size(); i++) {
            
            if(isDouble(list1.get(i)) ){
                
                intList.push(Integer.parseInt(list1.remove(i)));
                i--;
            }
            
        }
        
        System.out.printf("\nLista encadeada sem os números = [");
        if(list1.isEmpty()){
            System.out.printf(" ]");
        }else{
            for (int i = 1; i <= list1.size(); i++) {
                if(i == list1.size()){
                    System.out.printf("%s] ",list1.get(i-1));
                }else{
                    System.out.printf("%s, ",list1.get(i-1));
                }
            
            }
        }

        for (int i = 0; i < intList.size(); i++) {
            
            list1.addLast(String.valueOf(intList.pop()));
            i--;
        }
        
        System.out.printf("\nLista com números em ordem inversa = [");
        
        for (int i = 1; i <= list1.size(); i++) {
            if(i == list1.size()){
                System.out.printf("%s] ",list1.get(i-1));
            }else{
                System.out.printf("%s, ",list1.get(i-1));
            }
            
        }
        
    }
    
}
