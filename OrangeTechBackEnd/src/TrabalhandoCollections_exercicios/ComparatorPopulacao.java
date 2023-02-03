package TrabalhandoCollections_exercicios;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;



public class ComparatorPopulacao implements Comparator<Map.Entry<String, Estado>> {

	@Override
	public int compare(Entry<String, Estado> e1, Entry<String, Estado> e2) {

		
		int populacao = Integer.compare(e1.getValue().getPopulacao(), e2.getValue().getPopulacao());
		
		
		if ( populacao !=0) return populacao;
		
		int nome = e1.getValue().getNome().compareTo(e2.getValue().getNome());
		
		return nome;
		
		
		
		
	}

	
	
	
	
}
