package br.dio.gabriel.charlante.desafiopoojava;


import br.dio.gabriel.charlante.desafiopoojava.dominio.Bootcamp;

import java.time.LocalDate;

//import br.dio.gabriel.charlante.desafiopoojava.dominio.Conteudo;
import br.dio.gabriel.charlante.desafiopoojava.dominio.Curso;
import br.dio.gabriel.charlante.desafiopoojava.dominio.Dev;
import br.dio.gabriel.charlante.desafiopoojava.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição Java");
		curso1.setCargaHoraria(8);
		
		
		
		Curso curso2 = new Curso(); curso2.setTitulo("Curso js");
		curso2.setDescricao("Descrição js"); curso2.setCargaHoraria(12);
		  
		System.out.println(curso1);
		  
		System.out.println(curso2);
		  
			
		Mentoria mentoria1 = new Mentoria("SpringBoot", "Aprendendo SpringBoot",LocalDate.now());
			  
		System.out.println(mentoria1);
			 
		 
		
		/*
		Conteudo conteudo = new Curso();
		conteudo.setTitulo("Curso sem carga horária");
		conteudo.setDescricao("Se você observar esse curso só acessa os métodos da classe Curso que existem na classe mãe Conteudo");
		
		
		System.out.println(conteudo);
		
		//Mas se usarmos o construtor da classe conseguimos acessar a variável que não há na classe mãe, nesse caso "data".
		Conteudo conteudo1 = new Mentoria("Mentoria sem data", "Se você observar esse curso só acessa os métodos da classe Mentoria que existem na classe mãe Conteudo", LocalDate.now());
		
		
		System.out.println(conteudo1);
		
		*/
		
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		System.out.println("*---------------------*");
		
		
		Dev dev1 = new Dev();
		dev1.setNome("Gabriel");
		System.out.println("Conteúdos Inscritos Gabriel: " + dev1.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Gabriel:" + dev1.getConteudoConcluidos());
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Gabriel: " + dev1.getConteudoInscritos());
		dev1.progredir();
		
		System.out.println("*----*");
		
		System.out.println("Conteúdos Inscritos Gabriel: " + dev1.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Gabriel: " + dev1.getConteudoConcluidos());
		
		
		
		
		
		System.out.println("*---------------------*");
		
		
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Ramom");
		System.out.println("Conteúdos Inscritos Ramom: " + dev2.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Ramom: " + dev2.getConteudoConcluidos());
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Ramom: " + dev2.getConteudoInscritos());
		
		System.out.println("*----*");
		
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		
		
		System.out.println("Conteúdos Inscritos Ramom: " + dev2.getConteudoInscritos());
		System.out.println("Conteúdos Concluídos Ramom: " + dev2.getConteudoConcluidos());
		
		
		System.out.println("XP: " + dev1.calcularTotalXp() + " - Gabriel");
		
		System.out.println("XP: " + dev2.calcularTotalXp() + " - Ramom");
		
		
		
		
		
		
		
	}
	
	
	
	
}
