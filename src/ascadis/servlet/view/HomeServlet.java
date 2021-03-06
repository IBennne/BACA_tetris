package ascadis.servlet.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.Rendu;
import ascadis.servlet.DataAccessServlet;


@WebServlet("/home")
public class HomeServlet extends DataAccessServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		Rendu.pageBienvenue(this.getServletContext(), req, resp);
	}
}