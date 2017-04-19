package br.com.ttip.servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ttip.be.BELogin;
import br.com.ttip.bean.Login;
import br.com.ttip.bean.Pessoa;
import br.com.ttip.exceptions.DBException;
import br.com.ttip.exceptions.ValidationException;
import br.com.ttip.types.TipoPessoa;

/**
 * Servlet implementation class LoginCadastrar
 */
@WebServlet("/login/cadastrar")
public class LoginCadastrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCadastrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Login login;
		Pessoa pessoa = new Pessoa(); 
		BELogin be = new BELogin();
		
		login = be.getByEMail(request.getParameter("email"));
		
		if (login != null) {
			throw (new IOException("e-Mail já cadastrado!"));
		}

		login = new Login();
		
		String nome = request.getParameter("email");
		
		nome = nome.substring(0, nome.indexOf("@"));
		
		login.setNome(nome);
		login.seteMail(request.getParameter("email"));
		login.setSenha(request.getParameter("senha"));
		login.setFgAtivo(true);
		
		pessoa.setNome(nome);
		pessoa.setTipoPessoa(TipoPessoa.FISICA);
		pessoa.setFgAtivo(true);
		
		login.setPessoa(pessoa);
		
		try {
			be.incluirOuAlterar(login);
			response.getWriter().append(nome + " incluído com sucesso!");
		}
		
		catch (ValidationException | DBException e) {
			throw (new IOException(e.getMessage()));
		}
		
		
	}

}
