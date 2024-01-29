package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Historial;
import org.practica.alfredo.Streaming.service.HistorialService;

import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/")
public class HistorialResource {
	private HistorialService service = new HistorialService();

	@POST
	public Historial postHistorial(Historial historial) {
		return service.addHistorial(historial);
	}

	@GET
	public List<Historial> getAllHistoriales(@PathParam("userId") String userId, @QueryParam("tipo") String tipo) {
		if (tipo == null) {
			return service.getAllHistorials(userId);
		}
		return service.getHistorialByType(userId, tipo);
	}

	@PUT
	public Historial putHistorial(@PathParam("userId") String userId, Historial historial) {
		historial.setUserId(userId);
		return service.updateHistorial(historial);
	}

	@DELETE
	public Historial deleteHistorial(@PathParam("userId") String userId) {
		return service.removeHistorial(userId);
	}
}
