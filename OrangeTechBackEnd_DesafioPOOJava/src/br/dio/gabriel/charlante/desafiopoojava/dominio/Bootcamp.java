package br.dio.gabriel.charlante.desafiopoojava.dominio;


import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author Gabriel Charlante
 *
 * Classe que abstrai os participantes do Bootcamp.
 *
 */


public class Bootcamp {

	
	/***
	 * @param nome nome do participante.
	 * @param descricao descricao do conteudo do Bootcamp.
	 * @param dataInicio Data do inicio do Bootcamp.
	 * @param dataFim Data do fim  do Bootcamp.
	 * @param conteudos lista de conteudos do Bootcamp.
	 * @param devs lista de participantes.
	 */
	
	
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicio = LocalDate.now();
	private final LocalDate dataFim = dataInicio.plusDays(45);
	private Set<Conteudo> conteudos = new HashSet<>();
	private Set<Dev> devs = new LinkedHashSet<>();
	
	
	
	
	public LocalDate getDataFim() {
		return dataFim;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Set<Conteudo> getConteudos() {
		return conteudos;
	}


	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}


	public Set<Dev> getDevs() {
		return devs;
	}


	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}
		
	
	
	public Bootcamp(String nome, String descricao, Set<Conteudo> conteudos, Set<Dev> devs) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.conteudos = conteudos;
		this.devs = devs;
	}
	
	

	public Bootcamp() {
		
	}
	
	
	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Bootcamp bootcamp = (Bootcamp) o;
		return nome.equals(bootcamp.nome) 
				&& descricao.equals(bootcamp.descricao) 
				&& dataInicio.equals(bootcamp.dataInicio) 
				&& dataFim.equals(bootcamp.dataFim) 
				&& conteudos.equals(bootcamp.conteudos)
				&& devs.equals(bootcamp.devs);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, descricao, dataInicio, dataFim, conteudos, devs);
	}
	
	
	
	
	
	
	
	
}
