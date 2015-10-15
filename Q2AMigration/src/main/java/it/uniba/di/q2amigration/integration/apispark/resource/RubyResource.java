package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.Ruby;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface RubyResource {

    @Get
    public Ruby represent() throws Exception;
    @Put
    public Ruby store(Ruby bean) throws Exception;
    @Delete
    public void remove() throws Exception;


}