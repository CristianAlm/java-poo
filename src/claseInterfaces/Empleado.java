package claseInterfaces;

import java.time.LocalDate;

public class Empleado extends Persona{
	
	private double sueldoBasico;

	public Empleado(String nombre, LocalDate nacimiento, int canHijos,
			double sueldoBasico) {
		super(nombre, nacimiento, canHijos);
		this.sueldoBasico = sueldoBasico;
	}
	
	private double calcularBonificacion(){
		return 0.0;
	}
	private double calcularRetencion(){
		return 0.0;
	}
	public double getSueldoBasico(){
		return sueldoBasico + calcularBonificacion() + calcularRetencion();
	}

}
