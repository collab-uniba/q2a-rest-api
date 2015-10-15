package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Ruby;
import it.uniba.di.q2amigration.business.apispark.RubyList;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface RubyListResource {

    @Get
    public RubyList represent() throws Exception;
    @Post
    public Ruby add(Ruby bean) throws Exception;


}