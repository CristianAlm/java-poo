package tp9.ejercicio5;

public class FiltroSalario extends Filtro {
	
	
	private int salarioBase;
	
	public FiltroSalario(int salarioBase) {
		super();
		this.salarioBase = salarioBase;
	}
	@Override
	public boolean cumple(Candidato c1) {
		return this.salarioBase <= c1.getSueldo();
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	

}
