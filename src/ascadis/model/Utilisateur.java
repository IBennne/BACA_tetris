package ascadis.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@DiscriminatorColumn(name="TYPE_UTILISATEUR")
@Entity
@Table(name="utilisateur")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Utilisateur implements Serializable {
	
	
	private static final long serialVersionUID = 1L;

	@Column(name="UTI_NOM")
	@NotNull
	@Size(max=50)
	private String nom;
	
	@Column(name="UTI_PRENOM")
	@NotNull
	@Size(max=50)
	private String prenom;
	
	@Column(name="UTI_USERNAME")
	@NotNull
	@Size(max=50)
	private String username;
	
	@Column(name="UTI_PASSWORD")
	@NotNull
	@Size(max=50)
	private String password;
	
	@Id
	@Column(name="UTI_ID", nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	
	public Utilisateur(String nom, String prenom, String username, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
		
	}
	
	public Utilisateur() {
		
		
		
	}
	
	
	
	
}
