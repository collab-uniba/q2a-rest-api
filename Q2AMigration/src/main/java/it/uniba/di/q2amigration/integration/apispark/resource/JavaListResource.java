package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Java;
import it.uniba.di.q2amigration.business.apispark.JavaList;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface JavaListResource {

    @Get
    public JavaList represent() throws Exception;
    @Post
    public Java add(Java bean) throws Exception;


}