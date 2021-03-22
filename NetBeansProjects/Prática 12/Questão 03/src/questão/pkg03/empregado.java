/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg03;

import java.util.*;
import java.text.*;

public class empregado {
        String name;
        int age;
        Date dateIn;
        Date dateOut;
        double salary;
        
        public empregado(String name, int age, double salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.dateIn = new Date();
        }
        
        public void getInfo(){
            System.out.println("Nome: "+this.name);
            System.out.println("Idade: " + this.age);
            System.out.println("Salário: "+ this.salary);
            System.out.println("Data de Ingresso: " + this.dateIn);
            
        
        }
        public double getSalary(){
            return this.salary;
        }
        public void increaseSalary(double inc){
            inc /= 100;
            inc +=1;
            this.salary *= inc;
        }
        
        public void promote(){
            Date aux1 = new Date();
            if((aux1.getYear()-this.dateIn.getYear())>= 1){
                if(this.age>=18){
                    increaseSalary(25);
                }else{
                    System.out.println("Empregado é menor de idade!");
                }
            }else{
                System.out.println("Empregado não tem um ano de emprego!");
            }
            
        }
        public void dismiss(int cause){
            if (cause == 1 || cause == 2 || cause == 3 ){
                switch (cause){
                    case 1:
                        System.out.println("Demissão por justa causa");
                        System.out.println("Conclua o aviso prévio!");
                        break;
                    case 2:
                        System.out.println("Demissão pelo empregador ");
                        System.out.println("Deverá ser paga uma multa de: ");
                        System.out.println(this.salary*(0.40));
                        break;
                    case 3:    
                        System.out.println("Demissão via aposentadoria");
                        if (this.salary<1000){
                            System.out.println("Sem Salário de aposentadoria!");
                            
                        }else if(this.salary>=1000 && this.salary<2000){
                            System.out.println("Salário de aposentadoria: 1500");
                            
                        }else if(this.salary<3000){
                            System.out.println("Salário de aposentadoria: 2500");
                            
                        }else if(this.salary<4000){
                            System.out.println("Salário de aposentadoria: 3500");
                            
                        }else{
                            System.out.println("Salário de aposentadoria: 4000");
                            
                        };
                        break;
                }
            }else{
                System.out.println("Opção desconhecida!");
            }
        
        }
        public void birthday(){
            this.age += 1;
        }
        
}
