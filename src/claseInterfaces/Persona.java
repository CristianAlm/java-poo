package claseInterfaces;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private LocalDate nacimiento;
	private int canHijos;
	public Persona(String nombre, LocalDate nacimiento, int canHijos) {
		super();
		this.nombre = nombre;
		this.nacimiento = nacimiento;
		this.canHijos = canHijos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}
	public int getCanHijos() {
		return canHijos;
	}
	public void setCanHijos(int canHijos) {
		this.canHijos = canHijos;
	}
	
	public int getEdad(){
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(nacimiento, ahora);
		return periodo.getYears();
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", nacimiento=" + nacimiento
				+ ", canHijos=" + canHijos + "]";
	}
	@Override
	public int compareTo(Persona otra) {
		// TODO Auto-generated method stub
		return this.getCanHijos() - otra.getCanHijos();
	}
	
	


}
