package org.practica.alfredo.Streaming.model.relationShip;

public class PaisIdioma {

	private String paisId;
	private String idiomaId;
	
	public PaisIdioma() {
		
	}

	public PaisIdioma(String paisId, String idiomaId) {
		super();
		this.paisId = paisId;
		this.idiomaId = idiomaId;
	}

	public String getPaisId() {
		return paisId;
	}

	public void setPaisId(String paisId) {
		this.paisId = paisId;
	}

	public String getIdiomaId() {
		return idiomaId;
	}

	public void setIdiomaId(String idiomaId) {
		this.idiomaId = idiomaId;
	}
	
	
}
