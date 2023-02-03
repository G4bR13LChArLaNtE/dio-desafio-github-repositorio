package TrabalhandoCollections_exercicios;

import java.util.Objects;


public class Estado implements Comparable<Estado> {
	
	
	private String nome;
	private Integer populacao;
	
	
	public Estado(String nome, Integer populacao) {
		super();
		this.nome = nome;
		this.populacao = populacao;
	}



	public Estado() {
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public Integer getPopulacao() {
		return populacao;
	}

	public void setPopulacao(Integer populacao) {
		this.populacao = populacao;
	}

	@Override
	public String toString() {
		return "{" + "Nome: '" + nome + "\'  " + ", População: " + populacao + "\'" + "}";
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Estado estado = (Estado) o;
		return nome.equals(estado.nome) && populacao.equals(estado.populacao);
		
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(nome, populacao);
		
	}


	@Override
	public int compareTo(Estado estado) {
		
		
		int nome = this.getNome().compareTo(estado.getNome());
		
		if (nome !=  0) return nome;
		
		
		
		int populacao = Integer.compare(this.getPopulacao(), estado.getPopulacao());
		
		return populacao;
		
		
		
	}



	
	
	
	
	

}
