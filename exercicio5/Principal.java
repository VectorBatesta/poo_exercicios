package exercicio5;

import java.util.Scanner;

public class Principal {
	Scanner inputTeclado = new Scanner(System.in);
	
	public void Principal(){
		int valorRandom;
		int valorInput;
		
		Descobrir pegarRandom = new Descobrir();
		valorRandom = pegarRandom.Descobrir();
		
		valorInput = -1;
		int logic = 0;
		while (logic != 1){
			System.out.println("Digite um valor entre 1 a 10\nValor: ");
			valorInput = inputTeclado.nextInt();
			
			System.out.println("\n\n\n\n\n\n\n");
			
			int dif = pegarRandom.Adivinhacao(valorInput);
			if (dif == 0)
				logic = 1;
			else if (dif > 0)
				System.out.println("O valor aleatorio esta acima do escolhido.");
			else
				System.out.println("O valor aleatorio esta abaixo do escolhido.");
		}
		
		System.out.println("Bloco descoberto.\n" +
				"3.5 BTC foram creditados na sua carteira.");
	}
}
