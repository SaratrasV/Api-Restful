package org.practica.alfredo.Streaming.resource;

import java.util.List;

import org.practica.alfredo.Streaming.model.User;
import org.practica.alfredo.Streaming.service.UserService;

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

@Path("/usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	private UserService service = new UserService();

	@POST
	public User postUser(User user) {
		return service.addUser(user);
	}

	@GET
	public List<User> getUseres() {
		return service.getAllUsers();
	}

	@GET
	@Path("/{userId}")
	public User getUser(@PathParam("userId") String userId, @Context UriInfo uriInfo) {
		return service.getUser(userId);
	}
	
	@Path("/{userId}/historial")
	public HistorialResource getHistorial() {
		return new HistorialResource();
	}

	@PUT
	@Path("/{userId}")
	public User putUser(@PathParam("userId") String userId, User user) {
		user.setUserId(userId);
		return service.updateUser(user);
	}

	@DELETE
	@Path("/{userId}")
	public User deleteUser(@PathParam("userId") String userId) {
		return service.removeUser(userId);
	}
}
