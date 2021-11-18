package tp9.ejercicio5;

public class CriterioSalario extends Criterio {

	private double sueldo;
	
	
	public CriterioSalario(double sueldo) {
		super();
		this.sueldo = sueldo;
	}


	@Override
	public boolean cumple(OfertaLaboral f1) {
		
		return this.sueldo<= f1.getMonto();
	}

}
