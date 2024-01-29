package org.practica.alfredo.Streaming.model;

import java.time.LocalTime;

public class Historial {
	private String userId;
	private String audioVisualId;
	private LocalTime tiempoVisto;
	
	public Historial() {
		
	}
	public Historial(String userId, String audioVisualId, LocalTime tiempoVisto) {
		super();
		this.userId = userId;
		this.audioVisualId = audioVisualId;
		this.tiempoVisto = tiempoVisto;
		Contenido contenido = Streaming.buscarContenidoByAudioVisualCode(audioVisualId);
		if (contenido != null) {
			contenido.increaseReating();
		}
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public LocalTime getTiempoVisto() {
		return tiempoVisto;
	}
	public void setTiempoVisto(LocalTime tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}
	public String getAudiovisualId() {
		return audioVisualId;
	}
	public void setAudiovisualId(String audiovisualId) {
		this.audioVisualId = audiovisualId;
	}
	
	

}
