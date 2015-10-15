package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Java;
import it.uniba.di.q2amigration.business.apispark.JavaList;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.JavaListResource;

import org.restlet.resource.ClientResource;

public class JavaListClientResource extends AbstractClientResource {

	public JavaListClientResource() {
		super("/javas/?$size=485");

	}

	public JavaList represent() throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(JavaListResource.class).represent();
	}

	public Java add(Java bean) throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(JavaListResource.class).add(bean);
	}

}