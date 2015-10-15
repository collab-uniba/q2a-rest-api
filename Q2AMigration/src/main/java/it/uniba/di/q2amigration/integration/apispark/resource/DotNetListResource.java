package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.DotNet;
import it.uniba.di.q2amigration.business.apispark.DotNetList;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface DotNetListResource {

    @Get
    public DotNetList represent() throws Exception;
    @Post
    public DotNet add(DotNet bean) throws Exception;


}