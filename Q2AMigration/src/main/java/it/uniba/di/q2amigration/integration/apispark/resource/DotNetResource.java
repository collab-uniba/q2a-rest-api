package it.uniba.di.q2amigration.integration.apispark.resource;

import it.uniba.di.q2amigration.business.apispark.DotNet;

import org.restlet.resource.Get;
import org.restlet.resource.Put;
import org.restlet.resource.Delete;

public interface DotNetResource {

    @Get
    public DotNet represent() throws Exception;
    @Put
    public DotNet store(DotNet bean) throws Exception;
    @Delete
    public void remove() throws Exception;


}