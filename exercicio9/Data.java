package exercicio9;

public class Data {
	int dia, mes, ano;
	
	public void setData(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
