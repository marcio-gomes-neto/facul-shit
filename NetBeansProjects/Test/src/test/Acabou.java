/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Marci
 */
public class Acabou {

  private int x;

  public Acabou () {
    x = 10;
  }

  public Acabou (int c, int d) {
    x = c + d;
  }

  public int getX() {
    return x;
  }

  public void m1(int a) {
    int p;
    try {
          p = x % a;
          if (p < 4) {
            p = 1;
          }
    } catch (Exception e) {
             x += 5;
             return;
   } finally {
           x += 9;
    }
 }
}
