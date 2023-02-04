package br.dio.gabriel.charlante.desafiopoojava.dominio;

/**
 * @author Gabriel Charlante
 *
 * Classe que abstrai informaçoes sobre os cursos do BootCamp.
 *
 */
public class Curso extends Conteudo {

	
	/***
	 * @param cargaHoraria carga horaria do curso
	 */
	
	
	private Integer cargaHoraria;


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
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public String toString() {
		return "Curso (" +
				"título: " + getTitulo() + " | " +
				"descrição: " + getDescricao() + " | " +
				"Carga horária: " + cargaHoraria + " horas"+ ")";
	}

	@Override
	public double calcularXP() {
		return XP_PADRAO * cargaHoraria;
	}
	
	
	
	
	
	
}
