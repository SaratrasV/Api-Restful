package org.practica.alfredo.Streaming.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	private String userId;
	private String name;
	private String lastName;
	private String userName;
	private String mail;
	private String password;
	private String idiomaId;
	private List<Link> misLinks = new ArrayList<Link>();
	
	public User() {
		
	}
	
	public User(String userId, String name, String lastName, String userName, String mail, String password,
			String idiomaId) {
		super();
		this.userId = userId;
		this.name = name;
		this.lastName = lastName;
		this.userName = userName;
		this.mail = mail;
		this.password = password;
		this.idiomaId = idiomaId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdiomaId() {
		return idiomaId;
	}
	public void setIdiomaId(String idiomaId) {
		this.idiomaId = idiomaId;
	}
	public List<Link> getMiLinks() {
		return misLinks;
	}
	public void setMiLinks(List<Link> misLinks) {
		this.misLinks = misLinks;
	}
	
	public void addLink(String link, String rel) {
		Link miLink = new Link(link, rel);
		misLinks.add(miLink);
	}
	
	
	
}
