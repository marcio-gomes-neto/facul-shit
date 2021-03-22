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
class A {
    public String quemSouEu() { return "A"; }
}

class B extends A {
    public String quemSouEu() { return "B"; }
}

class C extends B {
    public String quemSouEu() { return "C"; }
}
