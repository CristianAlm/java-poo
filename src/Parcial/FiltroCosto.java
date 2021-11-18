package Parcial;

public class FiltroCosto extends Filtro {
	
	private double costo;

	public FiltroCosto(double costo) {
		super();
		this.costo = costo;
	}
	@Override
	public boolean cumple(ElementoViaje viaje) {
		return viaje.getCosto()>costo;
	}

}
