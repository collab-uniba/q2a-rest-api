package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.apispark.JavaList;
import it.uniba.di.q2amigration.integration.apispark.client.JavaListClientResource;

public class APISparkJavaDAO {

	public JavaList findAll() throws DAOException {
		JavaListClientResource javas = new JavaListClientResource();
		JavaList javaList = null;

		try {
			javaList = javas.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return javaList;
	}
	
}
