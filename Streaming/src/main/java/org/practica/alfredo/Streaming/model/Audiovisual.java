package org.practica.alfredo.Streaming.model;

import java.time.LocalTime;

public class Audiovisual {
	
	private String audiovisualId;
	private String contenidoId;
	private String name;
	private LocalTime duracion;
	private int temporada;
	
	public Audiovisual() {
		
	}
	public Audiovisual(String audiovisualId, String contenidoId, String name, LocalTime duracion, int temporada) {
		super();
		this.audiovisualId = audiovisualId;
		this.contenidoId = contenidoId;
		this.name = name;
		this.duracion = duracion;
		this.temporada = temporada;
	}
	public String getAudiovisualId() {
		return audiovisualId;
	}
	public void setAudiovisualId(String audiovisualId) {
		this.audiovisualId = audiovisualId;
	}
	public String getContenidoId() {
		return contenidoId;
	}
	public void setContenidoId(String contenidoId) {
		this.contenidoId = contenidoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalTime getDuracion() {
		return duracion;
	}
	public void setDuracion(LocalTime duracion) {
		this.duracion = duracion;
	}
	public int getTemporada() {
		return temporada;
	}
	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}
	
	

}
