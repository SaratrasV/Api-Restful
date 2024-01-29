package org.practica.alfredo.Streaming.model;

public class Pais {

	private String paisId;
	private String name;
	private String description;
	
	public Pais() {
		
	}
	public Pais(String paisId, String name, String description) {
		super();
		this.paisId = paisId;
		this.name = name;
		this.description = description;
	}
	public String getPaisId() {
		return paisId;
	}
	public void setPaisId(String paisId) {
		this.paisId = paisId;
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
	
	
}
