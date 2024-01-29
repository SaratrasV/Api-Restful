package org.practica.alfredo.Streaming.model;

import java.util.Date;

public class Contenido {
	
	private String contenidoId;
	private String titulo;
	private String tipo;
	private String sipnosis;
	private boolean disponible;
	private Date fecha;
	private String clasificacion;
	private int rating;
	private String paisId;
	private int reproducciones;
	
	public Contenido() {
		
	}
	
	public Contenido(String contenidoId, String titulo, String tipo, String sipnosis, boolean disponible, Date fecha,
			String clasificacion, int rating, String paisId, int reproducciones) {
		super();
		this.contenidoId = contenidoId;
		this.titulo = titulo;
		this.tipo = tipo;
		this.sipnosis = sipnosis;
		this.disponible = disponible;
		this.fecha = fecha;
		this.clasificacion = clasificacion;
		this.rating = rating;
		this.paisId = paisId;
		this.reproducciones = reproducciones; 
	}
	public String getContenidoId() {
		return contenidoId;
	}
	public void setContenidoId(String contenidoId) {
		this.contenidoId = contenidoId;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getSipnosis() {
		return sipnosis;
	}
	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getPaisId() {
		return paisId;
	}
	public void setPaisId(String paisId) {
		this.paisId = paisId;
	}

	public int getReproducciones() {
		return reproducciones;
	}
	
	public void increaseReating() {
		reproducciones++;
	}


	
	
	

}
