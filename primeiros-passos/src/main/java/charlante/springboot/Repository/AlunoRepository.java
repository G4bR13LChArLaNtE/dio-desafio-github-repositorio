package charlante.springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import charlante.springboot.Entity.Aluno;



@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
	List<Aluno> findByName(String Name);

}
