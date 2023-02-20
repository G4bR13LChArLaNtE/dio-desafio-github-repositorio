package charlante.bancodedados.contatos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ContatoApp implements CommandLineRunner {

	
	@Autowired
	private Contato contato1;
	
	@Autowired
	private Contato contato2;
	
	
	@Autowired
	private ContatoRepositorio repositorio; 
	
	@Override
	public void run(String... args) throws Exception {
		
		
		contato1.setNome("João");
		contato1.setTelefone("1199796789");
		contato1.setEmail("joão.silva@gmail.com");
		contato1.setUrlAvatar("www.joaodasilva.org.br");
		
		
		
		contato2.setNome("Roberto");
		contato2.setTelefone("11999778989");
		contato2.setEmail("roberto.carvalho@gmail.com");
		contato2.setUrlAvatar("www.robertocar.com.br");
		
		
		repositorio.save(contato1);
		repositorio.save(contato2);
		
		
	}

}
