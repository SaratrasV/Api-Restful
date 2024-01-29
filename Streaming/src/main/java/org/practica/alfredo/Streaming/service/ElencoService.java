package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Elenco;
import org.practica.alfredo.Streaming.model.Streaming;

public class ElencoService {
	private Map<String, Elenco> elencos = Streaming.getMisElencos();

	public ElencoService() {
		Elenco miElenco = new Elenco("Autor - 1", "Contenido - 1", true);
		elencos.put(miElenco.getContenidoId(), miElenco);
	}

	public List<Elenco> getAllElencos() {
		return new ArrayList<Elenco>(elencos.values());
	}

	public Elenco addElenco(Elenco elenco) {
		elencos.put(elenco.getContenidoId(), elenco);
		return elenco;
	}

	public Elenco getElenco(String key) {
		/*
		 * ErrorDataNotFound errorElenco = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorElenco) .build();
		 */
		return elencos.get(key);
	}

	public Elenco updateElenco(Elenco elenco) {
		if (elenco.getContenidoId().isEmpty() )
			return null;

		elencos.put(elenco.getContenidoId(), elenco);
		return elenco;
	}

	public Elenco removeElenco(String key) {
		return elencos.remove(key);
	}

}
