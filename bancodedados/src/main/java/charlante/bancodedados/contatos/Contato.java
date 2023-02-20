package charlante.bancodedados.contatos;



import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;




@Entity
@Component
public class Contato {

	
	
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(nullable=false, length=50)
	private String nome;
	
	@Column(nullable=false, length=11)
	private String telefone;
	
	@Column(nullable=false, length=30)
	private String email;
	
	@Column(nullable=false)
	private String urlAvatar;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUrlAvatar() {
		return urlAvatar;
	}

	public void setUrlAvatar(String urlAvatar) {
		this.urlAvatar = urlAvatar;
	}
	
	

	public Contato() {
		super();
	}
	

	public Contato(long id, String nome, String telefone, String email, String urlAvatar) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.urlAvatar = urlAvatar;
	}
	
	
	@Override
	public String toString() {
		return "Contato(" + "id = " + id + " | " +
				"nome = " + nome + " | " +
				"telefone = " + telefone + " | " +
				"e-mail = " + email + " | " +
				"urlAvatar = " + urlAvatar + ")";
				
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	
}
