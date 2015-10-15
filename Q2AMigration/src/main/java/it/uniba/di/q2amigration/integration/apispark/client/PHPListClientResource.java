package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.PHP;
import it.uniba.di.q2amigration.business.apispark.PHPList;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.PHPListResource;

import org.restlet.resource.ClientResource;

public class PHPListClientResource extends AbstractClientResource {

	public PHPListClientResource() {
		super("/pHPs/?$size=760");

	}

	public PHPList represent() throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(PHPListResource.class).represent();
	}

	public PHP add(PHP bean) throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(PHPListResource.class).add(bean);
	}

}