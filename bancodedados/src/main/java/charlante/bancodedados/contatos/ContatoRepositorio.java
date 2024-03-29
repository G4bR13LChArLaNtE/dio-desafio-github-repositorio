package charlante.bancodedados.contatos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "contatos", path = "contatos")
public interface ContatoRepositorio  extends JpaRepository<Contato, Long>{
}
