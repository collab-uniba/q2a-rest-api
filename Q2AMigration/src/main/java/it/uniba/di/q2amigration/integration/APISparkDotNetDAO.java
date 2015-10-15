package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.apispark.DotNetList;
import it.uniba.di.q2amigration.integration.apispark.client.DotNetListClientResource;

public class APISparkDotNetDAO {

	public DotNetList findAll() throws DAOException {
		DotNetListClientResource dotNets = new DotNetListClientResource();
		DotNetList dotNetList = null;

		try {
			dotNetList = dotNets.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dotNetList;
	}
	
}
