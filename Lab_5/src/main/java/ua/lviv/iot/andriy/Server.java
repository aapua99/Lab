package ua.lviv.iot.andriy;

import javax.annotation.PostConstruct;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/server")
public class Server {

    public static Shop shop = new Shop();

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public final Fruit getFruit(@PathParam("id") Integer id) {
        return shop.getFruitList().get(id);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response createFruit(@PathParam("id") Integer id,
                                        Fruit fruit) {
        shop.addFruit(fruit);
        return Response.status(200).entity("Good").build();
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response deleteFruit(@PathParam("id") Integer id) {
        shop.getFruitList().remove(id);
        return Response.status(200).entity("Good").build();
    }

    @POST
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public final Response updateFruit(@PathParam("id") Integer id,
                                        Fruit fruit) {
        shop.getFruitList().put(fruit.getId(),fruit);
        return Response.status(200).entity("Good").build();
    }

    @GET
    @Path("/size")
    @Produces(MediaType.APPLICATION_JSON)
    public final Integer getSize() {
        return shop.getFruitList().size();
    }

}
