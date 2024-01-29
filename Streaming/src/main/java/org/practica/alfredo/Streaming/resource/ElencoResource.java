package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Elenco;
import org.practica.alfredo.Streaming.service.ElencoService;

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

@Path("/elencos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ElencoResource {

	private ElencoService service = new ElencoService();

	@POST
	public Elenco postElenco(Elenco Elenco) {
		return service.addElenco(Elenco);
	}

	@GET
	public List<Elenco> getElencoes() {
		return service.getAllElencos();
	}

	@GET
	@Path("/{contenidoId}")
	public Elenco getElenco(@PathParam("contenidoId") String contenidoId, @Context UriInfo uriInfo) {
		return service.getElenco(contenidoId);
	}

	@PUT
	@Path("/{contenidoId}")
	public Elenco putElenco(@PathParam("contenidoId") String contenidoId, Elenco elenco) {
		elenco.setContenidoId(contenidoId);
		return service.updateElenco(elenco);
	}

	@DELETE
	@Path("/{contenidoId}")
	public Elenco deleteElenco(@PathParam("contenidoId") String contenidoId) {
		return service.removeElenco(contenidoId);
	}
}
