package ascadis.security;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ascadis.Rendu;


@WebFilter("/*")
public class SecuriteFilter implements Filter
{
	private ServletContext context;
	

	@Override
	public void init(FilterConfig fConfig) throws ServletException
	{
		System.out.println("INITIALISATION DU FILTRE");
		this.context = fConfig.getServletContext();
	}
	
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)resp;
		String uri = request.getRequestURI();
		
		Set<String> myAcceptedURIs = new HashSet<>();
		boolean needSecurityCheck = true;
		
		
		myAcceptedURIs.add("js/");
		myAcceptedURIs.add("css/");
		myAcceptedURIs.add("font/");
		myAcceptedURIs.add("fonts/");
		myAcceptedURIs.add("/login");
		myAcceptedURIs.add("/subscribe");
		
		
		for (String forAcceptedURI : myAcceptedURIs)
		{
			if (uri.contains(forAcceptedURI))
			{
				needSecurityCheck = false;
				break;
			}
		}
		
		if (needSecurityCheck)
		{
			//On regarde l'objet associé à la clé "username" dans la session de l'utilisateur
			if (request.getSession().getAttribute("username") == null)
			{
				Rendu.pageLogin(this.context, request, response);
				return;
			}
		}
		
		chain.doFilter(request, response);
	}
	
	
	@Override
	public void destroy()
	{
		System.out.println("DESTRUCTION DU FILTRE");
	}
}