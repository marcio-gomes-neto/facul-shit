/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg01;
import java.util.Queue;
import java.util.LinkedList; 
import java.util.Scanner;


public class Questão01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue <String> filaBanco = new LinkedList < >();
        Scanner sc1 = new Scanner(System.in);
        String aux1;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu nome: ");
            aux1 = sc1.next();
            filaBanco.add(aux1);
            if(i==2){
                System.out.println(aux1 + " entrou na fila!");
            }else{
                System.out.println("\n\n" + aux1 + " entrou na fila!");
            }
        } 
        
        System.out.println("\n\n");
        for (int i = 0; i < 3; i++) {
            aux1 = filaBanco.peek(); 
            System.out.printf(aux1 + " foi atendido!\n" );
            filaBanco.poll();
        }
    }
    
}
