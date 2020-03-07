package com.ark.hello;

import com.ark.MyModel;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class HelloBoundary {

    private HelloRepository helloRepository;

    public HelloBoundary() {
    }

    @Inject
    public HelloBoundary(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @GET
    public List<String> getLists() {
        return helloRepository.getAllStrings();

    }

    @POST
    public Response addString(String string) {
        MyModel added = helloRepository.add(string);
        return Response.ok(added).build();
    }
}
