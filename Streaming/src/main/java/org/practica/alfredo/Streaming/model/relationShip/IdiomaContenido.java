package org.practica.alfredo.Streaming.model.relationShip;

public class IdiomaContenido {

	private String idiomaId;
	private String contendidoId;
	
	public IdiomaContenido() {
		
	}
	public IdiomaContenido(String idiomaId, String contendidoId) {
		super();
		this.idiomaId = idiomaId;
		this.contendidoId = contendidoId;
	}
	public String getIdiomaId() {
		return idiomaId;
	}
	public void setIdiomaId(String idiomaId) {
		this.idiomaId = idiomaId;
	}
	public String getContendidoId() {
		return contendidoId;
	}
	public void setContendidoId(String contendidoId) {
		this.contendidoId = contendidoId;
	}
	
	
}
