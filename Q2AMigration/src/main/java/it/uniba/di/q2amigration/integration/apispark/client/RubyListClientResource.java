package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Ruby;
import it.uniba.di.q2amigration.business.apispark.RubyList;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.RubyListResource;

import org.restlet.resource.ClientResource;

public class RubyListClientResource extends AbstractClientResource {

	public RubyListClientResource() {
		super("/rubies/?$size=709");

	}

	public RubyList represent() throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(RubyListResource.class).represent();
	}

	public Ruby add(Ruby bean) throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(RubyListResource.class).add(bean);
	}

}