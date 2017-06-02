package ascadis.servlet.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.model.Forme;
import ascadis.servlet.DataAccessServlet;

/**
 * Servlet implementation class DeleteFormeTetriminoServlet
 */
@WebServlet("/DeleteFormeTetriminoServlet")
public class DeleteFormeTetriminoServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFormeTetriminoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idForme = Integer.parseInt(request.getParameter("id_Forme"));
		
		Forme forme = this.getFormeDAO().find(idForme);
		this.getFormeDAO().delete(forme);
	}


}
