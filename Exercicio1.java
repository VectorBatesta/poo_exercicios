package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
	Scanner inputTeclado = new Scanner(System.in);
    public float valor1, valor2;
	public int opcao;
	public String resultadoDeOperacao, resultadoFinal;
	
	
    public static void main(String[] args) {
		Exercicio1 obj = new Exercicio1();
		obj.Exercicio1();
    }
    
	public void Exercicio1(){
		System.out.println("Selecione a opcao:\n1-Abs;\n2-Ceil;\n3-Cos;\n4-Exp;\n5-Floor;\n6-Log;\n7-Max;\n8-Min;\n9-Pow;\n10-Sqrt");
		this.opcao = pegarOpcao();
		
		this.resultadoFinal = selecaoDeOperacao();
		
		System.out.println("Resultado eh: " + resultadoFinal);
	}
	
	public int pegarOpcao(){
		return inputTeclado.nextInt();
	}
	public String selecaoDeOperacao(){
		String resultadoOperacao = null;
		
		int end = 0;
		while(end != 1){
			end = 1; //end será 0 quando o switch cair em default
			switch (opcao){
				case 1:
					resultadoOperacao = Abs(); break;
				case 2:
					resultadoOperacao = Ceil(); break;
				case 3:
					resultadoOperacao = Cos(); break;
				case 4:
					resultadoOperacao = Exp(); break;
				case 5:
					resultadoOperacao = Floor(); break;
				case 6:
					resultadoOperacao = Log(); break;
				case 7:
					resultadoOperacao = Max(); break;
				case 8:
					resultadoOperacao = Min(); break;
				case 9:
					resultadoOperacao = Pow(); break;
				case 10:
					resultadoOperacao = Sqrt(); break;
				default:
					System.out.print("Selecione uma opcao valida! [pressione ENTER para continuar]");
					end = 0;
					inputTeclado.nextInt();
			}
		}
		
		return resultadoOperacao;
	}
	
	
	
	public void pegarUmValor(){
		System.out.println("Indique o valor real: ");
		this.valor1 = inputTeclado.nextFloat();
	}
	public void pegarDoisValores(){
		System.out.println("Indique o valor real 1: ");
		this.valor1 = inputTeclado.nextFloat();
		System.out.println("Indique o valor real 2: ");
		this.valor2 = inputTeclado.nextFloat();
	}
	
	
	public String Abs(){
		pegarUmValor();
		return Float.toString(java.lang.Math.abs(valor1));
	}
	public String Ceil(){
		pegarUmValor();
		return Double.toString(java.lang.Math.ceil(valor1));
	}
	public String Cos(){
		pegarUmValor();
		return Double.toString(java.lang.Math.cos(valor1));
	}
	public String Exp(){
		pegarUmValor();
		return Double.toString(java.lang.Math.exp(valor1));
	}
	public String Floor(){
		pegarUmValor();
		return Double.toString(java.lang.Math.floor(valor1));
	}
	public String Log(){
		pegarUmValor();
		return Double.toString(java.lang.Math.log(valor1));
	}
	public String Max(){
		pegarDoisValores();
		return Float.toString(java.lang.Math.max(valor1, valor2));
	}
	public String Min(){
		pegarDoisValores();
		return Float.toString(java.lang.Math.min(valor1, valor2));
	}
	public String Pow(){
		pegarDoisValores();
		return Double.toString(java.lang.Math.pow(valor1, valor2));
	}
	public String Sqrt(){
		pegarUmValor();
		return Double.toString(java.lang.Math.sqrt(valor1));
	}
}
