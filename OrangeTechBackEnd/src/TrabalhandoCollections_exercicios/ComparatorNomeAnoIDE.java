package TrabalhandoCollections_exercicios;

import java.util.Comparator;

public class ComparatorNomeAnoIDE implements Comparator<LinguagemFavorita> {

	@Override
	public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
		
		
		int nome = l1.getNome().compareTo(l2.getNome());
		
		if (nome != 0) return nome;
		
		int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
		if (ano != 0) return ano;
	
		
		int ide = l1.getIde().compareTo(l2.getIde());
		
		return ide;
		
		
	}
	
	

}
