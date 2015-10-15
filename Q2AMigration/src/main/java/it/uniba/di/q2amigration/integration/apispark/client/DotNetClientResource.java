package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.DotNet;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.DotNetResource;

import org.restlet.resource.ClientResource;

public class DotNetClientResource extends AbstractClientResource {

	String dotNetid;

	public DotNetClientResource(String dotNetid) {
		super("/dotNets/{dotNetid}");
		this.dotNetid = dotNetid;
	}

	public DotNet represent() throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("dotNetid", dotNetid);
		return client.wrap(DotNetResource.class).represent();
	}

	public DotNet store(DotNet bean) throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("dotNetid", dotNetid);
		return client.wrap(DotNetResource.class).store(bean);
	}

	public void remove() throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("dotNetid", dotNetid);
		client.wrap(DotNetResource.class).remove();
	}

}