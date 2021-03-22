/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg02;
import java.util.*;
/**
 *
 * @author Marci
 */
public class Questão02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String nome;
        int ra, maiorNota=0, media=0, mediaTres=0;
        int[] notas = new int[5];
        
        System.out.println("Digite o nome do aluno 1: ");
        nome = sc1.next();
        System.out.println("Digite o RA do aluno 1: ");
        ra = sc1.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno 1: ");
            notas[i] = sc1.nextInt();
            media += notas[i];
            if(notas[i]>maiorNota){
                maiorNota = notas[i];
            }
        }
        alunos aluno1 = new alunos(nome, ra, notas);

        System.out.println("Digite o nome do aluno 2: ");
        nome = sc1.next();
        System.out.println("Digite o RA do aluno 2: ");
        ra = sc1.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno 2: ");
            notas[i] = sc1.nextInt();
            media += notas[i];
            if(notas[i]>maiorNota){
                maiorNota = notas[i];
            }
        }
        alunos aluno2 = new alunos(nome, ra, notas);
        
        System.out.println("Digite o nome do aluno 3: ");
        nome = sc1.next();
        System.out.println("Digite o RA do aluno 3: ");
        ra = sc1.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno 3: ");
            notas[i] = sc1.nextInt();
            mediaTres += notas[i];
            media += notas[i];
            if(notas[i]>maiorNota){
                maiorNota = notas[i];
            }
        }
        alunos aluno3 = new alunos(nome, ra, notas);
        
        System.out.println("Digite o nome do aluno 4: ");
        nome = sc1.next();
        System.out.println("Digite o RA do aluno 4: ");
        ra = sc1.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno 4: ");
            notas[i] = sc1.nextInt();
            media += notas[i];
            if(notas[i]>maiorNota){
                maiorNota = notas[i];
            }
        }
        alunos aluno4 = new alunos(nome, ra, notas);
        
        System.out.println("Digite o nome do aluno 5: ");
        nome = sc1.next();
        System.out.println("Digite o RA do aluno 5: ");
        ra = sc1.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota " + (i+1) + " do aluno 5: ");
            notas[i] = sc1.nextInt();
            media += notas[i];
            if(notas[i]>maiorNota){
                maiorNota = notas[i];
            }
        }
        alunos aluno5 = new alunos(nome, ra, notas);
        
        
        
        
        System.out.println("\nAluno 1: ");
        aluno1.getInfo();
        System.out.println("\nAluno 2: ");
        aluno2.getInfo();
        System.out.println("\nAluno 3: ");
        aluno3.getInfo();
        System.out.println("\nAluno 4: ");
        aluno4.getInfo();
        System.out.println("\nAluno 5: ");
        aluno5.getInfo();
        
        System.out.println("\nMaior nota: " + maiorNota);
        System.out.println("Média das notas: " + (media/25));
        System.out.println("Média do terceiro aluno: " + (mediaTres/5));
    }
    
}
