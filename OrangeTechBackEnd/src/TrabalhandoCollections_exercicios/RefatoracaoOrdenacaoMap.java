package TrabalhandoCollections_exercicios;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


import TrabalhandoCollections.Livro;

/*
Dada a população estimada de alguns estados do NE (Nordeste) brasileiro, faça:

Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

- Crie um dicionário e relacione os estados e suas populações;

- Substitua a população do estado do RN por 3.534.165;

- Confira se o estado PB está no dicionário, caso não adicione: 
	PB - 4.039.277;

- Exiba a população de PE;

- Exiba todos os estados e suas populações na ordem que foi informada;

- Exiba os estados e suas populações em ordem alfabética;

- Exiba o estado com a menor população e sua quantidade;

- Exiba o estado com maior população e sua quantidade;

- Exiba a soma da população desses estados; 

- Exiba a média da população dos estados; 

- Remova os estados com a população menor que 4.000.000;

- Apague o dicionário de estados;

- Verifique se o dicionário está vazio.



*/

public class RefatoracaoOrdenacaoMap {

	public static void main(String[] args) {
		

System.out.println("--\tOrdem de aleatória\t---");
		
		Map<String, Livro > livros = new HashMap<>();
		
		livros.put("Hawking, Stephen", new Livro("Uma breve história do Tempo", "Hawking, Stephen", 256));
		livros.put("Duhigg, Charles", new Livro("O poder do hábito", "Duhigg, Charles ", 408));
		livros.put("Harari, Yuval Noah", new Livro("21 lições para o século 21", "Harari, Yuval Noah", 432));
		
		for (Map.Entry<String, Livro> livro: livros.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println();
		
		System.out.println("--\tOrdem de Inserção\t---");
		
		Map<String, Livro > livros1 = new LinkedHashMap<>();
		
		livros1.put("Hawking, Stephen", new Livro("Uma breve história do Tempo", "Hawking, Stephen", 256));
		livros1.put("Duhigg, Charles", new Livro("O poder do hábito", "Duhigg, Charles ", 408));
		livros1.put("Harari, Yuval Noah", new Livro("21 lições para o século 21", "Harari, Yuval Noah", 432));
		
		for (Map.Entry<String, Livro> livro: livros1.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		System.out.println();
		
		System.out.println("--\tOrdem alfabética autores\t---");
		
		Map<String, Livro > livros2 = new TreeMap<>(livros1);
		
		
		for (Map.Entry<String, Livro> livro: livros2.entrySet()) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println();
		
		System.out.println("--\tOrdem alfabética livros\t---");
		
		
		//Refatorando com classe anônima:
		/*
		
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {

			@Override
			public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
				
				int nome = l1.getValue().getNome().compareTo(l2.getValue().getNome());
				if (nome != 0)
					return nome;
				
				
				int autor = l1.getValue().getAutor().compareTo(l2.getValue().getAutor());
				if (autor != 0)
					return autor;
				
				int pagina = Integer.compare(l1.getValue().getPagina(), l2.getValue().getPagina());
				
				return pagina;
			}
		});
		
		*/
		
		
		
		//Refatorando com classe anônima com coparing:
		/*
		
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<String, Livro>, String>() {

			@Override
			public String apply(Entry<String, Livro> nome) {
				return nome.getValue().getNome();
			}
		}));
		
		
		*/
		
		//Refaturando com lambda:
		
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(Comparator.comparing(nome -> nome.getValue().getNome()));
			
		
		
		livros3.addAll(livros2.entrySet());
		
		for (Map.Entry<String, Livro> livro: livros3) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println();
		
		System.out.println("--\tOrdem número de páginas\t---");
		
		
		//Refaturado com lambda:
		
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(Comparator.comparing(pagina -> pagina.getValue().getPagina()));
		
		livros4.addAll(livros2.entrySet());
		
		for (Map.Entry<String, Livro> livro: livros4) System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPagina());
		
		
		
		
		
		
		
	}

}
