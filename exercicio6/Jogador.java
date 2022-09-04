package exercicio6;

/*Pega o usuario em questao e organiza como se
* fosse um jogo de adivinhacao, e coloca em
* uma lista no arraylist 'listaJogadores'
* no main.
*/
public class Jogador {
	int valorMaxEscolhido;
	String nome;
	int tentativas;
	
	public void Jogador(){
		this.valorMaxEscolhido = 10;
		this.nome = "nome default";
		this.tentativas = 0;
	}
	
	//sobrescrita
	public void Jogador(int valor, String nomeDado){
		this.nome = nomeDado;
		this.valorMaxEscolhido = valor;
	}
}