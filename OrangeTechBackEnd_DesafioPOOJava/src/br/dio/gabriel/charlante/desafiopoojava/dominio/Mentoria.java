package br.dio.gabriel.charlante.desafiopoojava.dominio;

import java.time.LocalDate;

/**
 * @author Gabriel Charlante
 *
 *Classe que abstrai informaçoes sobre as mentorias do BootCamp.
 */
public class Mentoria extends Conteudo {

	
	/***
	 * @param data data da mentoria
	 */
	
	private LocalDate data;

	

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
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.data = data;
	}
	
	
	
	@Override
	public String toString() {
		return "Mentoria (" +
				"título: " + getTitulo() + " | " +
				"descrição: " + getDescricao() + " | " +
				"Data: " + data + ")";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO + 20.0;
	}
	
	
	
	
}
