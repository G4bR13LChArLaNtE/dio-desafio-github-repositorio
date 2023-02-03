package TrabalhandoCollections;

import java.util.Comparator;
import java.util.Map;

public class ComparatorLivros implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
		
		int nome = l1.getValue().getNome().compareTo(l2.getValue().getNome());
		if (nome != 0)
			return nome;
		
		
		int autor = l1.getValue().getAutor().compareTo(l2.getValue().getAutor());
		if (autor != 0)
			return autor;
		
		int pagina = Integer.compare(l1.getValue().getPagina(), l2.getValue().getPagina());
		
		return pagina;
	

  }
}