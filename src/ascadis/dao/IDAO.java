package ascadis.dao;

import java.util.List;

import ascadis.model.Tetrimino;
import ascadis.model.Utilisateur;

public interface IDAO<T, PK>
{
	public List<T> findAll();
	public Utilisateur find(int id);
	public Tetrimino find(String id);
	public T save(T object);
	public void delete(T object);
	
	
	
	
}