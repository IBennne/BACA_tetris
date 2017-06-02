package ascadis.servlet.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ascadis.dao.IDAO;
import ascadis.model.Tetrimino;

/**
 * Servlet implementation class blockTetriminoServlet
 */
@WebServlet("/block")
public class blockTetriminoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	@Qualifier("tetriminoApplicationDAO")
	IDAO<Tetrimino,String> tetrimino;
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tetrimino t = this.tetrimino.find(request.getParameter("idTetrimino"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
