package Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;


public class CheckedException {

	public static void main(String[] args) {
		
		String nomeDoArquivo = "teste.txt";
		
		
		
		try {
			imprimirArquivo(nomeDoArquivo);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Documento não existe!" + e.getCause());
		} finally {
			
			
			 System.out.println();
			System.out.println("Chegou no Finally!");
			
		}
		
		
		System.out.println("Apesar da Exception ou não, o programa continua...");
		

	}

	private static void imprimirArquivo(String nomeDoArquivo) throws FileNotFoundException {
		
		
		
		File arquivo = new File(nomeDoArquivo);
		
		
		BufferedReader br = new BufferedReader(new FileReader(arquivo.getName()));
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			String linha = br.readLine();
			
			do {
				
				bw.write(linha);
				bw.newLine();
				linha = br.readLine();
				
				
			}while(linha != null);
			
			
			bw.flush();
			br.close();
			
		} catch (Exception e) {
			System.out.println("Sem conexão, por favor, verifique o arquivo!");
		}
		
		
		
		
	}
	
	
	
	

}
