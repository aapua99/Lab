package ua.lviv.iot.andriy.rest.service;

import ua.lviv.iot.andriy.model.Fruit;
import ua.lviv.iot.andriy.model.Shop;
import ua.lviv.iot.andriy.persistence.dao.FruitDao;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Path("/server")
@SessionScoped
public class Server implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    private FruitDao dao;
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Fruit getFruit(@PathParam("id") Integer id) {
        return dao.findById(id);
    }

    @PUT
    public  Response createFruit(Fruit fruit) {
        dao.persist(fruit);
        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response deleteFruit(@PathParam("id") Integer id) {
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response updateFruit(Fruit fruit) {
        dao.persist(fruit);
        return Response.status(200).entity("Good").build();
    }

    @GET
    @Path("/size")
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_XML})
    public  String getSize() {
        return "Yes";
    }

}
