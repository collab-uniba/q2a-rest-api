package it.uniba.di.q2amigration.integration;

import it.uniba.di.q2amigration.business.apispark.RubyList;
import it.uniba.di.q2amigration.integration.apispark.client.RubyListClientResource;

public class APISparkRubyDAO {

	public RubyList findAll() throws DAOException {
		RubyListClientResource rubys = new RubyListClientResource();
		RubyList rubyList = null;

		try {
			rubyList = rubys.represent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return rubyList;
	}
	
}
