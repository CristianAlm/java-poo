package tp5;

import java.util.ArrayList;

public class Alumno {
	protected String nombre;
	ArrayList<String> cualidades;
	ArrayList<Alumno> familiares;
	
	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
		cualidades = new ArrayList<String>();
		familiares = new ArrayList<Alumno>();
	}
	public Alumno(String nombre, String cualidades, Alumno familiares) {
		super();
		this.nombre = nombre;
		cualidades = cualidades;
		familiares = familiares;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<String> getCualidades() {
		return cualidades;
	}
	public void setCualidades(String cualidades) {
		this.cualidades.add(cualidades);
	}
	public ArrayList<Alumno> getFamiliares() {
		return familiares;
	}
	public void setFamiliares(Alumno familiares) {
		this.familiares.add(familiares);
	}
	
	
	
}
