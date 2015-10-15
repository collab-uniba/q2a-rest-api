package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.DotNet;
import it.uniba.di.q2amigration.business.apispark.DotNetList;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.DotNetListResource;

import org.restlet.resource.ClientResource;

public class DotNetListClientResource extends AbstractClientResource {

	public DotNetListClientResource() {
		super("/dotNets/?$size=2150");

	}

	public DotNetList represent() throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(DotNetListResource.class).represent();
	}

	public DotNet add(DotNet bean) throws Exception {
		ClientResource client = getClientResource();

		return client.wrap(DotNetListResource.class).add(bean);
	}

}