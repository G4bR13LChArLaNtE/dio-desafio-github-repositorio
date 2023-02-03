package Entendendo_Metodos_criacao;

public class Calculadora {
	
	
	public static void soma(double num1, double num2) {

		double valor = num1 + num2;
		
		
		System.out.println("A soma de " + num1 + " mais " + num2 + " é " + valor);
		
		
	}
	
	public static void sub(double num1, double num2) {
		
		double valor = num1 - num2;
		
		System.out.println("A subtracao de " + num1 + " menos " + num2 + " é " + valor);
		
	}
	
	public static void div(double num1, double num2) {
		
		double valor = num1 / num2;
		
		
		System.out.println("A divisao de " + num1 + " por " + num2 + " é " + valor);
		
	}
	
	public static void mult(double num1, double num2) {
		
		double valor = num1 * num2;
		
		
		System.out.println("A multiplicacao de " + num1 + " vezes " + num2 + " é " + valor);
		
	}

}
