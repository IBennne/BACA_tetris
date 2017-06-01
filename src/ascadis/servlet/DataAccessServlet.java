package ascadis.servlet;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import ascadis.dao.IDAO;
import ascadis.model.Tetrimino;
import ascadis.model.Utilisateur;


public abstract class DataAccessServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	//@EJB(mappedName="UtilisateurApplicationDAO")
	@Autowired
	private IDAO<Utilisateur, Integer> utilisateurDAO;
	
	
	protected IDAO<Tetrimino, String> getTetriminoDAO() {
		return (IDAO<Tetrimino, String>) this.getServletContext().getAttribute("tetriminoDAO");
	}
	
	protected IDAO<Utilisateur, Integer> getUtilisateurDAO() {
		return this.utilisateurDAO;
	}
	
	
	
	
	public void init(ServletConfig config) {
		try {
		super.init(config);
		}
		catch (ServletException e) {
		e.printStackTrace();
		}
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}
}