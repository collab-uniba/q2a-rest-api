package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Other;
import it.uniba.di.q2amigration.business.apispark.OtherList;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface OtherListResource {

    @Get
    public OtherList represent() throws Exception;
    @Post
    public Other add(Other bean) throws Exception;


}