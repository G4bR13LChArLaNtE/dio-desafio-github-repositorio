package TrabalhandoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class ExemploList {
	
	 
	public static void main(String[] args) {
		
		
		double dados[] = new double[] {7, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6};
	
		ArrayList<Double> notas = new ArrayList<>();
		
		for (int i = 0; i <dados.length; i++ ) {
			notas.add(dados[i]);
		}
		
		System.out.println(notas.toString());
	
		
		notas.add(4.7);
		
		
		System.out.println(notas.toString());
		
		
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
		
		System.out.println("Adicione na lista a nota 8.0 no posição 4: ");
		notas.add(4, 8.0);
		System.out.println(notas);
		
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		System.out.println(notas.toString());
		//notas.add(notas.indexOf(5.0), 6.0);
		//notas.remove(5.0);
		
		notas.set(notas.indexOf(5.0), 6.0);
		System.out.println(notas.toString());
		
		
		System.out.println("Confira se a nota 5.0 está na lista: ");
		if ((notas.indexOf(5.0)) == -1) {
			System.out.println("Não está na lista!!!");
		}else {
			System.out.println("Está na lista!!!");
		}
		
		
		System.out.println();
		System.out.println();
		
		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		
		System.out.println("Exiba a menor nota: " + Collections.min(notas)); //class collections metodo min para achar o menor valor em uma lista de números.
		
		
		System.out.println("Exiba a maior nota: " + Collections.max(notas));
		
		
		//Somando valores de uma lista:
		
		Iterator<Double> iterator =  notas.iterator();
		
		Double soma = 0.0;
		
		
		while(iterator.hasNext()) {
			
			Double next = iterator.next();
			soma += next;
		
		}
		
		System.out.println("Exiba a soma so valores: "  + soma);
		
		
		System.out.printf("Exiba a média das notas: %.2f", (soma/notas.size()));
		
		System.out.println();
		
		System.out.println("Remova a nota 0.0");
		
		notas.remove(notas.indexOf(0.0));
		
		System.out.println(notas);
		
		//Removando valor menores que 7 da lista:
		
		Iterator<Double> iterator1 =  notas .iterator();
		
		while(iterator1.hasNext()) {
			
			Double next = iterator1.next();
			
			if(next < 7.0) iterator1.remove();
		
		}
		
		
		System.out.println("Remova as notas menores que 7.0: " + notas);
		
		System.out.println("Apague toda a lista: ");
		
		notas.clear();
		
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
		/* Para você: Resolva esses exercícios utilizando os metódos da implementação LinkedList:
		 
		 System.out.println("Mostre a primeira nota da nova lista sem removê-la: ");
		 
		 System.out.println("Mostre a primeira nota da nova lista removendo-a: ");
		 
		 */
		
		LinkedList<Double> notas2 = new LinkedList<>();
		
		notas2.add(8.7);
		notas2.add(7.1);
		notas2.add(6.4);
		notas2.add(1.3);
		notas2.add(4.4); 
		notas2.add(5.8);
		
		System.out.println("Mostre a primeira nota da nova lista sem removê-la: " + notas2.get(0));
		
		System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.removeFirst());
		
		System.out.println(notas2);
		
		
	}
	
	
}
