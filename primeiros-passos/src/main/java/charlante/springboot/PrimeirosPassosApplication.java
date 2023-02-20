package charlante.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		/*
		 * Calculadora calculadora = new Calculadora(); //Há o conceito de new no
		 * springboot System.out.println("O resultado é " + calculadora.soma(5, 7));
		 */
		
	}

}
