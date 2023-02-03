package TrabalhandoCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class ExerciciosStreamAPI {

	
	public static void main(String[] args) {
		
		
		
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		
		//Soluções:
		
		//numerosAleatorios.stream().forEach(System.out::println);
		
		//numerosAleatorios.stream().forEach(s -> System.out.println(s));
		
		numerosAleatorios.forEach(s -> System.out.println(s));
		
		
		
		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
		
		/*
		
		numerosAleatorios.stream() //Retorna um Stream sequencial com esta coleção como origem.
		.limit(5) //Retorna um stream com 5 primeiros elementos da lista.
		.collect(Collectors.toSet()) //Retorna um Collector que acumula os elementos de entrada em um novo Set.
		.forEach(System.out::println); //Executa a ação dada para cada elemento do Iterable até que todos os elementos tenham sido processados ​​ou a ação gere uma exceção.
		
		
		*/
		
		Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
		
		collectSet.forEach(s -> System.out.println(s));
		
		
		System.out.println("Transforme esta lista de String em uma lista de números inteiros: ");
		
		
		numerosAleatorios.stream().map(Integer::parseInt) //Retorna um stream (fluxo) de inteiros
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		List<Integer> numerosAleatorios1 = numerosAleatorios.stream().map(Integer::parseInt) //Retorna um stream (fluxo) de inteiros
				.collect(Collectors.toList());
		
		numerosAleatorios1.forEach(s -> System.out.println(s.getClass()));
		
		
		 System.out.println("Peguue os números pares e maiores que 2 e coloque em uma lista: ");
		
		 
		 /*
		 List<Integer> numerosAleatorios2 = numerosAleatorios.stream()
				 .map(Integer::parseInt)
				 .filter(new Predicate<Integer>() {

					@Override
					public boolean test(Integer i) {
						if (i % 2 == 0 && i > 2)
						return true;
						
						return false;
					}
				}).collect(Collectors.toList());
		 
		 */
		 
		 List<Integer> numerosAleatorios2 = numerosAleatorios.stream()
				 .map(Integer::parseInt)
				 .filter(i -> i % 2 == 0 && i > 2)
					.collect(Collectors.toList());
			
		
		numerosAleatorios2.forEach(System.out::println);
		
		
		System.out.println("Mostre a média dos números: ");
		
		
		/*
		numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {

			@Override
			public int applyAsInt(String s) {
				return Integer.parseInt(s);
			}
		}).average().ifPresent(new DoubleConsumer() {
			
			@Override
			public void accept(double v) {
				System.out.println(v);
				
			}
		});
		*/
		
		numerosAleatorios.stream()
		.mapToInt(s -> Integer.parseInt(s))
		.average() //Função para tirar a média.
		.ifPresent(v -> System.out.println(v)); // Se der tudo certo metodo que recebe um consumer, retorna um void.
		
		System.out.println("Remova os valores ímpares: ");
		
		 numerosAleatorios1.removeIf(n -> (n % 2 != 0));
		 System.out.println(numerosAleatorios1);
		 
		 
		
		
		
	}
	
	
}
