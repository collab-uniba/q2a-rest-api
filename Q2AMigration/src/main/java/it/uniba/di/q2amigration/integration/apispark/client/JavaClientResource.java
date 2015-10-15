package it.uniba.di.q2amigration.integration.apispark.client;

import it.uniba.di.q2amigration.business.apispark.Java;
import it.uniba.di.q2amigration.integration.apispark.AbstractClientResource;
import it.uniba.di.q2amigration.integration.apispark.resource.JavaResource;

import org.restlet.resource.ClientResource;

public class JavaClientResource extends AbstractClientResource {

    String javaid;
    	
    public JavaClientResource(String javaid) {
    	super("/javas/{javaid}");
        this.javaid = javaid;
    }

    public Java represent() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("javaid", javaid);
    	return client.wrap(JavaResource.class).represent();
    }

    public Java store(Java bean) throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("javaid", javaid);
    	return client.wrap(JavaResource.class).store(bean);
    }

    public void remove() throws Exception {
    	ClientResource client = getClientResource();
    	client.setAttribute("javaid", javaid);
    	client.wrap(JavaResource.class).remove();
    }


}