package TrabalhandoCollections;

public class Gato implements Comparable<Gato> {

	private String nome;
	private Integer idade;
	private String cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;

	}

	@Override
	public String toString() {
		return "{" + "Nome: '" + nome + "\'  " + ", Idade: '" + idade + "\', Cor:" + cor + "\'" + "}";
	}

	@Override
	public int compareTo(Gato o) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(getNome());
	}

}
