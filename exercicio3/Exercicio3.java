package exercicio3;

import java.util.Date;
import java.util.Scanner;

public class Exercicio3 {
	Scanner inputTeclado = new Scanner(System.in);
	
	public static void main(String [] args){
		Exercicio3 obj = new Exercicio3();
		obj.iniciar();
	}
	
	public void iniciar(){
		Carro carroDoMarcelo = new Carro();
		Estacionamento estacionamentoDoZe = new Estacionamento();
		estacionamentoDoZe.Estacionamento();
		
		carroDoMarcelo.registrarNovoCarro("camionete", "abc-1234");
		
		//registra carro do marcelo dentro do estacionamento
		estacionamentoDoZe.registraCarro(carroDoMarcelo);
		System.out.println("Carro do Marcelo esta no estacionamento do ze?\n" +
					"Resposta: " +
					estacionamentoDoZe.listaCarros.contains(carroDoMarcelo));

		
		
		System.out.println("\npressione algo + enter para remover carro do marcelo do estacionamento");
		inputTeclado.next();
		//codigo nao funciona direito em teoria, na pratica funcionaria melhor.
		//exemplo: remover carro do marcelo apos 10 horas
		//ou tambem: remover carro apos 30 minutos.

		// dificil de visualizar pois Date() tem o proprio formato.
		
		
		
		//remove carro do estacionamento
		estacionamentoDoZe.removeCarro(carroDoMarcelo);
		System.out.println("\n\nCarro do Marcelo esta no estacionamento do ze?\n" +
				    "Resposta: " +
					estacionamentoDoZe.listaCarros.contains(carroDoMarcelo));
		
		long precoEstadia = carroDoMarcelo.calculaPreco();
		
		System.out.println("Quanto Marcelo tem de pagar a ze?\nResposta: " +
					Long.toString(precoEstadia));
	}
}
