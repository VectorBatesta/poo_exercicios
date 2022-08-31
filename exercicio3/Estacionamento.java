package exercicio3;

import java.util.ArrayList;

public class Estacionamento {
	ArrayList<Carro> listaCarros;
	
	public void Estacionamento(){
		this.listaCarros = new ArrayList<>();
	}

	public void registraCarro(Carro novoCarro){
		novoCarro.registrarEntrada();
		this.listaCarros.add(novoCarro);
	}
	
	public void removeCarro(Carro carroSaida){
		this.listaCarros.remove(carroSaida);
		carroSaida.registrarSaida();
	}
}
