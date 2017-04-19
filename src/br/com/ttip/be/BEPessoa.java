package br.com.ttip.be;

import br.com.ttip.bean.Pessoa;
import br.com.ttip.dao.DAOPessoa;
import br.com.ttip.exceptions.DBException;
import br.com.ttip.exceptions.ValidationException;
import br.com.ttip.utils.MsgConsts;
	
public class BEPessoa extends BaseBE {
	
	private DAOPessoa dao = new DAOPessoa();
	private boolean transaction = false;
	
	public void incluirOuAlterar(Pessoa pessoa) throws ValidationException, DBException {
		
		if (pessoa.getNome().trim().equals("")) {
			throw (new ValidationException(MsgConsts.MSG_REQUIRED_FIELD, "Nome"));
			
		}
		
		// BEPessoa pode ser chamado por outras BE's, transação pode já ter sido iniciada
		if (!isTransactionActive()) {
			beginTransaction();
			transaction = true;
		}

		dao.setEntityManager(getEntityManager());

		if (pessoa.getIdPessoa() <= 0) {
			dao.incluir(pessoa);
		}
		
		else {
			dao.alterar(pessoa);
		}
		
		if (transaction) {
			commitTransaction();
		}
		
	}

}
