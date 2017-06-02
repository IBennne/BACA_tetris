package ascadis.servlet.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.dao.application.TetriminoApplicationDAO;
import ascadis.model.Forme;
import ascadis.servlet.DataAccessServlet;

/**
 * Servlet implementation class EditFormeTetrminoServlet
 */
@WebServlet("/EditFormeTetrminoServlet")
public class EditFormeTetrminoServlet extends DataAccessServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditFormeTetrminoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idTetri = request.getParameter("id_Tetri");
		Forme forme = new Forme();
		
		forme.setTetrimino(getTetriminoDAO().find(idTetri));
		forme = this.getFormeDAO().save(forme);
	}

	
}
