package domain;

import java.time.LocalDate;

public class Valoracion {
	
	private int nota;
	private String comentario;
	private LocalDate fecha;
	Usuario usuario;
	Pelicula pelicula;
	
	
	public Valoracion(int nota, String comentario, LocalDate fecha, 
			Usuario usuario, Pelicula pelicula) {
		if(nota < 1 || nota > 5) {
			throw new IllegalArgumentException("la nota tiene que estar entre 1 y 5 (estrellas)");
		}
		this.nota = nota;
		this.comentario = comentario;
		this.fecha = fecha;
		this.usuario = usuario;
		this.pelicula = pelicula;
	}

	public int getNota() {
		return nota;
	}
	public String getComentario() {
		return comentario;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	
	
	
}
