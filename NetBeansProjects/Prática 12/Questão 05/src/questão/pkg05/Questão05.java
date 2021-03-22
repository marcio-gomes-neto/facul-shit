/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg05;
import java.util.*;
/**
 *
 * @author Marci
 */
public class Questão05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sayajin goku = new Sayajin("Goku", 44,"Masculino");
        Terraqueo kuririn = new Terraqueo("Kuririn", 44, "Masculino");
        Sayajin gohan = new Sayajin("Gohan", 23, "Masculino");
        Namekuseijin dende = new Namekuseijin("Dendê", 30, "Masculino");
        
        System.out.println(goku.transform(5));
        if(gohan.transform(5)=="Não foi possível transformar esse sayajin"){
            System.out.println(gohan.transform(3));
        }else{
            System.out.println(gohan.transform(5));
        }
        
        System.out.println(dende.fazerDesejo("reviver goku!"));
    }
    
}
