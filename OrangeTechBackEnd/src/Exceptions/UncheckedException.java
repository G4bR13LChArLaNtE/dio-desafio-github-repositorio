package Exceptions;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		
		
		boolean continueLoping = true;
		
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
			
			
			try {
				int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
				
				
				System.out.println("Resultado: " + resultado);
				
				continueLoping = false;
				
				
				
			} catch (NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
				
				//e.printStackTrace();
				
				
			}catch (ArithmeticException e) {
				
				
				
				JOptionPane.showMessageDialog(null, "Entrada inválida, o divisor não pode ser zero! " + e.getMessage());
				
				
			} finally {
				System.out.println("Chegou no finally");
			}
			
			
		}while(continueLoping);
		
		
		
		System.out.println("O código continua...");
		

	}
	
	
	public static int dividir(int a, int b) { return a / b;}

}
