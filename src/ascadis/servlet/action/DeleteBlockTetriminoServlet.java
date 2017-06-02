package ascadis.servlet.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.model.Block;
import ascadis.servlet.DataAccessServlet;

/**
 * Servlet implementation class DeleteBlockTetriminoServlet
 */
@WebServlet("/DeleteBlockTetriminoServlet")
public class DeleteBlockTetriminoServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBlockTetriminoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int idBlock = Integer.parseInt(request.getParameter("id_Block"));
		
		Block block = this.getBlockDAO().find(idBlock);
		this.getBlockDAO().delete(block);
				
		}


}
