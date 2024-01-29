package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.User;
import org.practica.alfredo.Streaming.model.Streaming;

public class UserService {

	private Map<String, User> users = Streaming.getMisUsers();

	public UserService() {
		User miUser = new User("User - 1", "Wayling", "Lopez", "Alexandrita",
				"Alexandrita@gmail.com", "WaylingM08.pls", "Idioma - 1");
		users.put("User - 1", miUser);
	}

	public List<User> getAllUsers() {
		return new ArrayList<User>(users.values());
	}

	public User addUser(User user) {
		user.setUserId("User - "+(users.size()+1));
		users.put("User - "+(users.size()+1), user);
		return user;
	}

	public User getUser(String key) {
		/*
		 * ErrorDataNotFound errorUser = new ErrorDataNotFound("Not found", 404,
		 * "there is not solution."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorUser) .build();
		 */
		return users.get(key);
	}

	public User updateUser(User user) {
		if (user.getUserId().isEmpty())
			return null;

		users.put(user.getUserId(), user);
		return user;
	}

	public User removeUser(String key) {
		return users.remove(key);
	}
}
