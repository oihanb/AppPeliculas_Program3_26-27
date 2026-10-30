package domain;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Pelicula {
	
	private int id;
	private String titulo;
	private String director;
	private int anyo;
	private int duracionMin;
	private Genero genero;
	private String sinopsis;
	private double precioCompra;
	private double precioAlquiler;
	private final ArrayList<Valoracion> valoraciones = new ArrayList<>();
	
	
	public Pelicula(int id, String titulo, String director, int anyo, int duracionMin, 
			Genero genero, String sinopsis, double precioCompra, double precioAlquiler) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.anyo = anyo;
		this.duracionMin = duracionMin;
		this.genero = genero; // poner luego que el genero no puede ser null porq es obligatorio
		this.sinopsis = sinopsis;
		this.precioCompra = precioCompra;
		this.precioAlquiler = precioAlquiler;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("el titulo no puede estar vacio");
        }
        this.titulo = titulo.trim();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getDuracionMin() {
		return duracionMin;
	}

	public void setDuracionMin(int duracionMin) {
        if (duracionMin <= 0) {
            throw new IllegalArgumentException("duracion no puede ser negativa");
        }
		this.duracionMin = duracionMin;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}
	
	public void addValoracion(Valoracion v) {
		valoraciones.add(v);
	}

	public ArrayList<Valoracion> getValoraciones() {
		return valoraciones;
	}
	
	// METODOS
	
    public String getDuracionTexto() {
        return (duracionMin/60) + " h "+ (duracionMin%60) + " min";
    }
	
    @Override
    public String toString() {
    	return titulo + " (" + anyo + ")";
    }
	
}
