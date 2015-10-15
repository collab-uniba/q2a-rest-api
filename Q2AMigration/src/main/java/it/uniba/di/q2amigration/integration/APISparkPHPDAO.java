package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.apispark.PHPList;
import it.uniba.di.q2amigration.integration.apispark.client.PHPListClientResource;

public class APISparkPHPDAO {

	public PHPList findAll() throws DAOException {
		PHPListClientResource phps = new PHPListClientResource();
		PHPList phpList = null;

		try {
			phpList = phps.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return phpList;
	}
	
}
