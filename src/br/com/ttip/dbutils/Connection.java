package br.com.ttip.dbutils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {

	private static EntityManagerFactory emf;
	
	public static EntityManager getEntityManager() {

		if (emf == null) {
			emf = Persistence.createEntityManagerFactory(DBConsts.CONNECTION_NAME);
		}
		
		return emf.createEntityManager();
		
	}
	
}
