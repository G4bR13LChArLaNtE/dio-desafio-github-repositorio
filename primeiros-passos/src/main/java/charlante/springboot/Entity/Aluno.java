package charlante.springboot.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
@Component
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 10, nullable = false)
	private String pass;
	
	@Column(length = 20, nullable = false)
	private String username;
	
	
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Aluno() {
		super();
	}
	
	
	public Aluno(Integer id, String name, String pass, String username) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.username = username;
	}
	
	
	@Override
	public String toString() {
		
		return "Aluno(" +
				"name = " + name + " | " +
				"username = " + username + " | " +
				"passaword = " + pass + ") ";
	}
	
	
	
	
	
	
	

}
