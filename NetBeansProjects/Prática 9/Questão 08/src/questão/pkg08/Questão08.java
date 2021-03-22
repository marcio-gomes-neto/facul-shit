/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg08;

import java.util.Scanner;

/**
 *
 * @author Marci
 */
public class Questão08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String vet1[] = new String[5];
        float vet2[] = new float[5];
        float maior=0;
        String posMaior= "";
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o Modelo: ");
            vet1[i] = sc1.next();
            System.out.printf("Insira o consumo (km/L): ");
            vet2[i] = sc1.nextFloat();
            
            if(vet2[i]> maior){
                maior = vet2[i];
                posMaior = vet1[i];
            }
        }
        
        System.out.println("Modelo mais econômico: " + posMaior);
        
        for (int i = 0; i < 5; i++) {
            System.out.printf(" Modelo: %s      Consumo em 1000km: %.2f\n" , vet1[i],1000/vet2[i] );
        }
        
        
    }
    
}
