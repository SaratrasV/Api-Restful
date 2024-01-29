package org.practica.alfredo.Streaming.model;

public class Elenco {

	private String autorId;
	private String contenidoId;
	private boolean isPrincipal;
	
	public Elenco() {
		
	}
	public Elenco(String autorId, String contenidoId, Boolean isPrincipal) {
		super();
		this.autorId = autorId;
		this.contenidoId = contenidoId;
		this.setPrincipal(isPrincipal);
	}
	public String getAutorId() {
		return autorId;
	}
	public void setAutorId(String autorId) {
		this.autorId = autorId;
	}
	public String getContenidoId() {
		return contenidoId;
	}
	public void setContenidoId(String contenidoId) {
		this.contenidoId = contenidoId;
	}
	public boolean isPrincipal() {
		return isPrincipal;
	}
	public void setPrincipal(boolean isPrincipal) {
		this.isPrincipal = isPrincipal;
	}
	
	
	
}
