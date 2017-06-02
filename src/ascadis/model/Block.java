package ascadis.model;

import org.springframework.stereotype.Repository;

@Repository
public class Block
{
	private String id;
	private int positionX;
	private int positionY;
	private boolean exist = false;
	
	public Block()
	{
		// TODO Auto-generated constructor stub
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

	/**
	 * @return the exist
	 */
	public boolean isExist()
	{
		return exist;
	}

	/**
	 * @param exist the exist to set
	 */
	public void setExist(boolean exist)
	{
		this.exist = exist;
	}
	
	

}
