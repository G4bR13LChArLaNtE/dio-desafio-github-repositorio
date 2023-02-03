package TrabalhandoCollections_exercicios;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<LinguagemFavorita>{

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		int ide = l1.getIde().compareTo(l2.getIde());
		if (ide != 0) return ide;
		
		int nome = l1.getNome().compareTo(l2.getNome());
		
		return nome;
		
	}
	
	

}
