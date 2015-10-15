package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Java;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface JavaResource {

    @Get
    public Java represent() throws Exception;
    @Put
    public Java store(Java bean) throws Exception;
    @Delete
    public void remove() throws Exception;


}