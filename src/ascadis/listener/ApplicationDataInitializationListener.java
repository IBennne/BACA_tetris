package ascadis.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import ascadis.dao.IDAO;
import ascadis.dao.application.TetriminoApplicationDAO;
import ascadis.model.Tetrimino;


@WebListener
public class ApplicationDataInitializationListener implements ServletContextListener
{
	@Override
	public void contextInitialized(ServletContextEvent event) {
		IDAO<Tetrimino, String> tetriminoDAO = new TetriminoApplicationDAO();
		event.getServletContext().setAttribute("tetriminoDAO", tetriminoDAO);
	}
	
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}
}
