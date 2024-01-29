package org.practica.alfredo.Streaming.model;

public class Actor {

	private String actorId;
	private String name;
	private String lastName;
	
	public Actor() {
		
	}
	public Actor(String actorId, String name, String lastName) {
		super();
		this.actorId = actorId;
		this.name = name;
		this.lastName = lastName;
	}
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
