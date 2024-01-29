package org.practica.alfredo.Streaming.model;

import java.util.HashMap;
import java.util.Map;

public class Streaming {
	private static Map<String, Actor> misActores = new HashMap<>();
	private static Map<String, Audiovisual> misAudioVisuales = new HashMap<>();
	private static Map<String, Contenido> miContenido = new HashMap<>();
	private static Map<String, Elenco> misElencos = new HashMap<>();
	private static Map<String, Genero> misGeneros = new HashMap<>();
	private static Map<String, Historial> misHistoriales = new HashMap<>();
	private static Map<String, User> misUsers = new HashMap<>();
	private static Map<String, Idioma> misIdiomas = new HashMap<>();
	private static Map<String, Pais> misPaises = new HashMap<>();

	public static Map<String, Actor> getMisActores() {
		return misActores;
	}

	public static Map<String, Audiovisual> getMisAudioVisuales() {
		return misAudioVisuales;
	}

	public static Map<String, Contenido> getMiContenido() {
		// TODO Auto-generated method stub
		return miContenido;
	}

	public static Map<String, Elenco> getMisElencos() {
		// TODO Auto-generated method stub
		return misElencos;
	}

	public static Map<String, Genero> getMisGeneros() {
		// TODO Auto-generated method stub
		return misGeneros;
	}

	public static Map<String, Historial> getMisHistoriales() {
		// TODO Auto-generated method stub
		return misHistoriales;
	}

	public static Map<String, User> getMisUsers() {
		return misUsers;
	}

	public static Map<String, Idioma> getMisIdiomas() {
		// TODO Auto-generated method stub
		return misIdiomas;
	}

	public static Map<String, Pais> getMisPaises() {
		return misPaises;
	}
	
	public static Contenido buscarContenidoByAudioVisualCode(String audioVisualId) {
		Contenido aux = null;
		for (Contenido contenido : miContenido.values()) {
			if (contenido.getContenidoId().equalsIgnoreCase(misAudioVisuales.get(audioVisualId).getContenidoId())) {
				aux = contenido;
			}
		}
		
		return aux;
	}


}
