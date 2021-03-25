package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anuncio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	
	private String nombre;
	private String asunto;
	private String comentario;
	
	public Anuncio() {
		
	}
	
	public Anuncio(String string, String string2, String string3) {
		nombre=string;
		asunto=string2;
		comentario=string3;
	}

	public String getNombre() {
		return nombre;
	}
	
	public Long getId() {
		return id;
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
