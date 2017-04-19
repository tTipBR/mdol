package br.com.ttip.be;

import br.com.ttip.bean.Login;
import br.com.ttip.dao.DAOLogin;
import br.com.ttip.exceptions.DBException;
import br.com.ttip.exceptions.ValidationException;
import br.com.ttip.utils.MsgConsts;

public class BELogin extends BaseBE {

	private DAOLogin dao = new DAOLogin();

	public void incluirOuAlterar(Login login) throws ValidationException, DBException {

		if (login.getNome().trim().equals("")) {
			throw (new ValidationException(MsgConsts.MSG_REQUIRED_FIELD, "Nome"));
		}

		if (login.getSenha().trim().equals("")) {
			throw (new ValidationException(MsgConsts.MSG_REQUIRED_FIELD, "Senha"));
		}

		if (login.geteMail().trim().equals("")) {
			throw (new ValidationException(MsgConsts.MSG_REQUIRED_FIELD, "E-Mail"));
		}

		beginTransaction();

		dao.setEntityManager(getEntityManager());

		if (login.getIdLogin() <= 0) {
			dao.incluir(login);
		}

		else {
			dao.alterar(login);
		}

		commitTransaction();

	}

	public Login getByEMail(String eMail) {

		DAOLogin dao = new DAOLogin();

		dao.setEntityManager(this.getEntityManager());

		return dao.getByEMail(eMail);

	}

	public boolean checkPassword(final Login login, String password) {

		// TODO método para comparar senha criptografada
		return (login != null && login.getSenha() != null && login.getSenha().equals(password));

	}

}
