package org.practica.alfredo.Streaming.model;

public class Idioma {

	private String idiomaId;
	private String name;
	
	public Idioma() {
		
	}
	public Idioma(String idiomaId, String name) {
		super();
		this.idiomaId = idiomaId;
		this.name = name;
	}
	public String getIdiomaId() {
		return idiomaId;
	}
	public void setIdiomaId(String idiomaId) {
		this.idiomaId = idiomaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
