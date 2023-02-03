package POO;

public class Program {

	public static void main(String[] args) {
		
		
		
		// Carro - Sobrecarga de método
		double valor = 0.0;
		
		Carro carro1 = new Carro("Gol", "Preto", "VolksWagem", 50, false, 30, 55);
		
		carro1.setCombustivel(40);
		carro1.setFrear(true);
		valor = carro1.valorCombustivel(carro1.getCombustivel(), carro1.getTanque());
		
		System.out.printf("Valor para encher o tanque com gasolina R$%.2f", valor);
		System.out.println();
		
		valor = carro1.valorCombustivel(carro1.getCombustivel(), carro1.getTanque(), 3.85);
		
		
		System.out.println("Valor para encher o tanque R$" + valor);
		
		
		Carro carro2 = new Carro("Palio", 25, 45);
		
		valor = carro2.valorCombustivel(carro2.getCombustivel(), carro2.getTanque());
		
		System.out.printf("Valor para encher o tanque com gasolina R$%.2f", valor);
		
		System.out.println();
		
		valor = carro2.valorCombustivel(carro2.getCombustivel(), carro2.getTanque(), 3.85);
		
		
		System.out.printf("Valor para encher o tanque R$%.2f", valor);
		
		
		Veiculo carro3 = new Veiculo();
		
		carro3.setTipo("Terrestre");
		carro3.setNome("New Fiesta");
		carro3.setCor("Branco");
		carro3.setTanque(55);
		carro3.setVelocidadeMaxima(220);
		
		System.out.println(carro3.getNome());
		
		Carro carro4 = new Carro();
		
		carro4.setNome("Corolla");
		carro4.setCor("Preto");
		carro4.setTanque(65);
		carro4.setVelocidadeMaxima(250);
		carro4.setMarca("Toyota");
		
		System.out.println("Eu tenho um " + carro4.getNome() + " " + carro4.getCor() + " com um tanque de " + carro4.getTanque()
		+ " litros de capacidade e velocidade máxima de " + carro4.getVelocidadeMaxima() + " Km/h." );
		
		Veiculo carro5 = new Veiculo();
		
		carro5.setNome("Civic");
		carro5.setCor("Prata");
		carro5.setTanque(55); 
		carro5.setVelocidadeMaxima(240);
		
		System.out.println("Eu tenho um " + carro5.getNome() + " " + carro5.getCor() + " com um tanque de " + carro5.getTanque()
		+ " litros de capacidade e velocidade máxima de " + carro5.getVelocidadeMaxima() + " Km/h." );
		
		
		//Upcast - Carro para Veiculo
		Veiculo carro6 = new Carro();
		
		carro6.setNome("Fit");
		carro6.setCor("Cinza");
		carro6.setTanque(50); // Não vai salvar a informação pois, temos esse método em na classe mãe e filha.
		carro6.setVelocidadeMaxima(220);
		
		System.out.println("Eu tenho um " + carro6.getNome() + " " + carro6.getCor() + " com um tanque de " + carro6.getTanque()
		+ " litros de capacidade e velocidade máxima de " + carro6.getVelocidadeMaxima() + " Km/h." );
		
		
		//Downcast - Veiculo para carro
		Veiculo carro7 = (Carro) new Carro();
		
		carro7.setNome("Eco Sport");
		carro7.setCor("Vermelha");
		carro7.setTanque(50); // Não vai salvar a informação pois, temos esse método em na classe mãe e filha.
		carro7.setVelocidadeMaxima(210);
		
		System.out.println("Eu tenho um " + carro7.getNome() + " " + carro7.getCor() + " com um tanque de " + carro7.getTanque()
		+ " litros de capacidade e velocidade máxima de " + carro7.getVelocidadeMaxima() + " Km/h." );
		
	}
}
