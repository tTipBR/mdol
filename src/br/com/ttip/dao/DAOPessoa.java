package br.com.ttip.dao;

import javax.persistence.EntityManager;

import br.com.ttip.bean.Pessoa;

public class DAOPessoa extends BaseDAO {
	
	public void incluir(Pessoa pessoaBean) {
		getEntityManager().persist(pessoaBean);
	}
	
	public void alterar(Pessoa pessoaBean) {
		EntityManager em = getEntityManager();
		Pessoa pessoa = em.merge(pessoaBean);
		em.persist(pessoa);
	}

}
