package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Pais;
import org.practica.alfredo.Streaming.service.PaisService;

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

@Path("/paises")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaisResource {

	private PaisService service = new PaisService();

	@POST
	public Pais postPais(Pais pais) {
		return service.addPais(pais);
	}

	@GET
	public List<Pais> getPaises() {
		return service.getAllPaiss();
	}

	@GET
	@Path("/{paisId}")
	public Pais getPais(@PathParam("paisId") String paisId, @Context UriInfo uriInfo) {
		return service.getPais(paisId);
	}

	@PUT
	@Path("/{paisId}")
	public Pais putPais(@PathParam("paisId") String paisId, Pais pais) {
		pais.setPaisId(paisId);
		return service.updatePais(pais);
	}

	@DELETE
	@Path("/{paisId}")
	public Pais deletePais(@PathParam("paisId") String paisId) {
		return service.removePais(paisId);
	}
}
