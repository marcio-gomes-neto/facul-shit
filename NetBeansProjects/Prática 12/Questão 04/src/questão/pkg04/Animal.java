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
public abstract class Animal
{
  private String nome;

  public Animal(String n) {
    nome = n;
  }

  public void imp() {
    System.out.println("Nome: "+nome);
  }

  public String getName() { return(nome); }

  public abstract void talk();
}
