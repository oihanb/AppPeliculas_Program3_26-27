package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

// se puede ver la peli durant un numero de dias FALTA TERMINARLA

public class Alquiler extends Transaccion{
	
    public static final int DIAS_MIN = 1;
    public static final int DIAS_MAX = 7;
    
    //private final int dias;

	public Alquiler(int id, Usuario usuario, Pelicula pelicula, LocalDate fecha, double importe) {
		super(id, usuario, pelicula, fecha, importe); 
		// TODO Auto-generated constructor stub
		//this.dias = dias;
	}

	@Override
	public String getTipo() {
		return "Alquiler";
	}

	@Override
	public boolean permiteVer(LocalDateTime momento) {
		// TODO Auto-generated method stub
		return false;
	}
	
	// + metodos

}
