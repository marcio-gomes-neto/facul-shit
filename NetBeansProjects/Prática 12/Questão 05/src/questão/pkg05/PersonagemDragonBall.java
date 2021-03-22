/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg05;

/**
 *
 * @author Marci
 */
public class PersonagemDragonBall {
    public String nome;
    private int idade;
    private String sexo;
    private int temporada;
    private int ki;
    private String poderEspecial;

    public PersonagemDragonBall(String nome, int idade, String sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void setTemporada(int temp){
        this.temporada = temp;
    }
    public void setKi(int ki){
        this.ki = ki;
    }
    public void setPoder(String poder){
        this.poderEspecial = poder;
    }
    
    public void getInfo(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Sexo: " +this.sexo);
        System.out.println("Temporada: " +this.temporada);
        System.out.println("K.I.: " +this.ki);
        System.out.println("Poder Espcial: " +this.poderEspecial);
        
    }
            
}
