package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	Scanner inputTeclado = new Scanner(System.in);
	Descobrir pegarRandom = new Descobrir();
	ArrayList<Jogador> listaJogadores = new ArrayList<>();
	
	public void Principal(){
		int valorRandom;
		
		pegarRandom.Descobrir();
		
		System.out.println("selecione o valor maximo:");
		int valorMax = inputTeclado.nextInt();
		
		inputTeclado.nextLine(); //buffer do \n do nextInt anterior
		
		System.out.println("indique o seu nome:");
		String nomePlayer = inputTeclado.nextLine();
		
		Jogador jogador1 = new Jogador();
		jogador1.Jogador(valorMax, nomePlayer);

		adivinharValor(jogador1);
		listaJogadores.add(jogador1);
		
		System.out.println("Bloco descoberto.\n" +
				"3.5 BTC foram creditados na sua carteira.\n"
				+ "Valor random: " + pegarRandom.valor);
		
		printaJogadores();
	}
	
	public void adivinharValor(Jogador player){
		int valorInput;
		
		while (true){
			player.tentativas++;
			System.out.println("\nDigite um valor entre 1 a 10\nValor: ");
			valorInput = inputTeclado.nextInt();
			
			System.out.println("\n\n\n\n\n\n\n");
			
			int dif = pegarRandom.valor - valorInput;
			if (dif == 0)
				break;
			else if (dif > 0)
				System.out.println("O valor aleatorio esta acima do escolhido.");
			else
				System.out.println("O valor aleatorio esta abaixo do escolhido.");
		}
	}
	
	public void printaJogadores(){
		System.out.println("\n[APERTE ENTER PARA PRINTAR JOGADORES]");
		inputTeclado.nextLine();
		
		for(Jogador i: listaJogadores){
			System.out.println("nome jogador: " + i.nome + "\t"
					+ "tentativas: " + i.tentativas + "\t"
					+ "valor max escolhido: " + i.valorMaxEscolhido);
		}
	}
}