package TrabalhandoCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*

Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:

(Nome - Genero - Tempo de episódio);


Série 1 = Nome: got, Genero: fantasia, TempoEpisodio: 60
Série 2 = Nome: dark, Genero: drama, TempoEpisodio: 60
Série 3 = Nome: that '70s show, Genero: comédia, TempoEpisodio: 25

*/


public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		Set<Serie> series = new HashSet<>();
		
		
		series.add(new Serie("got", "fantasia", 60));
		series.add(new Serie("dark", "drama", 60));
		series.add(new Serie("that '70s show", "comédia", 25));
		
		
		System.out.println("--\tOrdem de aleatória\t---");
		
		for (Serie serie: series) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		
		
		Set<Serie> series1 = new LinkedHashSet<>();
		
		
		series1.add(new Serie("got", "fantasia", 60));
		series1.add(new Serie("dark", "drama", 60));
		series1.add(new Serie("that '70s show", "comédia", 25));

		System.out.println("--\tOrdem de Inserção\t---");
		
		for (Serie serie: series1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
	
		System.out.println("--\tOrdem natural\t---");
		
		Set<Serie> series2 = new TreeSet<>(series1);
		
		for (Serie serie: series2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		
		System.out.println("--\tOrdem Nome/Gênero/TempoEpisódio\t---");
		
		//Para ordenar dessa forma é necessário criar um comparador que compare as três variáveis e mostre a ordem correta
		
		Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempo()); //Adicionando um comparador criado na lista nova
		
		series3.addAll(series2); //adicionando a lista antiga dentro da lista nova
		
		for (Serie serie: series3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		// Para fazer:
		
		Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
		
		System.out.println("--\tOrdem Gênero\t---");
		
		series4.addAll(series3); //adicionando a lista antiga dentro da lista nova
		
		for (Serie serie: series4) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
		
		
		Set<Serie> series5 = new TreeSet<>(new ComparatorTempo());
		
		System.out.println("--\tOrdem TempoEpisódio\t---");
		
		series5.addAll(series4); //adicionando a lista antiga dentro da lista nova
		
		for (Serie serie: series5) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
		
	}

}
