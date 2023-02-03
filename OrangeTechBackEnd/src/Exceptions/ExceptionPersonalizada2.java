package Exceptions;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada2 {

	public static void main(String[] args) {
		
		int[] numerador = {4, 5, 8, 10};
		int[] denominador = {2, 4, 0, 2, 8};
		
		
		for (int i = 0; i< denominador.length; i++) {
			
			try {
			
			if(numerador[i] %2 != 0 ) throw new DivisaoNaoExataException("Divisão com resto!", denominador[i], numerador[i]);
			
			
			int resultado = numerador[i] / denominador[i];
			
			System.out.println(resultado);
			}catch (DivisaoNaoExataException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null,"Divisão por zero não pode ser feita!" + e.getMessage());
			}catch (ArrayIndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null,"Verifique se os dois Arrays tem o mesmo tamanho!" + e.getMessage());
			}
		}
		
		System.out.println("O programa continua aqui...");
		
		
		
		
		

	}

}
