package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.Audiovisual;
import org.practica.alfredo.Streaming.service.AudioVisualService;

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

@Path("/audiovisuales")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AudioVisualResource {
	private AudioVisualService service = new AudioVisualService();

	@POST
	public Audiovisual postAudioVisual(Audiovisual audioVisual) {
		return service.addAudioVisual(audioVisual);
	}

	@GET
	public List<Audiovisual> getAudioVisuales() {
		return service.getAllAudioVisuales();
	}

	@GET
	@Path("/{audiovisualId}")
	public Audiovisual getAudioVisual(@PathParam("audiovisualId") String audiovisualId, @Context UriInfo uriInfo) {
		return service.getAudioVisual(audiovisualId);
	}

	@PUT
	@Path("/{audiovisualId}")
	public Audiovisual putAudioVisual(@PathParam("audiovisualId") String audiovisualId, Audiovisual audioVisual) {
		audioVisual.setAudiovisualId(audiovisualId);
		return service.updateAudioVisual(audioVisual);
	}

	@DELETE
	@Path("/{audiovisualId}")
	public Audiovisual deleteAudioVisual(@PathParam("audiovisualId") String audiovisualId) {
		return service.removeAudioVisual(audiovisualId);
	}
}
