package exercicio9;

public class Computador {
	Data data = new Data();
	String nome;
	String marca;
	
	public Computador setNome(String nome){
		this.nome = nome;
		return this;
	}
	public Computador setMarca(String marca){
		this.marca = marca;
		return this;
	}
	public void setData(int dia, int mes, int ano){
		this.data.setData(dia, mes, ano);
	}
}
