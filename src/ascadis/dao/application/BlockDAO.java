package ascadis.dao.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ascadis.dao.IDAO;
import ascadis.model.Block;


@Repository("BlockDAO")
@Transactional
public class BlockDAO implements IDAO<Block, Integer>{

	public BlockDAO()  {
		// TODO Auto-generated constructor stub
	}
	
	@PersistenceContext
	EntityManager em;

	@Override
	public List<Block> findAll()
	{
		return this.em.createQuery("from Block b", Block.class).getResultList();
	}

	@Override
	public Block find(Integer id)
	{
		return this.em.find(Block.class, id);
	}

	@Override
	public Block save(Block forme)
	{
		return this.em.merge(forme);
	}

	@Override
	public void delete(Block block)
	{
		this.em.remove(block);;
	}

}

