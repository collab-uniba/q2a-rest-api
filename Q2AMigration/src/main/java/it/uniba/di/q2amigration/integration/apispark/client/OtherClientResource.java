package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Other;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.OtherResource;

import org.restlet.resource.ClientResource;

public class OtherClientResource extends AbstractClientResource {

    String otherid;
    	
    public OtherClientResource(String otherid) {
    	super("/others/{otherid}");
        this.otherid = otherid;
    }

    public Other represent() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("otherid", otherid);
    	return client.wrap(OtherResource.class).represent();
    }

    public Other store(Other bean) throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("otherid", otherid);
    	return client.wrap(OtherResource.class).store(bean);
    }

    public void remove() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("otherid", otherid);
    	client.wrap(OtherResource.class).remove();
    }


}