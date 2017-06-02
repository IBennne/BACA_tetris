package ascadis.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Repository
@Table(name = "forme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Forme
{
	@Id
	@Column(name = "FORME_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(name = "FORME_NUMERO")
	private int numero;
	
	@ManyToOne
	@JoinColumn(name="PRO_FOURNISSEUR_ID")
	private List<Block> blocks;
	
	public Forme()
	{
		
	}

	/**
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * @return the numéro
	 */
	public int getNumero()
	{
		return numero;
	}

	/**
	 * @param numéro the numéro to set
	 */
	public void setNumero(int numéro)
	{
		this.numero = numéro;
	}

	/**
	 * @return the blocks
	 */
	public List<Block> getBlocks()
	{
		return blocks;
	}

	/**
	 * @param blocks the blocks to set
	 */
	public void setBlocks(List<Block> blocks)
	{
		this.blocks = blocks;
	}

	
	
}
