package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Idioma;
import org.practica.alfredo.Streaming.service.IdiomaService;

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

@Path("/idiomas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class IdiomaResource {
	private IdiomaService service = new IdiomaService();

	@POST
	public Idioma postIdioma(Idioma idioma) {
		return service.addIdioma(idioma);
	}

	@GET
	public List<Idioma> getIdiomaes() {
		return service.getAllIdiomas();
	}

	@GET
	@Path("/{idiomaId}")
	public Idioma getIdioma(@PathParam("idiomaId") String idiomaId, @Context UriInfo uriInfo) {
		return service.getIdioma(idiomaId);
	}

	@PUT
	@Path("/{idiomaId}")
	public Idioma putIdioma(@PathParam("idiomaId") String idiomaId, Idioma idioma) {
		idioma.setIdiomaId(idiomaId);
		return service.updateIdioma(idioma);
	}

	@DELETE
	@Path("/{idiomaId}")
	public Idioma deleteIdioma(@PathParam("idiomaId") String idiomaId) {
		return service.removeIdioma(idiomaId);
	}
}
