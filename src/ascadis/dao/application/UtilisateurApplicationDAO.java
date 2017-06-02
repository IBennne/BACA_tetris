package ascadis.dao.application;


import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ascadis.dao.IDAO;
import ascadis.model.Tetrimino;
import ascadis.model.Utilisateur;
//import tp.hibernate.Produit;


@Repository("utilisateurDAO")
@Transactional
public class UtilisateurApplicationDAO implements IDAO<Utilisateur, Integer> {
	
	@PersistenceContext
	EntityManager em;

    @Override
    public List<Utilisateur> findAll() {
    	return this.em.createQuery("from Utilisateur u", Utilisateur.class).getResultList();
    }

    @Override
    public Utilisateur find(Integer id) {
    	return this.em.find(Utilisateur.class, id);
    }

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
    	return this.em.merge(utilisateur);
    }

    @Override
    public void delete(Utilisateur utilisateur) {
    	this.em.remove(utilisateur);
    }


	
}
