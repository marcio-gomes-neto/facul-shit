/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package questão.pkg01;


/**
 *
 * @author Marci
 */
public class Questão01 {

    public static void main(String[] args){
        circle circulo1 = new circle(9.3, "red");
        circle circulo2 = new circle(12, "green");
               
        System.out.println("A área do círculo 1 é: " + circulo1.getArea());
        System.out.println("O raio do círculo 2 é: "+circulo2.getRaio());
        
    }  
}
