package ascadis.model;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

@Repository
@Table(name = "tetrimino")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tetrimino implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TETRI_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "TETRI_NOM")
	private String nom;

	@Column(name = "TETRI_COULEUR")
	private String couleur;

	@OneToMany
	@JoinTable(
		name="formes",
		joinColumns=@JoinColumn(name="TETRI_FORMES_ID", referencedColumnName="TETRI_ID"),
		inverseJoinColumns=@JoinColumn(name="FORME_TETRI_ID", referencedColumnName="FORME_ID")
	)
	private List<Forme> formes;
	
	public String getId()
	{
		return this.id;
	}
	
	public void setId(String id)
	{
		this.id = id;
	}

	public String getNom()
	{
		return nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getCouleur()
	{
		return couleur;
	}

	public void setCouleur(String couleur)
	{
		this.couleur = couleur;
	}


	/**
	 * @return the formes
	 */
	public List<Forme> getFormes()
	{
		return formes;
	}

	/**
	 * @param formes the formes to set
	 */
	public void setFormes(List<Forme> formes)
	{
		this.formes = formes;
	}

	public Tetrimino()
	{

		this.id = UUID.randomUUID().toString();

	}

	public Tetrimino(String nom, String couleur)
	{
		super();
		this.nom = nom;
		this.couleur = couleur;
	}
}