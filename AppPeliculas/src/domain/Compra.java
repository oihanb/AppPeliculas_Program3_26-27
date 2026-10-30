package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

// una vez comprada la peli, se puede ver para siempre

public class Compra extends Transaccion{

	public Compra(int id, Usuario usuario, Pelicula pelicula, LocalDate fecha, double importe) {
		super(id, usuario, pelicula, fecha, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Compra";
	}

	@Override
	public boolean permiteVer(LocalDateTime momento) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}
