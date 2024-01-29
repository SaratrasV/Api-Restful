package org.practica.alfredo.Streaming.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Audiovisual;
import org.practica.alfredo.Streaming.model.Streaming;

public class AudioVisualService {
	private Map<String, Audiovisual> audiovisuales = Streaming.getMisAudioVisuales();

	public AudioVisualService() {
		Audiovisual miAudioVisual = new Audiovisual("AudioVisual - "+(audiovisuales.size()+1), "Contenido - 1", "La muerte de goku", LocalTime.of(1, 30) , 1);
		audiovisuales.put("AudioVisual - "+(audiovisuales.size()+1), miAudioVisual);
		
	}

	public List<Audiovisual> getAllAudioVisuales() {
		return new ArrayList<Audiovisual>(audiovisuales.values());
	}

	public Audiovisual addAudioVisual(Audiovisual audioVisual) {
		audioVisual.setAudiovisualId(Long.toString(audiovisuales.size() + 1L));
		audiovisuales.put(audioVisual.getAudiovisualId(), audioVisual);
		return audioVisual;
	}

	public Audiovisual getAudioVisual(String key) {
		/*
		 * ErrorDataNotFound errorAudioVisual = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorAudioVisual) .build();
		 */
		return audiovisuales.get(key);
	}

	public Audiovisual updateAudioVisual(Audiovisual audioVisual) {
		if (audioVisual.getAudiovisualId().isEmpty())
			return null;

		audiovisuales.put(audioVisual.getAudiovisualId(), audioVisual);
		return audioVisual;
	}

	public Audiovisual removeAudioVisual(String key) {
		return audiovisuales.remove(key);
	}
}
