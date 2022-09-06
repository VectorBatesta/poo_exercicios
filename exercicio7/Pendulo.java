/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio7;

/**
 *
 * @author vecto
 */
public class Pendulo {
	int A, B, C;
	
	public void Pendulo(){
		this.A = 0;
		this.B = 0;
		this.C = 0;
	}
	public void Pendulo(int A){
		this.A = A;
		this.B = 0;
		this.C = 0;
	}
	public void Pendulo(int A, int B){
		this.A = A;
		this.B = B;
		this.C = 0;
	}
	public void Pendulo(int A, int B, int C){
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	public void adicionaOscilacao(){
		this.C++;
		this.checaLimite();
		this.printa();
	}
	public void adicionaOscilacao(int quant){
		this.C += quant;
		this.checaLimite();
		this.printa();
	}
	
	public void checaLimite(){
		while(C > 30 || B > 30 || A > 30){
			if (C > 30){
				C -= 30;
				B++;
			}
			if (B > 30){
				B -= 30;
				A++;
			}
			if (A > 30){
				A -= 30;
				System.out.println("limite do contador alcancado");
			}
		}
	}
	
	public void printa(){
		System.out.println("A: " + A + "\tB: " + B + "\tC: " + C);
	}
}
