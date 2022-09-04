package exercicio4;

import java.util.ArrayList;

/* classe companhia a qual é dona dos estacionamentos em arraylist para
 * salvar varios estacionamentos na memoria
 */
public class Companhia {
	ArrayList<Estacionamento> listaEstabelecimentos;
	String nomeCompanhia;
	
	public void Companhia(String nome){
		this.listaEstabelecimentos = new ArrayList<>();
		this.nomeCompanhia = nome;
	}
	
	public void adicionaEstacionamento(Estacionamento novo){
		this.listaEstabelecimentos.add(novo);
	}
	
	public void printaEstabelecimentos(){
		System.out.println("\nprintando conteudo da lista de estabelecimentos " + 
				            this.nomeCompanhia + ".");
		for (Estacionamento i: this.listaEstabelecimentos){
			for (Carro j: i.listaCarros){
				System.out.println("placa: " + j.placa + " " +
						           "tipo: " + j.tipoVeiculo);
			}
			System.out.println("\n");
		}
	}
}
