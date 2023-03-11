package com.keshav;

import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/tvseries")
public class TvSeriesResource {

    @RestClient
    TvSeriesIdProxy proxy;

    @GET
    @Path("/{id}")
    public Response getTvSeriesById(@PathParam("id") int id){
        return Response.ok(proxy.getTvSeriesById(id)).build();
    }

    @GET
    @Path("/person/{personname}")
    public JsonArray getTvSeriesById(@PathParam("personname") String personName){
        return proxy.getTvSeriesByPersonNane(personName);
    }
}
