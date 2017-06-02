package ascadis.dao.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ascadis.dao.IDAO;
import ascadis.model.Tetrimino;

@Repository("tetriminoDAO")
@Transactional
public class TetriminoApplicationDAO implements IDAO<Tetrimino, String>
{
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public List<Tetrimino> findAll() {
		return this.em.createQuery("from tetrimino t", Tetrimino.class).getResultList();
	}
	
	
	@Override
	public Tetrimino find(String id) {
		return this.em.find(Tetrimino.class, id);
	}
	
	
	@Override
	public Tetrimino save(Tetrimino tetrimino) {
		return this.em.merge(tetrimino);
	}
	
	
	@Override
	public void delete(Tetrimino tetrimino) {
		this.em.remove(tetrimino);
	}

}