package domain;

import java.time.LocalDate;

public class EntradaLista {
	
	// rel Usuario-Pelicula dentro de una lista (de las 3 que tenemos)
	
	private Usuario usuario;
	private Pelicula pelicula;
	private TipoLista tipo;
	private LocalDate fechaAnadida;
	private int prioridad; // este attr es solo relevante para la lista de pelis pendientes (1 seria prio alta)
	
	public EntradaLista(Usuario usuario, Pelicula pelicula, 
			TipoLista tipo, LocalDate fechaAnadida, int prioridad) {
		super();
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.tipo = tipo;
		this.fechaAnadida = fechaAnadida;
		this.prioridad = 2;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public TipoLista getTipo() {
		return tipo;
	}
	public LocalDate getFechaAnadida() {
		return fechaAnadida;
	}
	public int getPrioridad() {
		return prioridad;
	}
	
	public void setPrioridad(int prioridad) {
		if(prioridad < 1 || prioridad > 3) {
			throw new IllegalArgumentException("la prio de pelis pendientes va de 1 a 3 (alta a baja)");
		}
		this.prioridad = prioridad;
	}
	
	
}
