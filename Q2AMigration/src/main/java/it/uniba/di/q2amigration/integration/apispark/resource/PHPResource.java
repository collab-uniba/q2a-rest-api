package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.PHP;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface PHPResource {

    @Get
    public PHP represent() throws Exception;
    @Put
    public PHP store(PHP bean) throws Exception;
    @Delete
    public void remove() throws Exception;


}