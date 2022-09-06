package exercicio8;

public class Exercicio8 {
	
	public void Exercicio7(){
		Pendulo pendulo1 = new Pendulo();
		pendulo1.Pendulo();
		
		pendulo1.adicionaOscilacao();
		pendulo1.adicionaOscilacao(5);
		pendulo1.adicionaOscilacao(60);
		pendulo1.adicionaOscilacao(900);
		pendulo1.adicionaOscilacao(27977);

		//exercicio 8
		Relojoaria estabelecimento = new Relojoaria();
		estabelecimento.Relojoaria();
		estabelecimento.adicionaPendulo(pendulo1);
		estabelecimento.printaPendulos();
		
		Pendulo pendulo2 = new Pendulo();
		pendulo2.Pendulo(1);
		Pendulo pendulo3 = new Pendulo();
		pendulo3.Pendulo(10,49);
		Pendulo pendulo4 = new Pendulo();
		pendulo4.Pendulo(0,2000,10);
		
		estabelecimento.adicionaPendulo(pendulo2);
		estabelecimento.adicionaPendulo(pendulo3);
		estabelecimento.adicionaPendulo(pendulo4);
		System.out.println("\n\n\n");
		estabelecimento.printaPendulos();

		
	}
}
