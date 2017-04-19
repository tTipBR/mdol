package br.com.ttip.be;

import javax.persistence.EntityManager;

import br.com.ttip.dbutils.Connection;
import br.com.ttip.dbutils.DBConsts;
import br.com.ttip.exceptions.DBException;

public class BaseBE {
	
	private EntityManager em;
	
	public BaseBE() {
	}
	
	public BaseBE(EntityManager em) {
		this.em = em;
	}
	
	protected EntityManager getEntityManager() {

		if (em == null) {
			em = Connection.getEntityManager();
		}
		
		return em;
		
	}
	
	protected boolean isTransactionActive() {
		
		boolean ret = false;
		
		if (em != null) {
			ret = em.getTransaction().isActive();
		}
		
		return ret;
		
	}
	
	protected void beginTransaction() throws DBException {
		
		if (em == null) {
			em = Connection.getEntityManager();
		}
		
		if (em.getTransaction().isActive()) {
			throw new DBException(DBConsts.EXCEPTION_ACTIVE_TRANSACTION);
		}
		
		em.getTransaction().begin();
		
	}

	protected void commitTransaction() throws DBException {
		
		if (em == null) {
			throw new DBException(DBConsts.ENTITYMANAGER_NOT_INITIALIZED);
		}
		
		if (!em.getTransaction().isActive()) {
			throw new DBException(DBConsts.EXCEPTION_NONACTIVE_TRANSACTION);
		}
		
		em.getTransaction().commit();
		
	}

	protected void rollbackTransaction() throws DBException {
		
		if (em == null) {
			throw new DBException(DBConsts.ENTITYMANAGER_NOT_INITIALIZED);
		}
		
		if (!em.getTransaction().isActive()) {
			throw new DBException(DBConsts.EXCEPTION_NONACTIVE_TRANSACTION);
		}
		
		em.getTransaction().rollback();
		
	}

}
