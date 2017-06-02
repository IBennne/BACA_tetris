package ascadis.servlet.action;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.model.Utilisateur;
import ascadis.servlet.DataAccessServlet;




@WebServlet("/login")
public class LoginServlet extends DataAccessServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		
		
		
		String nameUser = req.getParameter("username");
		String passwordUser = req.getParameter("password");
		
		List<Utilisateur> users =this.getUtilisateurDAO().findAll();
		
			for (Utilisateur user : users){
				if ((nameUser).equals(user.getUsername() ) ){
					
					if ((passwordUser).equals(user.getPassword())){
						System.out.println("exist");
						req.getSession().setAttribute("username",nameUser);
						resp.sendRedirect("home");
						
						return;
					}
				}
				
			}
			resp.sendRedirect("home");
		
			
		
		 
		
         
		
	}
}