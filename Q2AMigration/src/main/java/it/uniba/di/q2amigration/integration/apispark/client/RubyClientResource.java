package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Ruby;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.RubyResource;

import org.restlet.resource.ClientResource;

public class RubyClientResource extends AbstractClientResource {

    String rubyid;
    	
    public RubyClientResource(String rubyid) {
    	super("/rubies/{rubyid}");
        this.rubyid = rubyid;
    }

    public Ruby represent() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("rubyid", rubyid);
    	return client.wrap(RubyResource.class).represent();
    }

    public Ruby store(Ruby bean) throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("rubyid", rubyid);
    	return client.wrap(RubyResource.class).store(bean);
    }

    public void remove() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("rubyid", rubyid);
    	client.wrap(RubyResource.class).remove();
    }


}