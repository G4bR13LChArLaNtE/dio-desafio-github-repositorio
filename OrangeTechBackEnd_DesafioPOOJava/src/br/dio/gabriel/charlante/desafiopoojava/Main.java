package br.dio.gabriel.charlante.desafiopoojava;

import java.time.LocalDate;

import br.dio.gabriel.charlante.desafiopoojava.dominio.Curso;
import br.dio.gabriel.charlante.desafiopoojava.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Curso voltado a ensinar Java do zero ao intermediário");
		curso1.setCargaHoraria(8);
		
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de Python");
		curso2.setDescricao("Curso voltado a ensinar Python Orientado a Objetos");
		curso2.setCargaHoraria(22);
		
		System.out.println(curso1);
		
		System.out.println(curso2);
		
		Mentoria mentoria1 = new Mentoria("SpringBoot", "Aprendendo SpringBoot", LocalDate.now());
		
		System.out.println(mentoria1);
		
		
	}
	
	
	
	
}
