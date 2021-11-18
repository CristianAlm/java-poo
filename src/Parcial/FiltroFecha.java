package Parcial;

import java.time.LocalDate;

public class FiltroFecha extends Filtro {
	
	private LocalDate fechaDada;

	@Override
	public boolean cumple(ElementoViaje viaje) {
		LocalDate fechaViaje = viaje.getFechaPago();
		
		if ((fechaViaje!=null)) {
			return fechaViaje.compareTo(fechaDada)>0;
		}
		return false;
	}

}
