package br.com.ttip.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.ttip.bean.Login;

public class DAOLogin extends BaseDAO {
	
	public void incluir(Login loginBean) {
		getEntityManager().persist(loginBean);
	}
	
	public void alterar(Login loginBean) {
		EntityManager em = getEntityManager();
		Login login = em.merge(loginBean);
		em.persist(login);
	}
	
	public Login getByEMail(final String eMail) {
		
		EntityManager em = getEntityManager();
		Login ret = null;
	
		Query qry = em.createQuery("SELECT l FROM Login l WHERE l.eMail = :email", Login.class);
		
		qry.setParameter("email", eMail);
		
		try {
			ret = (Login)qry.getSingleResult();
		} 
		
		catch (NoResultException e) {
			ret = null;
		}
				
		return ret;
	}

}
