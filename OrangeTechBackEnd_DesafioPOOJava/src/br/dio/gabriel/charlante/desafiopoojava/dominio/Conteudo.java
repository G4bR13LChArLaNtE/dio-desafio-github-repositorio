package br.dio.gabriel.charlante.desafiopoojava.dominio;



/**
 * @author Gabriel Charlante
 *
 * Classe mãe utilizada para criar uma herança com as classes filhas Curso e Mentoria.
 *
 */

public abstract class Conteudo {

	
	
	/***
	 * @param titulo titulo do conteudo
	 * @param descricao do conteudo
	 * @param XP_PADRAO constate que estipula um valor mínimo para todo contéudo
	 */
	
	
	protected static final double XP_PADRAO = 10.0;
	
	private String titulo;
	
	private String descricao;

	
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	public Conteudo() {
		
	}

	public Conteudo(String titulo, String descricao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
	}
	
	
	
	public abstract double calcularXP();
	
	
	
	
	
}
