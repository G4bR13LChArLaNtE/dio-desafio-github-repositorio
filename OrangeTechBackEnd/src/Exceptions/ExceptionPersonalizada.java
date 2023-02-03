package Exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada {

	public static void main(String[] args) {
			
			String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
			
			imprimirArquivo(nomeDoArquivo);
			
			System.out.println();
			System.out.println("Chegou no Finally!");
				
			
			
			
			System.out.println("Apesar da Exception ou não, o programa continua...");
			

		}

		private static void imprimirArquivo(String nomeDoArquivo) {
			try{
			
			BufferedReader br = lerArquivo(nomeDoArquivo);
			
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			String linha = br.readLine();
				
			do {
					
				bw.write(linha);
				bw.newLine();
				linha = br.readLine();
					
					
			}while(linha != null);
				
				
			bw.flush();
			br.close();
				

			}catch (ImpossivelAbrirArquivoException e) {
				
				JOptionPane.showMessageDialog(null, e.getMessage());
				e.printStackTrace();
				
				
				
			}catch (IOException e) {
				
				JOptionPane.showMessageDialog(null, "Ocorreu um erro não esperado, por favor, fale com o suporte. "+ e.getMessage());
				e.printStackTrace();
				
			} 
			

	}

		private static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAbrirArquivoException {
			
			File arquivo = new File(nomeDoArquivo);
			
			try {
				return new BufferedReader(new FileReader(nomeDoArquivo));
			} catch (FileNotFoundException e) {
				throw new ImpossivelAbrirArquivoException(arquivo.getName(), arquivo.getPath());
			}
			
		}

}
