package ascadis.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "forme")
public class Forme
{
	@Id
	@Column(name = "FORME_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FORME_NUMERO")
	private int numéro;
	
	@OneToMany(mappedBy="forme")
	private List<Block> blocks;
	
	@ManyToOne
	@JoinColumn(name="FORME_TETRI_ID")
	private Tetrimino tetrimino;
	
	public Forme()
	{
		
	}

	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * @return the numéro
	 */
	public int getNuméro()
	{
		return numéro;
	}

	/**
	 * @param numéro the numéro to set
	 */
	public void setNuméro(int numéro)
	{
		this.numéro = numéro;
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
	
	public Block exist(int i, int j)
	{
		for ( Block block: this.blocks)
		{
			if ( block.getPositionX() == i && block.getPositionY() == j )
			{
				return block;
			}
		}
		
		return null;
	}	
}
