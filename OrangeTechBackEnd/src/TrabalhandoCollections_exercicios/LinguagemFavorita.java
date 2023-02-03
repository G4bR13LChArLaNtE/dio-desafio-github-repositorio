package TrabalhandoCollections_exercicios;

import java.util.Objects;


public class LinguagemFavorita implements Comparable<LinguagemFavorita>{

	private String nome, ide;
	private Integer anoDeCriacao;
	
	
	
	
	public LinguagemFavorita() {
		
	}
	
	public LinguagemFavorita(String nome, String ide, Integer anoDeCriacao) {
		super();
		this.nome = nome;
		this.ide = ide;
		this.anoDeCriacao = anoDeCriacao;
	}
	
	public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
		super();
		this.nome = nome;
		this.ide = ide;
		this.anoDeCriacao = anoDeCriacao;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}

	public Integer getAnoDeCriacao() {
		return anoDeCriacao;
	}

	public void setAnoDeCriacao(Integer anoDeCriacao) {
		this.anoDeCriacao = anoDeCriacao;
	}
	
	
	
	
	@Override
	public String toString() {
		return "{" + "Nome: '" + nome + "\'  " + ", Ano de Criação: '" + anoDeCriacao + "\', IDE:" + ide + "\'" + "}";
		
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		LinguagemFavorita linguagem = (LinguagemFavorita) o;
		return nome.equals(linguagem.nome) && anoDeCriacao.equals(linguagem.anoDeCriacao) && ide.equals(linguagem.ide);
		
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(nome, anoDeCriacao, ide);
		
	}
	
	
	

	@Override
	public int compareTo(LinguagemFavorita linguagem) {
		int ano = Integer.compare(this.getAnoDeCriacao(), linguagem.getAnoDeCriacao());
		
		if (ano != 0) return ano;
		
		int ide = this.getIde().compareTo(linguagem.getIde());
		
		return ide;
		 
	}
	
	
	
	
	
	
	
	
	
}
