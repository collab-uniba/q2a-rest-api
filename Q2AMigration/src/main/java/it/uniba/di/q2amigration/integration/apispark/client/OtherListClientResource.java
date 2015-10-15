package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Other;
import it.uniba.di.q2amigration.business.apispark.OtherList;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.OtherListResource;

import org.restlet.resource.ClientResource;

public class OtherListClientResource extends AbstractClientResource {

	public OtherListClientResource() {
		super("/others/?$size=2217");

	}

	public OtherList represent() throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(OtherListResource.class).represent();
	}

	public Other add(Other bean) throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(OtherListResource.class).add(bean);
	}

}