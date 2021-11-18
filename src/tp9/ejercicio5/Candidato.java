package tp9.ejercicio5;

public class Candidato {
	private String nombre;
	private String empresa;
	private double sueldo;
	private Criterio criterioAceptacion;
	
	public Candidato(String nombre, String empresa, double sueldo,
			Criterio criterioAceptacion) {
		this.nombre = nombre;
		this.empresa = empresa;
		this.sueldo = sueldo;
		this.criterioAceptacion = criterioAceptacion;
	}

	public Criterio getCriterioAceptacion() {
		return criterioAceptacion;
	}

	public void setCriterioAceptacion(Criterio criterioAceptacion) {
		this.criterioAceptacion = criterioAceptacion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getSueldo() {
		return sueldo;
	}
	

}
