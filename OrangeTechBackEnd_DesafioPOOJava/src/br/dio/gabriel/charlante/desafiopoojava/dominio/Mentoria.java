package br.dio.gabriel.charlante.desafiopoojava.dominio;

import java.time.LocalDate;

/**
 * @author Gabriel Charlante
 *
 *Classe que abstrai informaçoes sobre as mentorias do BootCamp.
 */
public class Mentoria {

	
	/***
	 * @param titulo titulo da mentoria
	 * @param descricao da mentoria
	 * @param data data da mentoria
	 */
	
	
	private String titulo;
	
	private String descricao;
	
	private LocalDate data;

	
	
	
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
	
	
	
	public Mentoria() {
		
	}
	
	
	public Mentoria(String titulo, String descricao, LocalDate data) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	
	
	
	@Override
	public String toString() {
		return "Mentoria (" +
				"título: " + titulo + " | " +
				"descrição: " + descricao + " | " +
				"Data: " + data + ")";
	}
	
	
	
	
}
