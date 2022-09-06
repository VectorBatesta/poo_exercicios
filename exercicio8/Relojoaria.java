package exercicio8;

import java.util.ArrayList;

/* esta classe apenas agrupa os pendulos como se fosse
 * um estabelecimento que guarda pendulos em um array.
 * 
 * ps: perdao pela falta de originalidade
 */
public class Relojoaria {
	ArrayList<Pendulo> listaRelogios;
	
	public void Relojoaria(){
		listaRelogios = new ArrayList<>();
	}
	
	public void adicionaPendulo(Pendulo novo){
		this.listaRelogios.add(novo);
	}
	
	public void printaPendulos(){
		int x = 1;
		for (Pendulo i : listaRelogios){
			System.out.println("pendulo " + x + ":\n\t" + i.toString());
			x++;
		}
	}
}
