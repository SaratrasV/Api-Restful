package org.practica.alfredo.Streaming.resource;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.practica.alfredo.Streaming.model.Contenido;
import org.practica.alfredo.Streaming.service.ContenidoService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.UriInfo;

@Path("/contenidos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContenidoResource {

	private ContenidoService service = new ContenidoService();

	@POST
	public Contenido postContenido(Contenido contenido) {
		return service.addContenido(contenido);
	}

	@GET
	public List<Contenido> getContenidoes(@QueryParam("tipo") String tipo, @QueryParam("fechaInicio") String fechaInicio, @QueryParam("fechaFinal") String fechaFinal) {
		if (tipo == null) {
			return service.getAllContenidos();

		}
		return service.getTopContenidos(tipo,Date.from(Instant.parse(fechaInicio)),Date.from(Instant.parse(fechaFinal)));
	}

	@GET
	@Path("/{contenidoId}")
	public Contenido getContenido(@PathParam("contenidoId") String contenidoId, @Context UriInfo uriInfo) {
		return service.getContenido(contenidoId);
	}

	@PUT
	@Path("/{contenidoId}")
	public Contenido putContenido(@PathParam("contenidoId") String contenidoId, Contenido Contenido) {
		Contenido.setContenidoId(contenidoId);
		return service.updateContenido(Contenido);
	}

	@DELETE
	@Path("/{contenidoId}")
	public Contenido deleteContenido(@PathParam("contenidoId") String contenidoId) {
		return service.removeContenido(contenidoId);
	}
}
