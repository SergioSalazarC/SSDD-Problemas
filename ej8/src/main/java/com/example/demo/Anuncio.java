package com.example.demo;

public class Anuncio {
	private String nombre;
	private String asunto;
	private String comentario;
	
	public Anuncio() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setAsunto(String asunto) {
		this.asunto=asunto;
	}
	
	public void setComentario(String comentario) {
		this.comentario=comentario;
	}
	
}
