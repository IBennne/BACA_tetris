package ascadis.servlet.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.servlet.DataAccessServlet;




@WebServlet("/login")
public class LoginServlet extends DataAccessServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.getSession().setAttribute("username", req.getParameter("username"));
		resp.sendRedirect("home");
	}
}