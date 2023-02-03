package Exercicio_Herança;

public class Gerente extends Funcionario{
	
	private Integer Id;

	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
	
	@Override
	public void CalcularBonus(double salario) {
		double valor = salario *  0.5;
		
		System.out.printf("O valor do seu bonus é igual a %.2f", valor);
		
	}

	
	
	
	
	
}
