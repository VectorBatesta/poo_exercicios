package exercicio9;

public class Principal {
	public static void main(String[] args) {
		Computador c = new Computador();
		c.setNome("comp1").setMarca("Intel").setData(1,1,2001);
		
		System.out.println(c.nome + " " + c.marca + " " + c.data);
	}
}