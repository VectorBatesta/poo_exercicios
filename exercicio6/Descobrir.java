package exercicio6;

import java.util.Random;

public class Descobrir {
	Random intAleatorio = new Random(); 
	int valor;
	int maxRandom; //exercicio6
	
	public void Descobrir(){
		maxRandom = 10; //exercicio6
		
		this.valor = intAleatorio.nextInt(maxRandom); //0 ate 9
		this.valor++; //1 ate 10
	}
}