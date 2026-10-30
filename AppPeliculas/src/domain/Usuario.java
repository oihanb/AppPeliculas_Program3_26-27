package domain;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
	
	private int id;
	private String username;
	private String contrasena;
	private String email;
	private Rol rol;
	private double saldo;
	private LocalDate fechaAlta;
	
	
	public Usuario(int id, String username, String contrasena, String email, Rol rol, double saldo,
			LocalDate fechaAlta) {
		if(username == null || username.isBlank()) {
			throw new IllegalArgumentException("el nombre de usuario es obligatorio");
		}
		if(contrasena == null || contrasena.length() < 4) {
			throw new IllegalArgumentException("la contraseña debe tener al menos 4 caracteres");
		}
		
		this.id = id;
		this.username = username.trim();
		this.contrasena = contrasena;
		this.email = email;
		this.rol = rol; // rev
		this.saldo = saldo;
		this.fechaAlta = fechaAlta;
	}


	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getEmail() {
		return email;
	}

	public Rol getRol() {
		return rol;
	}

	public double getSaldo() {
		return saldo;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}



	// METODOS
	
	// comprobar contraseña
	// si es admin
	// pagar
	// recargar
	
	
	
	
}
