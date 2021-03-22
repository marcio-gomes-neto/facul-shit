/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão.pkg01;


/**
 *
 * @author Marci
 */
public class circle {

        public double raio;
	public String cor;

        
        public circle(double radius, String color){
            this.raio = radius;
            this.cor = color;
        }

	public double getRaio(){
		return this.raio;
	}

	public double getArea(){
            double aux1;
            aux1 =3.14*(this.raio*this.raio);
            
            return (aux1);
                
	
        }
}
