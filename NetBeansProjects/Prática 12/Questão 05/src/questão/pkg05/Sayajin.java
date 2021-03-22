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
public class Sayajin extends PersonagemDragonBall{
    
    public Sayajin(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    private int nivelMaxSSJ;
    private boolean temRabo;
    
    public String transform(int nivel){
        if(nivel>5 || nivel<=0){
            return("Nível não reconhecido!");
        }else{  
            if(nivel==4 || nivel==5){
                if(this.nome == "Goku" || this.nome == "Vegeta"){
                    return(this.nome+" transformou para super sayajin nível " + nivel+"!");
                } else {
                    return("Não foi possível transformar esse sayajin");
                }
            }else{
                return(this.nome+" transformou para super sayajin nível " + nivel+"!");
            }
        }
        
    }
    public void setNivelMax(){
        if(this.nome == "Goku" || this.nome == "Vegeta"){
            this.nivelMaxSSJ = 5;
        }else {
            this.nivelMaxSSJ = 3;
        }
    }
    public void setTemRabo(boolean rabo){
        this.temRabo = rabo;
    }
}
