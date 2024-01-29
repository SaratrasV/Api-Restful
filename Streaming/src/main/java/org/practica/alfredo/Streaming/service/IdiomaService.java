package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Streaming;
import org.practica.alfredo.Streaming.model.Idioma;

public class IdiomaService {

	private Map<String, Idioma> idiomas = Streaming.getMisIdiomas();

	public IdiomaService() {
		Idioma miIdioma = new Idioma("Idioma - "+(idiomas.size()+1), "Español");
		idiomas.put("Idioma - "+(idiomas.size()+1), miIdioma);
	}

	public List<Idioma> getAllIdiomas() {
		return new ArrayList<Idioma>(idiomas.values());
	}

	public Idioma addIdioma(Idioma idioma) {
		idiomas.put(idioma.getIdiomaId(), idioma);
		return idioma;
	}

	public Idioma getIdioma(String key) {
		/*
		 * ErrorDataNotFound errorIdioma = new ErrorDataNotFound("Not found", 404,
		 * "there is not solution."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorIdioma) .build();
		 */
		return idiomas.get(key);
	}

	public Idioma updateIdioma(Idioma idioma) {
		if (idioma.getIdiomaId().isEmpty())
			return null;

		idiomas.put(idioma.getIdiomaId(), idioma);
		return idioma;
	}

	public Idioma removeIdioma(String key) {
		return idiomas.remove(key);
	}
}
