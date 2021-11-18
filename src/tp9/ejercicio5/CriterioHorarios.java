package tp9.ejercicio5;

public class CriterioHorarios extends Criterio {

	private int cantHoras;
	
	public CriterioHorarios(int cantHoras) {
		this.cantHoras=cantHoras;
	}
	
	
	@Override
	public boolean cumple(OfertaLaboral f1) {

		return (this.cantHoras >=f1.getHorasEstablecidas());
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}
}
