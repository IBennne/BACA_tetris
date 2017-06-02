package ascadis.dao.application;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ascadis.dao.IDAO;
import ascadis.model.Forme;

@Repository("formeDAO")
@Transactional
public class FormeApplicationDAO implements IDAO<Forme, Integer>
{

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Forme> findAll()
	{
		return this.em.createQuery("from Forme f", Forme.class).getResultList();
	}

	@Override
	public Forme find(Integer id)
	{
		return this.em.find(Forme.class, id);
	}

	@Override
	public Forme save(Forme forme)
	{
		return this.em.merge(forme);
	}

	@Override
	public void delete(Forme forme)
	{
		this.em.remove(forme);;
	}

}
