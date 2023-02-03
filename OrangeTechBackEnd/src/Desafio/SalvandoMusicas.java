package Desafio;

import java.util.Scanner;

public class SalvandoMusicas {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        int pos = arquivoDoPc.indexOf("mp3");
        
        if (pos != -1) {
        	System.out.println("Salvar");
        }else {
        	System.out.println("Deletar");
        }
        
        leitor.close();

    }
	
}
