package br.com.primeup.cadastro.visao;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.getWriter().append("Server at: ").append(request.getContextPath());
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		if (uname.equals("primeup")&& password.equals("Primeup@2022"))
		{
			response.sendRedirect("views/funcionario/cadastro.jsp");
		}
		else {
			response.sendRedirect("error.jsp");
		}
	}
	
	
}
