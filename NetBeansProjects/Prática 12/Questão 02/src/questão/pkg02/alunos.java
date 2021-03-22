/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02;

import java.util.Arrays;

/**
 *
 * @author Marci
 */
public class alunos {
    public String nome;
    public int registroAluno;
    public int[] notas = new int[5];
    
    public alunos(String nome,int ra,int[] notas){
        this.nome = nome;
        this.registroAluno = ra;
        System.arraycopy(notas, 0, this.notas, 0, 5);
    }
    
    public void getInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("RA: " + this.registroAluno);
        System.out.println("Notas: " + Arrays.toString(notas));
    }
}
