package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Genero;
import org.practica.alfredo.Streaming.service.GeneroService;

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

@Path("/generos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class GeneroResource {
	private GeneroService service = new GeneroService();

	@POST
	public Genero postGenero(Genero genero) {
		return service.addGenero(genero);
	}

	@GET
	public List<Genero> getGeneroes() {
		return service.getAllGeneros();
	}

	@GET
	@Path("/{generoId}")
	public Genero getGenero(@PathParam("generoId") String generoId, @Context UriInfo uriInfo) {
		return service.getGenero(generoId);
	}

	@PUT
	@Path("/{generoId}")
	public Genero putGenero(@PathParam("generoId") String generoId, Genero genero) {
		genero.setGeneroId(generoId);
		return service.updateGenero(genero);
	}

	@DELETE
	@Path("/{generoId}")
	public Genero deleteGenero(@PathParam("generoId") String generoId) {
		return service.removeGenero(generoId);
	}

}
