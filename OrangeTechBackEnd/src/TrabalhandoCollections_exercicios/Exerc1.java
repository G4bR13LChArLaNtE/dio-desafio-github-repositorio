package TrabalhandoCollections_exercicios;

import java.util.ArrayList;
import java.util.Iterator;

public class Exerc1 {

	public static void main(String[] args) {

		Double[] temperaturas = new Double[] { 27.5, 29.7, 31.3, 34.7, 22.1, 21.8 };

		ArrayList<Double> temp = new ArrayList<>();

		for (int i = 0; i < temperaturas.length; i++) {
			temp.add(temperaturas[i]);
		}

		// Calcule a média das temperaturas:

		Iterator<Double> iterator = temp.iterator();

		Double soma = 0.0;

		while (iterator.hasNext()) {

			Double next = iterator.next();
			soma += next;

		}

		double media = soma / temp.size();

		System.out.printf("A média da temperaturas é : %.2f", (media));

		System.out.println();

		// Mostre todas as temperaturas acima da média:

		ArrayList<Double> tempAcimaMedia = new ArrayList<>();

		for (int i = 0; i < temperaturas.length; i++) {
			tempAcimaMedia.add(temperaturas[i]);
		}

		Iterator<Double> iterator1 = tempAcimaMedia.iterator();

		while (iterator1.hasNext()) {

			Double next = iterator1.next();

			int num = 6;

			if (next < (soma / num))
				iterator1.remove();

		}

		System.out.println(tempAcimaMedia);

		// Mostre o mes de cada Temperatura acima da média:

		for (int i = 0; i < temp.size(); i++) {
			Double num1 = temp.get(i);

			if (num1 >= media) {
				int pos = i;

				System.out.println("Os meses acima da média são: ");

				if (pos == 0) {
					System.out.println("1 - Janeiro");
				} else if (pos == 1) {
					System.out.println("2 - Fevereiro");
				} else if (pos == 2) {
					System.out.println("3 - Março");
				} else if (pos == 3) {
					System.out.println("4 - Abril");
				} else if (pos == 4) {
					System.out.println("5 - Maio");
				} else if (pos == 5) {
					System.out.println("6 - Junho");
				}

			}
		}

	}

}
