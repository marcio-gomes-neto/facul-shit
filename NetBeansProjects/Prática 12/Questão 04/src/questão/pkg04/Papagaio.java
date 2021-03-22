/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg04;

/**
 *
 * @author Marci
 */
public class Papagaio extends Passaro {
 public Papagaio (String n) {
    super (n);
 }

 public void talk (String word) {
     System.out.println(word+"! " + word +"!");
 }
 
}
