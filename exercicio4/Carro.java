package exercicio4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Carro {
	String tipoVeiculo;
	String placa;
	SimpleDateFormat formatoHora = new SimpleDateFormat("mmmmms");
	Date horarioEntrada;
	Date horarioSaida;
	long precoCalculado;
	
	public void Carro(){
		this.tipoVeiculo = "popular";
		this.placa = "AAAAAAA";
	}
	
	public void registrarNovoCarro(String tipo, String placa){
		this.tipoVeiculo = tipo;
		this.placa = placa;
	}
	
	public void registrarEntrada(){
		Date momento = new Date();
		this.horarioEntrada = momento;
	}
	
	public void registrarSaida(){
		Date momento = new Date();
		this.horarioSaida = momento;
		
		this.calculaPreco();
	}
	
	
	
	public long calculaTempoEmMinutos(){
		long tempoDif = this.horarioSaida.getTime() - this.horarioEntrada.getTime();
		tempoDif /= (1000 * 60); //diferenca de tempo de milisegundos para minutos
		return tempoDif;
	}
	
	public long calculaPreco(){
		long tempoDif = calculaTempoEmMinutos();
		
		if (tempoDif < 30){ //< 30 min -> de gratis
			this.precoCalculado = 0;
			return this.precoCalculado;
		} 
		else if(tempoDif < 60){ //< 60 min -> 10 reais
			this.precoCalculado = 10;
			return this.precoCalculado;
		}
		
		//default: maior q 60 minutos = 20 reais
		this.precoCalculado = 20;
		return this.precoCalculado;
	}
}
