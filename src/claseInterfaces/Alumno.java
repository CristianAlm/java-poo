package claseInterfaces;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona implements ElementoCola {
	
	private int legajo;
	private ArrayList<String>materiasAprobadas;
	
	public Alumno(String nombre, LocalDate nacimiento, int canHijos,
			int legajo, ArrayList<String> materiasAprobadas) {
		super(nombre, nacimiento, canHijos);
		this.legajo = legajo;
		this.materiasAprobadas = new ArrayList<String>();
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public int cantidadMateriaAprobadas(){
		return materiasAprobadas.size();	
	}
	public void agregarMateriaAprobada(String materia){
		materiasAprobadas.add(materia);
	}
	@Override
	public boolean esMayor(ElementoCola otro) {
		// TODO Auto-generated method stub
		return this.getLegajo() > ((Alumno)otro).getLegajo();
	}
}
