package org.practica.alfredo.Streaming.model;

public class Genero {

	private String generoId;
	private String name;
	private String description;
	private int edadMinima;
	
	public Genero() {
		
	}
	
	public Genero(String generoId, String name, String description, int edadMinima) {
		super();
		this.generoId = generoId;
		this.name = name;
		this.description = description;
		this.edadMinima = edadMinima;
	}
	public String getGeneroId() {
		return generoId;
	}
	public void setGeneroId(String generoId) {
		this.generoId = generoId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	
	 
}
