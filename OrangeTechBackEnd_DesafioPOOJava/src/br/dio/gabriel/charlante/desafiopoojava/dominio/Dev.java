package br.dio.gabriel.charlante.desafiopoojava.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


/**
 * @author Gabriel Charlante
 *
 * Classe que abstrai os participantes do Bootcamp.
 *
 */


public class Dev {

	/***
	 * @param nome nome do participante.
	 * @param conteudoInscritos Conteudos que o dev está participando.
	 * @param conteudoConcluidos Conteudos que foram finalizados.
	 */
	
	
	
	private String nome;
	private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudoInscritos() {
		return conteudoInscritos;
	}
	public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
		this.conteudoInscritos = conteudoInscritos;
	}
	public Set<Conteudo> getConteudoConcluidos() {
		return conteudoConcluidos;
	}
	public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
		this.conteudoConcluidos = conteudoConcluidos;
	}
	
	
	
	public Dev() {
		
	}
	
	
	public Dev(String nome, Set<Conteudo> conteudoInscritos, Set<Conteudo> conteudoConcluidos) {
		super();
		this.nome = nome;
		this.conteudoInscritos = conteudoInscritos;
		this.conteudoConcluidos = conteudoConcluidos;
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		
		Dev dev = (Dev) o;
		return nome.equals(dev.nome) && conteudoInscritos.equals(dev.conteudoInscritos) && conteudoConcluidos.equals(dev.conteudoConcluidos);
	}
	
	
	@Override
	public int hashCode() {
		return  Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
	}
	
	
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
		
	}
	
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudoConcluidos.add(conteudo.get());
			this.conteudoInscritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está inscrito em nenhum conteúdo!!!");
		}
	}
	
	
	public double calcularTotalXp() {
		//Lambda para facilitar:
		return this.conteudoConcluidos.stream()
		.mapToDouble(Conteudo -> Conteudo.calcularXP())
		.sum();
	}
	
	
	
}
