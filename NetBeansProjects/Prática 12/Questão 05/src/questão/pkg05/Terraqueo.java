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
public class Terraqueo extends PersonagemDragonBall {
    
    public Terraqueo(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    private String cidade;
    private String pais;
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    
    }
    
    public void setPais(String pais){
        this.pais = pais;
    
    }
    
}
