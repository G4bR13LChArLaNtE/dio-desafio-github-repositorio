package TrabalhandoCollections;

import java.util.Objects;

public class Livro implements Comparable<Livro> {
	
	
	private String nome, autor;
	private Integer pagina;
	
	
	public Livro(String nome, String autor, Integer pagina) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.pagina = pagina;
	}
	
	public Livro() {
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getPagina() {
		return pagina;
	}

	public void setPagina(Integer pagina) {
		this.pagina = pagina;
	}
	
	
	@Override
	public String toString() {
		return "{" + "Nome: '" + nome + "\'  " + ", Autor: '" + autor + "\', Páginas:" + pagina + "\'" + "}";
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Livro livro = (Livro) o;
		return nome.equals(livro.nome) && autor.equals(livro.autor) && pagina.equals(livro.pagina);
		
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(nome, autor, pagina);
		
	}


	@Override
	public int compareTo(Livro livro) {
		int pagina = Integer.compare(this.getPagina(), livro.getPagina());
		
		if (pagina !=  0) return pagina;
		
		int autor = this.getAutor().compareTo(livro.getAutor());
		
		
		return autor;
	}
	
	
	
	

}
