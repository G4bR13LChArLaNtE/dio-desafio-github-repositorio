package TrabalhandoCollections;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

	private String nome, genero;
	private Integer tempoEpisodio;
	
	
	public Serie() {
		
	}
	
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}


	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}
	
	
	
	@Override
	public String toString() {
		return "{" + "Nome: '" + nome + "\'  " + ", Genero: '" + genero + "\', Tempo:" + tempoEpisodio + "\'" + "}";
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Serie serie = (Serie) o;
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
		
	}
	
	@Override
	public int hashCode(){
		return Objects.hash(nome, genero, tempoEpisodio);
		
	}


	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		
		if (tempoEpisodio !=  0) return tempoEpisodio;
		
		int genero = this.getGenero().compareTo(serie.getGenero());
		
		
		return genero;
	}
	
	
	
}
