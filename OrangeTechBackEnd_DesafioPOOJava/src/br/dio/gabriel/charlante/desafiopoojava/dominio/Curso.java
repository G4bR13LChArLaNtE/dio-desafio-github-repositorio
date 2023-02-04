package br.dio.gabriel.charlante.desafiopoojava.dominio;

/**
 * @author Gabriel Charlante
 *
 * Classe que abstrai informaçoes sobre os cursos do BootCamp.
 *
 */
public class Curso {

	
	/***
	 * @param titulo titulo do curso
	 * @param descricao do curso
	 * @param cargaHoraria carga horaria do curso
	 */
	
	private String titulo;
	
	private String descricao;
	
	private Integer cargaHoraria;

	
	
	
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

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	public Curso() {
		
	}

	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso (" +
				"título: " + titulo + " | " +
				"descrição: " + descricao + " | " +
				"Carga horária: " + cargaHoraria + " horas"+ ")";
	}
	
	
	
	
	
	
}
