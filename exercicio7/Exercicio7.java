package exercicio7;

/*
Elabore um programa orientado a objetos em linguagem de
programação Java que possua 2 (duas) classes: a classe Principal
e a classe Pendulo. A classe Principal deve invocar a classe Pendulo.
A classe Pendulo possui métodos acessores e mutadores para
atribuir a quantidade de oscilações em um display gráfico da
seguinte forma: 

A:[0,30] B:[0,30] C: [0,30]

Por exemplo, se a quantidade de oscilações é maior que 30,
o display C retorna para o valor 0 (zero) e incrementa uma unidade
no display B. Se a quantidade de oscilações no display B é maior
que 30, o display B e C retornam para 0 (zero) e o display A é
incrementado em 1 (uma) unidade.
 */
public class Exercicio7 {
	
	public void Exercicio7(){
		Pendulo pendulo1 = new Pendulo();
		pendulo1.Pendulo();
		
		pendulo1.adicionaOscilacao();
		pendulo1.adicionaOscilacao(5);
		pendulo1.adicionaOscilacao(60);
		pendulo1.adicionaOscilacao(900);
		pendulo1.adicionaOscilacao(27977);

		
	}
}
