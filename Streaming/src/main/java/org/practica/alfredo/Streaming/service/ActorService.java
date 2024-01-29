package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Actor;
import org.practica.alfredo.Streaming.model.Streaming;

public class ActorService {

	private Map<String, Actor> actores = Streaming.getMisActores();

	public ActorService() {
		Actor miActor = new Actor("110408", "Cristian", "De la hoz");
		actores.put("110408", miActor);
	}

	public List<Actor> getAllActores() {
		return new ArrayList<Actor>(actores.values());
	}

	public Actor addActor(Actor actor) {
		actor.setActorId(Long.toString(actores.size() + 1L));
		actores.put(actor.getActorId(), actor);
		return actor;
	}

	public Actor getActor(String key) {
		/*
		 * ErrorDataNotFound errorActor = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorActor) .build();
		 */
		return actores.get(key);
	}

	public Actor updateActor(Actor actor) {
		if (actor.getActorId().isEmpty())
			return null;

		actores.put(actor.getActorId(), actor);
		return actor;
	}

	public Actor removeActor(String key) {
		return actores.remove(key);
	}
}
