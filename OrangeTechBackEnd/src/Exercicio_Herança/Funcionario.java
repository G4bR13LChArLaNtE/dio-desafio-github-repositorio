package Exercicio_Herança;

public class Funcionario {

	private String nome, cpf, departamento;
	private double salario;
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String cpf, String departamento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		
	}
	
	
	public Funcionario(String nome, String cpf, String departamento, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	public void CalcularBonus(double valor) {
		System.out.println("O valor do seu bonus é igaual a " + valor);
		
	}

	
}
