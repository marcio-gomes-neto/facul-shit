/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numero.primo;
import java.util.Scanner;
/**
 *
 * @author Marci
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    float num, div, qtd=0,primo;
    
    System.out.println("Digite um número: ");
    num = sc1.nextFloat();
    
    for(int i = 0; i<num;i++){
        
        div = num%(i+1);
        System.out.println(div);
        if(div == 0){
            qtd = qtd+1;
        }
    }
    
    if(qtd == 2 ){
        System.out.println("é primo");
    }
    }
    
}
