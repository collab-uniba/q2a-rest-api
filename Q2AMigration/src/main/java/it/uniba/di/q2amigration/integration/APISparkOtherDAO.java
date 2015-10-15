package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.apispark.OtherList;
import it.uniba.di.q2amigration.integration.apispark.client.OtherListClientResource;

public class APISparkOtherDAO {

	public OtherList findAll() throws DAOException {
		OtherListClientResource others = new OtherListClientResource();
		OtherList otherList = null;

		try {
			otherList = others.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return otherList;
	}
	
}
