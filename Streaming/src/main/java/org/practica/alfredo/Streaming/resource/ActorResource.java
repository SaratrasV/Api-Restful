package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Actor;
import org.practica.alfredo.Streaming.service.ActorService;


import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/actores")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ActorResource {
	private ActorService service = new ActorService();
	
	@POST
	public Actor postActor(Actor Actor) {
		return service.addActor(Actor);
	}
	
	@GET
	public List<Actor> getActores() {
		return service.getAllActores();
	}


	@GET
	@Path("/{actorId}")
	public Actor getActor(@PathParam("actorId") String actorId, @Context UriInfo uriInfo) {
		return service.getActor(actorId);
	}
	
	@PUT
	@Path("/{actorId}")
	public Actor putActor(@PathParam("actorId") String actorId, Actor actor) {
		actor.setActorId(actorId);
		return service.updateActor(actor);
	}

	@DELETE
	@Path("/{actorId}")
	public Actor deleteActor(@PathParam("actorId") String actorId) {
		return service.removeActor(actorId);
	}
}
