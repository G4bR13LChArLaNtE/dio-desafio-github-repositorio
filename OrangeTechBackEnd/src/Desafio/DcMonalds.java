package Desafio;

import java.util.Scanner;

public class DcMonalds {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = ingredientes.split(";");
        
        for (int i = 0; i < listaIngredientes.length; i++){
          System.out.println(listaIngredientes[i]);
        }

	
        leitor.close();
     }
}
