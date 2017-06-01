package ascadis.dao.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ascadis.dao.IDAO;
import ascadis.model.Tetrimino;
import ascadis.model.Utilisateur;

public class TetriminoApplicationDAO implements IDAO<Tetrimino, String>
{
	private Map<String, Tetrimino> tetriminos = new HashMap<String, Tetrimino>();
	
	
	@Override
	public List<Tetrimino> findAll() {
		return new ArrayList<>(tetriminos.values());
	}
	
	
	@Override
	public Tetrimino find(String id) {
		return tetriminos.get(id);
	}
	
	
	@Override
	public Tetrimino save(Tetrimino tetrimino) {
		return tetriminos.put(tetrimino.getId(), tetrimino);
	}
	
	
	@Override
	public void delete(Tetrimino tetrimino) {
		tetriminos.remove(tetrimino.getId());
	}


	@Override
	public Utilisateur find(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}