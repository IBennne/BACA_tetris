package ascadis.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tetrimino")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tetrimino implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "TETRI_ID", nullable = false)
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id;

	@Column(name = "TETRI_NOM")
	private String nom;

	@Column(name = "TETRI_COULEUR")
	private String couleur;

	@OneToMany(mappedBy="tetrimino")
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

	}

	public Tetrimino(String nom, String couleur)
	{
		super();
		this.nom = nom;
		this.couleur = couleur;
	}
}