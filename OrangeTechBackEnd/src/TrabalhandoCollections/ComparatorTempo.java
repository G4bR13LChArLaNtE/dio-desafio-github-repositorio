package TrabalhandoCollections;

import java.util.Comparator;

public class ComparatorTempo implements Comparator<Serie> {

	
	@Override
	public int compare(Serie s1, Serie s2) {
		int tempo = Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
		if (tempo != 0)
			return tempo;
		
		int nome = s1.getNome().compareTo(s2.getNome());
		
		return nome;
		
	}
	
}
