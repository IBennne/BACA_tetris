package ascadis.dao.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ascadis.dao.IDAO;
import ascadis.model.Forme;
import ascadis.model.Tetrimino;
import ascadis.model.Utilisateur;

@Repository
@Transactional
public class FormeApplicationDAO implements IDAO<Forme, String>
{

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Forme> findAll()
	{
		return this.em.createQuery("from Forme f ", Utilisateur.class).getResultList();
	}

	@Override
	public Forme find(String id)
	{
		return formes.get(id);
	}

	@Override
	public Forme save(Forme forme)
	{
		return formes.put(forme.getId(), forme);
	}

	@Override
	public void delete(Forme forme)
	{
		formes.remove(forme.getId());
	}

}
