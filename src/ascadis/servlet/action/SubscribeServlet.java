package ascadis.servlet.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.Rendu;
import ascadis.model.Joueur;
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
        String myTitre="Nouvel utilisateur";
        
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
       
        		
        		myTitre = "Nouvel utilisateur";
        	}
        
        req.setAttribute("utilisateur", myUtilisateur);
        Rendu.pagePrincipale(myTitre, "/WEB-INF/views/subscribe.jsp", getServletContext(), req, resp);
		Rendu.pageUtilisateur(this.getServletContext(), req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Utilisateur myUtilisateur;
		if (req.getParameter("subscribe_password").equals(req.getParameter("subscribe_password2"))){
			
			
			myUtilisateur = new Joueur();
			
			
			
				// Si on ne trouve pas le Tetrimino, c'est que l'on est en train de l'ajouter !
			myUtilisateur.setNom(req.getParameter("subscribe_nom"));
			myUtilisateur.setPrenom(req.getParameter("subscribe_prenom"));
			myUtilisateur.setUsername(req.getParameter("subscribe_username"));
			myUtilisateur.setPassword(req.getParameter("subscribe_password"));
			
			List<Utilisateur> users =this.getUtilisateurDAO().findAll();
			String nameUser = req.getParameter("subscribe_username");
			for (Utilisateur user : users){
				if ((nameUser).equals(user.getUsername() ) ){
					System.out.println("cet utilisateur existe déja");
					resp.sendRedirect("subscribe");
					
					return;
				}else{
					this.getUtilisateurDAO().save(myUtilisateur);
					req.getSession().setAttribute("username",nameUser);
					resp.sendRedirect("home");
					return;
				}
				
			}
			
		}	
		
		else {
			resp.sendRedirect("subscribe");
		}
		
	}

}


