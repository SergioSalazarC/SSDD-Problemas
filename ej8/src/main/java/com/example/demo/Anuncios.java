
package com.example.demo;
import java.util.*;

import org.springframework.stereotype.Component;


@Component
public class Anuncios {
	private ArrayList<Anuncio> lista = new ArrayList<>();
	
	public Anuncios() {
	}
	
	public ArrayList<Anuncio> getLista(){
		return lista;
	}
	
	public void addAnuncio(Anuncio a) {
		lista.add(a);
	}
	
	public Anuncio getAnuncio(int i) {
		return lista.get(i);
	}
	
}
