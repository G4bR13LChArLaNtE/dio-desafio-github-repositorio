package TrabalhandoCollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		
		// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
		
		//HashSet<Double> notas = new HashSet<>();
		
		//HashSet<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		//Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);

		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		//Nesse tipo de lista *não podemos ter elementos repetidos*, então a seguir podemos ver que só entrou na lista um 7d:
		
		//System.out.println(notas);
		
		System.out.println(notas.toString());
		
		//System.out.println("Exiba a posição da nota 5.0: ");
		
		//System.out.println("Adicione na lista a nota 8.0 no posição 4: ");
		
		//System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		
		//System.out.println("Exiba a terceira nota adicionada: ");
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas));
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		//Somando valores de uma lista:
		
				Iterator<Double> iterator =  notas.iterator();
				
				Double soma = 0.0;
				
				
				while(iterator.hasNext()) {
					
					Double next = iterator.next();
					soma += next;
				
				}
				
		System.out.printf("Exiba a soma so valores: %.2f.", soma);
		
		System.out.println();
		System.out.printf("Exiba a média das notas: %.2f", (soma/notas.size()));
		
		
		System.out.println();
		
		System.out.println("Remova a nota 0.0");
		
		notas.remove(0d);
		
		System.out.println(notas.toString());
		
		
		//System.out.println("Remova a nota na posição 0: ");
		
		
		//Removando valor menores que 7 da lista:
		
				Iterator<Double> iterator1 =  notas.iterator();
				
				while(iterator1.hasNext()) {
					
					Double next = iterator1.next();
					
					if(next < 7.0) iterator1.remove();
				
				}
				
				
		System.out.println("Remova as notas menores que 7.0: " + notas);
		
		System.out.println("Apague toda a lista: ");
		
		notas.clear();
		
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
		
		//Nova lista:
		
		Set<Double> notas2 = new LinkedHashSet<>();
		
		notas2.add(7d);
		notas2.add(8.5);
		notas2.add(9.3);
		notas2.add(5d);
		notas2.add(7d);
		notas2.add(0d);
		notas2.add(3.6);
		 
		
		System.out.println("Exiba todas as notas na ordem que foram informadas: " + notas2.toString());
		System.out.println();
		
		//Nova lista:
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		
		Set<Double> notas3 = new TreeSet<>(notas2);
		
		System.out.println(notas3);
		
		
		
	}

}
