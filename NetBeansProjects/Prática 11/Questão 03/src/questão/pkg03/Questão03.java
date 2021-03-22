/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Stack;

/**
 *
 * @author Marci
 */
public class Questão03 {
  static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack < Double > intList = new Stack < >();
        Stack < String > charList = new Stack < >();
        Stack < String > specCharList = new Stack < >();
        
        Scanner sc1 = new Scanner(System.in);
        String str = "";
        double aux1, num;
        boolean b;
        
        while(!str.equals("*")){
            System.out.printf("Insira um elemento, caso deseje sair, digite * \n");
            str = sc1.next();
            Pattern p = Pattern.compile("[^A-Za-z0-9]");
            Matcher m = p.matcher(str);
            b = m.find();
            
            if(str.equals("*")){
                break;
                
            }else if(isDouble(str)){
                num = Double.parseDouble(str);
                intList.push(num);
                System.out.println("Um número foi adicionado\n");
            }else if(b){
                specCharList.push(str);
                System.out.println("Um caractere especial foi adicionado\n");
            }else{
                charList.push(str);
                System.out.println("Um caratere foi adicionado\n");
            }
        }    
        System.out.println("A lista de inteiros tem " +intList.size()+" valores");
        System.out.println("A lista de caracteres tem " +charList.size()+" valores");
        System.out.println("A lista de caracteres especiais tem " +specCharList.size()+" valores");
    }
}
