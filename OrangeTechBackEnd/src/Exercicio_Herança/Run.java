package Exercicio_Herança;

public class Run {
	
	public static void main(String[] args) {
		
		
		Funcionario fun1 = new Funcionario();
		fun1.setNome("João");
		fun1.setCpf("12345678-00");
		fun1.setDepartamento("Segurança");
		fun1.setSalario(2500.57);
		
		System.out.println("Nosso primeiro funcionario é o sr(a)." + fun1.getNome());
		
		Funcionario fun2 = new Vendedor();
		
		Vendedor fun3 = new Vendedor();
		
		fun2.setCpf("156159753-20");
		fun2.setNome("Roger");
		fun2.setSalario(2759.37);
		fun2.setDepartamento("Vendas");
		
		System.out.println("O funcionário " + fun2.getNome() + " ganha R$" + fun2.getSalario());
		
		
		fun3.setCpf("156159753-20");
		fun3.setNome("Jefferson");
		fun3.setSalario(3110.89);
		
		System.out.printf("O funcionário " + fun3.getNome() + " ganha:");
		fun3.CalcularBonus(fun3.getSalario());
		
		// Downcast - Funcionario para vendedor:
		// Vendedor func4 = (Vendedor) new Funcionario();
		
		Faxineiro fun5 = new Faxineiro();
		
		fun5.setNome("Roberval");
		fun5.setSalario(1650.00);
		
		System.out.println();
		fun5.CalcularBonus(fun5.getSalario());
		
		Gerente fun6 = new Gerente();
		
		fun6.setNome("Roberto");
		fun6.setSalario(1650.00);
		
		
		System.out.println();
		fun6.CalcularBonus(fun6.getSalario());
		
		Vendedor fun7 = new Vendedor();
		
		fun7.setNome("Robert");
		fun7.setSalario(1650.00);
		
		
		System.out.println();
		fun7.CalcularBonus(fun7.getSalario());
		System.out.println();
		
		
		//Calculadora 
		
		Calculadora2 calc = new Calculadora2();
		
		
		calc.soma(4, 4);
		calc.subtracao(4, 2);
		calc.multiplicacao(4, 4);
		calc.divisao(4, 2);
		
		
		
		
	}

}
