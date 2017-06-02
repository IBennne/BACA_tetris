package ascadis.model;

import javax.persistence.*;

@Entity
public class Block
{
	@Id
	@Column(name = "BLOCK_ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "BLOCK_POSX", nullable = false)
	private int positionX;
	
	@Column(name = "BLOCK_POSY", nullable = false)
	private int positionY;
	
	@ManyToOne
	@JoinColumn(name="BLOCK_FORM_ID")
	private Forme forme;
	
	public Block()
	{
		// TODO Auto-generated constructor stub
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
	 * @return the positionX
	 */
	public int getPositionX()
	{
		return positionX;
	}

	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(int positionX)
	{
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public int getPositionY()
	{
		return positionY;
	}

	/**
	 * @param positionY the positionY to set
	 */
	public void setPositionY(int positionY)
	{
		this.positionY = positionY;
	}

}
