package Exercicio_Herança;

public class Faxineiro extends Funcionario{

	@Override
	public void CalcularBonus(double salario) {
		double valor = salario *  0.20;
		
		System.out.printf("O valor do seu bonus é igual a %.2f", valor);
		
	}
	
}
