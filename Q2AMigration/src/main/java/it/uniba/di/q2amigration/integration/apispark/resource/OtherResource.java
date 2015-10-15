package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Other;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface OtherResource {

    @Get
    public Other represent() throws Exception;
    @Put
    public Other store(Other bean) throws Exception;
    @Delete
    public void remove() throws Exception;


}