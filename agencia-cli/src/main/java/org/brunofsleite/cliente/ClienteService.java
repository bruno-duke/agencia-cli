package org.brunofsleite.cliente;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.temporal.ChronoUnit;

@RegisterRestClient(baseUri = "http://localhost:8080/cliente")
public interface ClienteService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String newCliente(Cliente cliente);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findById")
    public Cliente findById(@QueryParam("id") long id);
}
