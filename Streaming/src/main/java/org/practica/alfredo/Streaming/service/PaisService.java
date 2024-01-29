package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Pais;
import org.practica.alfredo.Streaming.model.Streaming;

public class PaisService {
	private Map<String, Pais> paises = Streaming.getMisPaises();

	public PaisService() {
		Pais miPais = new Pais("Pais - "+(paises.size()+1), "Rd", "Les gusta el romo y la pelota");
		paises.put("Pais - "+(paises.size()+1), miPais);
	}

	public List<Pais> getAllPaiss() {
		return new ArrayList<Pais>(paises.values());
	}

	public Pais addPais(Pais idioma) {
		paises.put(idioma.getPaisId(), idioma);
		return idioma;
	}

	public Pais getPais(String key) {
		/*
		 * ErrorDataNotFound errorPais = new ErrorDataNotFound("Not found", 404,
		 * "there is not solution."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorPais) .build();
		 */
		return paises.get(key);
	}

	public Pais updatePais(Pais idioma) {
		if (idioma.getPaisId().isEmpty())
			return null;

		paises.put(idioma.getPaisId(), idioma);
		return idioma;
	}

	public Pais removePais(String key) {
		return paises.remove(key);
	}
}
