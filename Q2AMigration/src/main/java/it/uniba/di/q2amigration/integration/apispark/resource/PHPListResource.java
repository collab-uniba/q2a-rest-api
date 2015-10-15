package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.PHP;
import it.uniba.di.q2amigration.business.apispark.PHPList;

import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface PHPListResource {

    @Get
    public PHPList represent() throws Exception;
    @Post
    public PHP add(PHP bean) throws Exception;


}