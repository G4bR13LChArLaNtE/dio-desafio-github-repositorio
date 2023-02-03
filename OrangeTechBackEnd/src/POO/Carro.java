package POO;

public class Carro extends Veiculo{
	
	private int velocidade, combustivel;
	private Integer tanque;
	private boolean frear;
	private String cor, marca, nome;
	
	
	Veiculo num1 = new Veiculo();
	
	
	public Carro() {
		
	}
	
	
	public Carro(String nome, int combustivel, Integer tanque) {
		super();
		 this.nome = nome;
		 this.combustivel = combustivel;
		 this.tanque = tanque;
	}
	
	 public Carro(String nome, String cor, String marca, int velocidade, boolean frear, int combustivel, Integer tanque) {
		 super();
		 this.nome = nome;
		 this.cor = cor;
		 this.marca = marca;
		 this.velocidade = velocidade;
		 this.frear = frear;
		 this.combustivel = combustivel;
		 this.tanque = tanque;
		 
	 }
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		if (isFrear()) {
			this.velocidade = 0;
		}else {
			this.velocidade += velocidade;
		}
		
	}
	public boolean isFrear() {
		return frear;
	}
	public void setFrear(boolean frear) {
		this.frear = frear;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	
	public Integer getTanque() {
		return tanque;
	}

	public void setTanque(int tanque) {
		this.tanque = 3 + tanque;
	}

	public double valorCombustivel(int combustivel, int tanque) {
		this.combustivel = combustivel;
		this.tanque = tanque;
		double valor = (tanque - combustivel) * 4.86;
		return valor;
		
	}
	
	public double valorCombustivel(int combustivel, int tanque, double preço) {
		this.combustivel = combustivel;
		this.tanque = tanque;
		double valor = (tanque - combustivel) * preço;
		return valor;
	}

}
