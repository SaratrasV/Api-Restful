package org.practica.alfredo.Streaming.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Historial;
import org.practica.alfredo.Streaming.model.Streaming;

public class HistorialService {
	private Map<String, Historial> historiales = Streaming.getMisHistoriales();

	public HistorialService() {
		Historial miHistorial = new Historial("User - 1", "AudioVisual - 1", LocalTime.of(1, 20));
		historiales.put("User - 1", miHistorial);
	}

	public List<Historial> getAllHistorials(String key) {
		ArrayList<Historial> misHistoriales = new ArrayList<Historial>();
		for (Historial aux : historiales.values()) {
			if (aux.getUserId().equals(key)) {
				misHistoriales.add(aux);
			}
		}
		return misHistoriales;
	}

	public Historial addHistorial(Historial historial) {
		historiales.put(historial.getUserId(), historial);
		return historial;
	}

	public List<Historial> getHistorialByType(String userId, String tipo) {
		/*
		 * ErrorDataNotFound errorHistorial = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorHistorial) .build();
		 */
		

		ArrayList<Historial> misHistoriales = new ArrayList<Historial>();
		for (Historial aux : historiales.values()) {
			if (aux.getUserId().equalsIgnoreCase(userId) && Streaming
					.buscarContenidoByAudioVisualCode(aux.getAudiovisualId())
					.getTipo().equalsIgnoreCase(tipo)) {
				
				misHistoriales.add(aux);
			}
		}
		
		
		return misHistoriales;
	}

	public Historial updateHistorial(Historial historial) {
		if (historial.getUserId().isEmpty())
			return null;

		historiales.put(historial.getUserId(), historial);
		return historial;
	}

	public Historial removeHistorial(String key) {
		return historiales.remove(key);
	}

}
