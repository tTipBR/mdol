package br.com.ttip.servlet.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ttip.be.BELogin;
import br.com.ttip.bean.Login;

/**
 * Servlet implementation class LoginAcessar
 */
@WebServlet("/login/acessar")
public class LoginAcessar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginAcessar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/html/entrada.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BELogin be = new BELogin();
		Login login = be.getByEMail(request.getParameter("email"));
		
		try {
					
			if (login == null) {
				throw (new IOException("e-Mail inválido ou não cadastrado"));
			}
			
			if (!be.checkPassword(login, request.getParameter("senha"))) {
				throw (new IOException("Senha inválida"));
			}
			
			if (request.getSession() == null) {
				System.out.println("Neste momento eu criaria uma sessão");
			}

			request.getSession(true).setAttribute("session.login", login);
			RequestDispatcher rd = request.getRequestDispatcher("/html/inicio.jsp");
			
			rd.forward(request, response);		
			
		}
		
		catch (IOException e) {
			
			request.setAttribute("erro", e.getMessage());
			response.setStatus(403);
			
			RequestDispatcher rd = request.getRequestDispatcher("/html/entrada.jsp");
			rd.forward(request, response);
			
		}
				
	}

}
