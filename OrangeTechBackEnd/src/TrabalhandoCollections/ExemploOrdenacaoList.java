package TrabalhandoCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
  Dados as seguintes informações sobre meus gatos, críe uma lista
  e ordene esta lista exibindo:
  
  (nome - idade - cor);
  
  Gato 1 = nome: Jan, idade: 18, cor: preto
  Gato 2 = nome: Simba, idade: 6, cor: tigrado
  Gato 3 = nome: Jon, idade: 12, cor amarelo
  
 */

public class ExemploOrdenacaoList {

	public static void main(String[] args) {

		String[] Gato1 = new String[] { "Jan", "18", "preto" };
		String[] Gato2 = new String[] { "Simba", "6", "tigrado" };
		String[] Gato3 = new String[] { "Jon", "12", "amarelo" };

		ArrayList<String[]> gatos1 = new ArrayList<>();
		gatos1.add(Gato1);
		gatos1.add(Gato2);
		gatos1.add(Gato3);

		for (int i = 0; i < gatos1.size(); i++) {
			System.out
					.println("Nome: " + gatos1.get(i)[0] + " Idade: " + gatos1.get(i)[1] + " Cor: " + gatos1.get(i)[2]);
		}

		ArrayList<Gato> gatos2 = new ArrayList<>();

		gatos2.add(new Gato("Jan", 18, "preto"));
		gatos2.add(new Gato("Simba", 6, "tigrado"));
		gatos2.add(new Gato("Jon", 12, "amarelo"));

		System.out.println("--\tOrdem de Inserção\t---");

		// Método .toString() foi Sobreescrito na classe Gato para efetuar a impressão
		System.out.println(gatos2.toString());

		System.out.println("--\tOrdem de aleatória\t---");

		Collections.shuffle(gatos2);

		System.out.println(gatos2.toString());

		System.out.println("--\tOrdem natural\t---");

		Collections.sort(gatos2);

		System.out.println(gatos2.toString());

		System.out.println("--\tOrdem por idade\t---");
		// Collections.sort(gatos2, new ComparatorIdade()); //Utilizando a classe criada

		gatos2.sort(new Comparator<Gato>() {

			@Override
			public int compare(Gato gato1, Gato gato2) {
				// Utilizando a classe já existente da interface Comparable
				return Integer.compare(gato1.getIdade(), gato2.getIdade());
			}
		});

		System.out.println(gatos2.toString());

		System.out.println("--\tOrdem por Cor\t---");

		Collections.sort(gatos2, new ComparatorCor());

		System.out.println(gatos2.toString());

		System.out.println("--\tOrdem por Nome/Cor/Idade\t---");

		// Collections.sort(gatos2, new ComparatorNomeCorIade());

		gatos2.sort(new ComparatorNomeCorIdade());

		System.out.println(gatos2.toString());

	}

}
