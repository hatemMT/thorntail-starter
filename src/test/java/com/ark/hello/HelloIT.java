package com.ark.hello;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.valid4j.matchers.http.HttpResponseMatchers.hasStatus;

public class HelloIT {
    private static final String HOST_PATH = "http://localhost:8080";
    private static final String SERVICE_PATH = "hello";

    private static WebTarget target;

    @BeforeClass
    public static void init() {
        Client client = ClientBuilder.newClient();
        client.register(JacksonJsonProvider.class);
        target = client.target(HOST_PATH)
                       .path(SERVICE_PATH);
    }

    @Test
    public void whenQueryingAll_thenGetOkResponse() {
        Response response = target.request().get();

        assertThat(response, hasStatus(OK));
    }


    @Test
    public void whenAddingNewModel_thenGetOkWithAddedModelResponse() {
        //Given
        String model = "Some data ...";
        //When
        Response response = target.request().post(Entity.json(model));
        //Then
        assertThat(response, hasStatus(OK));
        MyModel myModel = response.readEntity(MyModel.class);
        assertThat(myModel.getData(), is(model));
    }
}
