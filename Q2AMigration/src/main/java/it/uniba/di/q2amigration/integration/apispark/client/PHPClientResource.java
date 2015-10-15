package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.PHP;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.PHPResource;

import org.restlet.resource.ClientResource;

public class PHPClientResource extends AbstractClientResource {

	String pHPid;

	public PHPClientResource(String pHPid) {
		super("/pHPs/{pHPid}");
		this.pHPid = pHPid;
	}

	public PHP represent() throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("pHPid", pHPid);
		return client.wrap(PHPResource.class).represent();
	}

	public PHP store(PHP bean) throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("pHPid", pHPid);
		return client.wrap(PHPResource.class).store(bean);
	}

	public void remove() throws Exception {
		ClientResource client = getClientResource();
		client.setAttribute("pHPid", pHPid);
		client.wrap(PHPResource.class).remove();
	}

}