package TrabalhandoCollections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 Dadas as seguintes informações sobre meus livros favoritos e seus autores,
 crie um dicionário e ordene este dicionário:
 exibindo (Nome Autor - Nome Livro);
 
 Autor = Hawking, Stephen   - Livro = Uma breve história do Tempo. - Páginas = 256
 Autor = Duhigg, Charles    - Livro = O poder do hábito.           - Páginas = 408
 Autor = Harari, Yuval Noah - Livro = 21 lições para o século 21.  - Páginas = 432
 
 */


public class ExemploOrdenacaoMap {

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
		
		
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorLivros());
		
		livros3.addAll(livros2.entrySet());
		
		for (Map.Entry<String, Livro> livro: livros3) System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		
		
		System.out.println();
		
		System.out.println("--\tOrdem número de páginas\t---");
		
		Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorPaginas());
		
		livros4.addAll(livros2.entrySet());
		
		for (Map.Entry<String, Livro> livro: livros4) System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + " - " + livro.getValue().getPagina());
		
		
	}
	
	
	
	
}
