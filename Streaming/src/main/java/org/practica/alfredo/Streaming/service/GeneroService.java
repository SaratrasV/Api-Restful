package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Genero;
import org.practica.alfredo.Streaming.model.Streaming;

public class GeneroService {
	private Map<String, Genero> generos = Streaming.getMisGeneros();

	public GeneroService() {
		Genero miGenero = new Genero("Genero - "+(generos.size()+1), "Comedia", "Hacer reir a los demas", 5);
		generos.put("Genero - "+(generos.size()+1), miGenero);
	}

	public List<Genero> getAllGeneros() {
		return new ArrayList<Genero>(generos.values());
	}

	public Genero addGenero(Genero genero) {
		generos.put(genero.getGeneroId(), genero);
		return genero;
	}

	public Genero getGenero(String key) {
		/*
		 * ErrorDataNotFound errorGenero = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorGenero) .build();
		 */
		return generos.get(key);
	}

	public Genero updateGenero(Genero genero) {
		if (genero.getGeneroId().isEmpty() )
			return null;

		generos.put(genero.getGeneroId(), genero);
		return genero;
	}

	public Genero removeGenero(String key) {
		return generos.remove(key);
	}

}
