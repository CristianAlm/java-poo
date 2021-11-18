package Parcial;

public class FiltroOrigen extends Filtro {
	
	private String origen;

	@Override
	public boolean cumple(ElementoViaje viaje) {
		return origen.equals(viaje.getOrigen());
	}

}
