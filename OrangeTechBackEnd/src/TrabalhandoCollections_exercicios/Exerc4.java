package TrabalhandoCollections_exercicios;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 
 Crie uma classe LingaguemFavorita que possua os atributos
 nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
 3 liguagens e faça um programa que ordene esse conjunto por:
 
 A. Ordem de inserção;
 B. Ordem Natural (nome);
 C. IDE;
 D. Ano de criação e Nome;
 E. Nome, ano de criação e IDE.
 
 
 Ao final, exiba as linguagens no console, um abaixo da outra.
  
 */




public class Exerc4 {

	public static void main(String[] args) {
		
		//A. Ordem de inserção;
		
		System.out.println(" -------- Ordem de inserção -------- ");
		
		Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
		
		linguagens.add(new LinguagemFavorita("C", 1972, "Dev C++" ));
		linguagens.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
		linguagens.add(new LinguagemFavorita("Java", 1991, "Eclipse"));
		
		
		
		
		
		for (LinguagemFavorita linguagem: linguagens) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
	
		
		//B. Ordem Natural (nome);
		
		System.out.println(" -------- Ordem Natural (nome) -------- ");
		
		//É necessário implementar a classe Comparable na classe LinguagemFavorita para que haja um comparador de variáveis.
		
		Set<LinguagemFavorita> linguagens1 = new TreeSet<>(linguagens);
		
		for (LinguagemFavorita linguagem: linguagens1) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
		

		//C. IDE;
		
		System.out.println(" -------- IDE -------- ");
		
		//É necessário criar um comparator para comparar a ordem das IDEs:
		
		Set<LinguagemFavorita> linguagens2 = new TreeSet<>(new ComparatorIDE());
		
		linguagens2.addAll(linguagens1);
		
		for (LinguagemFavorita linguagem: linguagens2) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
		
		
		// D.  Ano de criação e Nome;
		
		System.out.println(" -------- Ano de criação e Nome -------- ");
		
		//É necessário criar um comparator para comparar a ordem dos anos de criação e do nome:
		
		
		Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorAnoNome());
		
		linguagens3.addAll(linguagens1);
		
		for (LinguagemFavorita linguagem: linguagens3) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
		
		
		//E. Nome, ano de criação e IDE.
		
		System.out.println(" -------- Nome, ano de criação e IDE -------- ");
		
		
		//É necessário criar um comparator para comparar a ordem dos anos de criação, do nome e da IDE:
		
		
		Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorNomeAnoIDE());
		
		linguagens4.addAll(linguagens1);
		
		for (LinguagemFavorita linguagem: linguagens4) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
		
	}

}
