package com.seanti.eti.modelo;

public class Publicacion {
	private String titulo;
	private String autor;
	private String tipo;
	
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Publicacion() {
		super();
	}
	public Publicacion(String titulo, String autor, String tipo) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tipo = tipo;
	}
	
	public String Titulo(){
		return titulo;
	}
	
	public String Autor() {
		return autor;
	}
	
	
	public String MostrarTipo() {
		return(this.tipo.equals("R") ? "Revista" : "Libro");
		
	}
	

}


