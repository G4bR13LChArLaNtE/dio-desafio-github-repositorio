package Exercicio_Herança;

public class Vendedor extends Funcionario {

	private Integer quantVendas;
	
	
	public Vendedor() {
		
	}

	
	public Vendedor(String nome, String cpf, String departamento, double salario, Integer quantVendas) {
		super();
		this.quantVendas = quantVendas;
	}



	public Integer getQuantVendas() {
		return quantVendas;
	}


	public void setQuantVendas(Integer quantVendas) {
		this.quantVendas = quantVendas;
	}


	@Override
	public void CalcularBonus(double salario) {
		double valor = salario *  0.35;
		
		System.out.printf("O valor do seu bonus é igual a %.2f", valor);
		
	}
	
}
