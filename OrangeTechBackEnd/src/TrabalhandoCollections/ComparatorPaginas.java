package TrabalhandoCollections;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		int pagina = Integer.compare(l1.getValue().getPagina(), l2.getValue().getPagina());
		if (pagina != 0)
			return pagina;
		
		
		int nome = l1.getValue().getNome().compareTo(l2.getValue().getNome());
		if (nome != 0)
			return nome;
		
		
		int autor = l1.getValue().getAutor().compareTo(l2.getValue().getAutor());
		return autor;
		
		
	}
	
	
	

}
