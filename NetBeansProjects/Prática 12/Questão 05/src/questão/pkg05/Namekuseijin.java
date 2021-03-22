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
public class Namekuseijin extends PersonagemDragonBall {
    
    public Namekuseijin(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    private int quantidadeEsferas;
    private boolean podeCurar;
    
    public String fazerDesejo(String pedido){
        if(pedido.length()<10){
            return "á-G¢ä▲ u©pæ";
        }else if(pedido.length()<15){
            return "mÏ┴b4○#öýÆó";
        }else if(pedido.length()<15){
            return "Ää!▓çZH*";
        }else if(pedido.length()<20){
            return "☼♦‗ÏÍz█♦ìÏ";
        }else{
            return "ï¿1⁄2 übÑ1‼ä‗ä┤•▼b";
        }   
    }    
    public void setEsferas(int qtd){
        this.quantidadeEsferas = qtd;
    }
    public void setCura(boolean a){
        this.podeCurar = a;
    }
}
