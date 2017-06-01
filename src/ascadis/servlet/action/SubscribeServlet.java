package ascadis.servlet.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.Rendu;

import ascadis.model.Utilisateur;
import ascadis.servlet.DataAccessServlet;

/**
 * Servlet implementation class SubscribeServlet
 */
@WebServlet("/subscribe")
public class SubscribeServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Utilisateur myUtilisateur = null;
        String myTitre;
        
        	if (req.getParameter("utilisateur_id") != null) {
        		int myUtilisateurId = Integer.parseInt(req.getParameter("utilisateur_id"));
        		myUtilisateur = this.getUtilisateurDAO().find(myUtilisateurId);

        		if (myUtilisateur == null) {
        			resp.sendRedirect("subscribe");
        			return;
        		}

        		myTitre = "Edition nouvel utilisateur";
        	}

        	else {
        		myUtilisateur = new Utilisateur("nom", "prenom", "nom d'utilisateur","mot de passe");
        		myTitre = "Nouvel utilisateur";
        	}
        
        req.setAttribute("utilisateur", myUtilisateur);
        Rendu.pagePrincipale(myTitre, "/WEB-INF/views/subscribe.jsp", getServletContext(), req, resp);
		//Rendu.pageUtilisateur(this.getServletContext(), req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Utilisateur myutilisateur = new Utilisateur();
		if (req.getParameter("subscribe_password").equals(req.getParameter("subscribe_password2"))){
			
				// Si on ne trouve pas le Tetrimino, c'est que l'on est en train de l'ajouter !
			myutilisateur.setNom(req.getParameter("subscribe_nom"));
			myutilisateur.setPrenom(req.getParameter("subscribe_prenom"));
			myutilisateur.setUsername(req.getParameter("subscribe_username"));
			myutilisateur.setPassword(req.getParameter("subscribe_password"));
			
			this.getUtilisateurDAO().save(myutilisateur);
	
			resp.sendRedirect("home");
		}	
		
		else {
			resp.sendRedirect("subscribe");
		}
		
	}

}


