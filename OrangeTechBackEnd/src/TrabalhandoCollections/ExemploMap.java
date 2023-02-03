package TrabalhandoCollections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
 
 modelo = gol  - consumo = 14,4 Km/L 
 modelo = uno  - consumo = 15,6 Km/L
 modelo = mobi - consumo = 16,1 Km/L
 modelo = hb20 - consumo = 14,5 Km/L
 modelo = Kwid - consumo = 15,6 Km/L
 
 */

public class ExemploMap {

	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
		
		/*
		 
		 Outra forma de iniciar o dicionário:
		 
		 Map<String, Double> carros = new HashMap<>(){{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		 }};
		 
		 */
		
		
		
		
		Map<String, Double> carros = new HashMap<>();
		carros.put("gol", 14.4);
		carros.put("uno", 15.6);
		carros.put("mobi", 16.1);
		carros.put("hb20", 14.5);
		carros.put("kwid", 15.6);
		
		System.out.println(carros.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 Km/L: ");
		
		carros.put("gol", 15.2);
		
		System.out.println(carros.toString());
		
		System.out.println("Confira se o modelo Tcson está no dicionário: " + carros.containsKey("tucson"));
		
		System.out.println("Confira se o modelo uno está no dicionário: " + carros.containsKey("uno"));
		
		System.out.println("Exiba o valor do consumo do uno: " + carros.get("uno") + " Km/L");
		
		// System.out.println("Exiba o terceiro modelo adicionado: ");
		
		System.out.println("Exiba os modelos: " + carros.keySet());
		
		// Fazendo outra lista para guardar os modelos (Lista com elementos únicos):
		
		Set<String> modelos = carros.keySet();
		
		for (String modelo : modelos) {
			
			System.out.println(modelo);
		}
		
		
		
		Collection<Double> consumos =  carros.values();
		
		System.out.println("Exiba os consumos dos carros: " + consumos);
		
		
		for (Double consumo : consumos) {
			
			System.out.println(consumo);
		}
		
		
		//O modelo com o consumo mais eficiente:
		
		Double consumoMaisEficiente = Collections.max(carros.values());
		
		Set<Map.Entry<String, Double>> entries = carros.entrySet();
		
		String modeloMaisEficiente = "";
		
		for (Map.Entry<String, Double> entry: entries) {
			
			if (entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: "  + modeloMaisEficiente + " - " + consumoMaisEficiente);
				
				
			}
		}
		
		
		//O modelo com o consumo menos eficiente:
		
		Double consumoMenosEficiente = Collections.min(carros.values());
		
		String modeloMenosEficiente = "";
		
		for (Map.Entry<String, Double> entry: carros.entrySet()) {
			
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: "  + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		}
		
		
		
		System.out.println("Exiba a soma dos consumos: ");
		
		Iterator<Double> iterator = carros.values().iterator(); // O interator só funciona com Collection (values retorna um Collection).
		
		Double soma = 0.0;
		
		while( iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println(soma);
		
		
		System.out.println("Exiba a média dos consumos desse dicionário: " + (soma/carros.size()));
		
		
		System.out.println("Remova os modelos com consumo igual a 15,6 km/L: ");
		
		
		Iterator<Double> iterator1 = carros.values().iterator();
		
		while( iterator1.hasNext()) {
			if (iterator1.next().equals(15.6)) iterator1.remove();
		}
		
		
		
		System.out.println(carros.toString());
		
		
		System.out.println("Exiba todos os carros na ordem que foram informados: ");
		
		
		Map<String, Double> carros1 = new LinkedHashMap<>();
		
		carros1.put("gol", 14.4);
		carros1.put("uno", 15.6);
		carros1.put("mobi", 16.1);
		carros1.put("hb20", 14.5);
		carros1.put("kwid", 15.6);

		
		System.out.println(carros1);
		
		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		
		Map<String, Double> carros2 = new TreeMap<>(carros1);
		
		System.out.println(carros2);
		
		System.out.println("Apague o dicionário de carros: ");
		
		carros2.clear();
		
		
		System.out.println("Confira se o dicionário está vazio: " + carros2.isEmpty());
		
	}
	
	
	
	
}
