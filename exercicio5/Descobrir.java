package exercicio5;

import java.util.Random;

public class Descobrir {
	Random intAleatorio = new Random(); 
	int valor;
	
	public int Descobrir(){
		this.valor = intAleatorio.nextInt(10); //0 ate 9
		this.valor++; //1 ate 10
		return this.valor;
	}
	
	public int Adivinhacao(int entrada){
		return this.valor - entrada;
	}
}
