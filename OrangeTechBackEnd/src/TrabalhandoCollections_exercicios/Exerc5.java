package TrabalhandoCollections_exercicios;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



/*
 Dada a população estimada de alguns estados do NE (Nordeste) brasileiro, faça:
 
 Estado = PE - População = 9.616.621
 Estado = AL - População = 3.351.543
 Estado = CE - População = 9.187.103
 Estado = RN - População = 3.534.265
 
 - Crie um dicionário e relacione os estados e suas populações;
 
 - Substitua a população do estado do RN por 3.534.165;
 
 - Confira se o estado PB está no dicionário, caso não adicione: 
 	PB - 4.039.277;
 
 - Exiba a população de PE;
 
 - Exiba todos os estados e suas populações na ordem que foi informada;
 
 - Exiba os estados e suas populações em ordem alfabética;
 
 - Exiba o estado com a menor população e sua quantidade;
 
 - Exiba o estado com maior população e sua quantidade;
 
 - Exiba a soma da população desses estados; 
 
 - Exiba a média da população dos estados; 
 
 - Remova os estados com a população menor que 4.000.000;
 
 - Apague o dicionário de estados;
 
 - Verifique se o dicionário está vazio.

 
 
 */


public class Exerc5 {

	
	public static void main(String[] args) {
		
		
		//Crie um dicionário e relacione os estados e suas populações:
		
		Map<String, Estado > estados = new HashMap<>();
		
		estados.put("PE", new Estado("PE", 9616621));
		estados.put("AL", new Estado("AL", 3351543));
		estados.put("CE", new Estado("CE", 9187103));
		estados.put("RN", new Estado("RN", 3534265));
		
		System.out.println(estados);
		
		
		//Substitua a população do estado do RN por 3.534.165:
		
		estados.put("RN", new Estado("RN", 3534165));
		
		System.out.println(estados);
		
		
		//Confira se o estado PB está no dicionário, caso não adicione:  PB - 4.039.277;
		
		System.out.println("PB está na lista: " + estados.containsKey("PB"));
		
		estados.put("PB", new Estado("PB", 4039277));
		
		System.out.println("PB está na lista: " + estados.containsKey("PB"));
		
		
		//Exiba a população de PE:
		
		System.out.println("A população de PE é: " + estados.get("PE").getPopulacao());
		
		//Exiba todos os estados e suas populações na ordem que foi informada:
		
		Map<String, Estado > estados1 = new LinkedHashMap<>();
		
		estados1.put("PE", new Estado("PE", 9616621));
		estados1.put("AL", new Estado("AL", 3351543));
		estados1.put("CE", new Estado("CE", 9187103));
		estados1.put("RN", new Estado("RN", 3534165));
		estados1.put("PB", new Estado("PB", 4039277));
		
		System.out.println();
		
		System.out.println("Estado - População :");
		
		for (Map.Entry<String, Estado> estado: estados1.entrySet()) System.out.println(estado.getValue().getNome()+ " - " + estado.getValue().getPopulacao());
		
		
		
		//Exiba os estados e suas populações em ordem alfabética:
		
		
		System.out.println();
		
		System.out.println("Estado - População :");
		
		
		Map<String, Estado > estados2 = new TreeMap<>(estados1);
		
		for (Map.Entry<String, Estado> estado: estados2.entrySet()) System.out.println(estado.getValue().getNome()+ " - " + estado.getValue().getPopulacao());
		
		
		
		//Exiba o estado com a menor população e sua quantidade:
		
		Set<Map.Entry<String, Estado >> estados3 = new TreeSet<>(new ComparatorPopulacao());
		
		estados3.addAll(estados2.entrySet());
		
		System.out.println();
		
		for (Map.Entry<String, Estado> estado: estados3) System.out.println(estado.getValue().getNome()+ " - " + estado.getValue().getPopulacao());
		
		System.out.println();
		
		
		Map<String, Integer> estados4 = new HashMap<>();
		
		estados4.put("PE", 9616621);
		estados4.put("AL", 3351543);
		estados4.put("CE", 9187103);
		estados4.put("RN", 3534165);
		estados4.put("PB", 4039277);
		
		
		
		Integer menorPopulacao = Collections.min(estados4.values());
		
		Set<Map.Entry<String, Integer>> entries = estados4.entrySet();
		
		String estadoMenosPopuloso = "";
		
		for (Map.Entry<String, Integer> entry: entries) {
			
			if (entry.getValue().equals(menorPopulacao)) {
				estadoMenosPopuloso = entry.getKey();
				System.out.println("Estado menos populoso: "  + estadoMenosPopuloso + " - " + menorPopulacao);
				
				
			}
		}
		
		
		System.out.println();
		
		
		//Exiba o estado com maior população e sua quantidade;
		
		
		Integer maiorPopulacao = Collections.max(estados4.values());
		
		String estadoMaisPopuloso = "";
		
		

		for (Map.Entry<String, Integer> entry: entries) {
			
			if (entry.getValue().equals(maiorPopulacao)) {
				estadoMaisPopuloso = entry.getKey();
				System.out.println("Estado mais populoso: "  + estadoMaisPopuloso + " - " + maiorPopulacao);
				
				
			}
		}
		
		
		
		
		//Exiba a soma da população desses estados;
		
		
		Iterator<Integer> iterator = estados4.values().iterator();
		
		
		Integer soma = 0;
		
		
		while( iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println("A soma das populações de cada estado é: " + soma);
		
		
		////Exiba a média da população dos estados;
		
		
		System.out.println("A média da população dos estados é: " + (soma/estados4.size()));
		
		
		
		
		//Remova os estados com a população menor que 4.000.000;
		
		Iterator<Integer> iterator1 = estados4.values().iterator();
		
		while( iterator1.hasNext()) {
			if (iterator1.next() < 4000000) iterator1.remove();
		}
		
		System.out.println(estados4.toString());
		
		
		
		//Apague o dicionário de estados;
		
		estados.clear();
		
		//Verifique se o dicionário está vazio.
		
		System.out.println("O dicionário dos estados está vazio? " + estados.isEmpty());
		
		
		
		
		
		
		
	}	
	
}
