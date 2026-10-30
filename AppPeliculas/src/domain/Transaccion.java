package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public abstract class Transaccion implements Comparable<Transaccion>{
	
	private int id;
	private Usuario usuario;
	private Pelicula pelicula;
	private LocalDate fecha;
	private double importe;
	
	
	public Transaccion(int id, Usuario usuario, Pelicula pelicula, LocalDate fecha, double importe) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.pelicula = pelicula;
		this.fecha = fecha;
		this.importe = importe;
	}
	
	// compra o alquiler
	public abstract String getTipo();
	
	// se puede ver la peli en ese momento?
	public abstract boolean permiteVer(LocalDateTime momento);

	public int getId() {
		return id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getImporte() {
		return importe;
	}

	// lo normal: mas recientes primero
	@Override
	public int compareTo(Transaccion o) {
		// TODO Auto-generated method stub
		return o.fecha.compareTo(fecha);
	}
	
	
}
