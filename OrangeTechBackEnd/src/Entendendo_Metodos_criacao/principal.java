package Entendendo_Metodos_criacao;

public class principal {

	
	public static void main(String[] args) {
	
		// Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.sub(9, 1.8);
        Calculadora.mult(7, 8);
        Calculadora.div(5, 2.5);
        System.out.println();
        
        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        System.out.println();

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        
	}
	

	
}
