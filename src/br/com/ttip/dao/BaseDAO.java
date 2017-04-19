package br.com.ttip.dao;

import javax.persistence.EntityManager;

public class BaseDAO {
	
	private EntityManager em;
	
	public BaseDAO() {
	}
	
	public void setEntityManager(final EntityManager em) {
		this.em = em;
	}

	public EntityManager getEntityManager() {
		return em;
	}

}
