package ascadis.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "forme")
@Inheritance(strategy = InheritanceType.JOINED)
public class Forme
{
	@Id
	@Column(name = "FORME_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FORME_NUMERO")
	private int numero;
	
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

	public Tetrimino getTetrimino() {
		return tetrimino;
	}

	public void setTetrimino(Tetrimino tetrimino) {
		this.tetrimino = tetrimino;
	}

	
	
}
