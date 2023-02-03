package TrabalhandoCollections_exercicios;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


/*
 Crie um conjunto contendo as cores do arco-celeste e:
 
 A. Exiba todas as cores uma abaixo da outra;
 B. A quantidade de cores que a lista tem;
 C. Exiba as cores em ordem alfabética;
 D. Exiba as cores na ordem inversa da que foi informada;
 E. Exiba todas as cores que começam com a letra 'V';
 F. Remova todas as cores que não começam com a letra 'V';
 G. Limpe o conjunto;
 H. Confira se o conjunto está vazio. 

 */

public class Exerc3 {
	
	
	
	public static void main(String[] args) {
		
		
		Set<String> cores = new HashSet<>(Arrays.asList("Amarelo", "Vermelho", "Azul", "Laranja", "Verde", "Violeta", "Anil"));
		
		
		//Resposta A:
		for (String cor: cores) {
			System.out.println(cor);
			
		}
		
		//Resposta B:
		System.out.println("A quantidade de cores é: " + cores.size() + " cores.");
		
		
		//Resposta C:
		Set<String> cores1 = new TreeSet<>(cores);
		
		System.out.println(cores1);
		
		
		//Resposta D:
		
		Set<String> cores2 = new LinkedHashSet<>();
		Set<String> cores3 = new TreeSet<>(Collections.reverseOrder());
						
		cores2.add("Amarelo");
		cores2.add("Vermelho");
		cores2.add( "Azul");
		cores2.add("Laranja");
		cores2.add("Verde");
		cores2.add("Violeta");
		cores2.add("Anil");
		
		System.out.println(cores2);
		
		cores3.add("Amarelo");
		cores3.add("Vermelho");
		cores3.add( "Azul");
		cores3.add("Laranja");
		cores3.add("Verde");
		cores3.add("Violeta");
		cores3.add("Anil");
		
		
		System.out.println(cores3);
		
		//Resposta E:
			
		Set<String> coresV = new LinkedHashSet<>();
		
		Iterator<String> iterator1 =  cores.iterator();
		
		while(iterator1.hasNext()) {
			
			String next = iterator1.next();
			
			if(next.startsWith("V")) coresV.add(next);
		
		}			
		
		for (String cor: coresV) {
			System.out.println(cor);
			
		}
		
		
		//Resposta F:
		
		Iterator<String> iterator2 =  cores.iterator();
		
		while(iterator2.hasNext()) {
			
			String next = iterator2.next();
			
			if(!next.startsWith("V")) iterator2.remove();
		
		}
		
		System.out.println(cores);
		
		
		//Resposta G:
		
		cores.clear();
		
		//Resposta H:
		
		System.out.println(cores);
		
		
		
		
	}
	

	
}
