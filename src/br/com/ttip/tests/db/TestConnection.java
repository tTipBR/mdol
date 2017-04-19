package br.com.ttip.tests.db;

import java.io.IOException;

import br.com.ttip.be.BELogin;
import br.com.ttip.bean.Login;
import br.com.ttip.bean.Pessoa;
import br.com.ttip.exceptions.DBException;
import br.com.ttip.exceptions.ValidationException;
import br.com.ttip.types.TipoPessoa;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
			Login login = new Login();
			Pessoa pessoa = new Pessoa(); 
			BELogin be = new BELogin();

			String nome = "Writing test";
			
			login.setIdLogin(14);
			login.setNome(nome);
			login.seteMail("email@email.com.br");
			login.setSenha("senh@567");
			login.setFgAtivo(true);
			
			pessoa.setNome(nome);
			pessoa.setTipoPessoa(TipoPessoa.JURIDICA);
			pessoa.setFgAtivo(true);
			
			login.setPessoa(pessoa);
			
			try {
				be.incluirOuAlterar(login);
				System.out.println(nome + " incluído com sucesso!");
			}
			
			catch (ValidationException | DBException e) {
				throw (new IOException(e.getMessage()));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
