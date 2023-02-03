package POO;

public class Veiculo {
	
	private String tipo, nome,  cor;
	private Integer tanque, velocidadeMaxima;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String tipo, String nome, String cor, Integer tanque, Integer velocidadeMaxima) {
		this.tipo = tipo;
		this.nome = nome;
		this.cor = cor;
		this.tanque = tanque;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getTanque() {
		return tanque;
	}

	public void setTanque(Integer tanque) {
		this.tanque = tanque;
	}

	public Integer getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(Integer velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	

}
