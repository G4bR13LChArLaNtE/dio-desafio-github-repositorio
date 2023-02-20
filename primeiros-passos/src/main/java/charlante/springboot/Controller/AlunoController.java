package charlante.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import charlante.springboot.Entity.Aluno;
import charlante.springboot.Repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	    @Autowired
	    private AlunoRepository alunoRepository;

	    @GetMapping
	    public List<Aluno> listar() {
	        return alunoRepository.findAll();
	    }

	    @PostMapping
	    public Aluno criar(@RequestBody Aluno aluno) {
	        return alunoRepository.save(aluno);
	    }

	    @GetMapping("/{id}")
	    public Aluno buscar(@PathVariable Integer id) {
	        return alunoRepository.findById(id)
	                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	    }

	    @PutMapping("/{id}")
	    public Aluno atualizar(@PathVariable Integer id, @RequestBody Aluno aluno) {
	        if (!alunoRepository.existsById(id)) {
	            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	        }
	        aluno.setId(id);
	        return alunoRepository.save(aluno);
	    }

	    @DeleteMapping("/{id}")
	    public void excluir(@PathVariable Integer id) {
	        alunoRepository.deleteById(id);
	    }
	

	
	
}
