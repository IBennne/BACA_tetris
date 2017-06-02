package ascadis.dao;

import java.util.List;

public interface IDAO<T, PK>
{
	public List<T> findAll();
	public T find(PK id);
	public T save(T object);
	public void delete(T object);
	
}