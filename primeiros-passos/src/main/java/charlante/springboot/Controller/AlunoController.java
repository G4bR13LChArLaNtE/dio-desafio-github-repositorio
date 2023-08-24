package charlante.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

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
