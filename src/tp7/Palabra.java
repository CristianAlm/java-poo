package tp7;

import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra>{
	private String gramatica;
	private String nombre;
	private ArrayList<String> definiciones;
	private ArrayList<String> antonimos;
	private ArrayList<String> sinonimos;
	
	public Palabra(String gramatica, String nombre){
		this.gramatica = gramatica;
		this.nombre = nombre;
		this.definiciones= new ArrayList<String>();
		this.antonimos= new ArrayList<String>();
		this.sinonimos = new ArrayList<String>();
	}
	
	public String getGramatica() {
		return gramatica;
	}

	public void setGramatica(String gramatica) {
		this.gramatica = gramatica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/*
	public ArrayList<String> getDefiniciones() {
		return definiciones;
	}
*/
	public void setDefiniciones(String definiciones) {
		this.definiciones.add(definiciones);
	}
/*
	public ArrayList<String> getAntonimos() {
		return antonimos;
	}
*/
	public void setAntonimos(String antonimos) {
		this.antonimos.add(antonimos);
	}


	public void setSinonimos(String sinonimos) {
		this.sinonimos.add(sinonimos);
	}

	public int compareTo(Palabra p1){
		return this.getNombre().compareTo(p1.getNombre());
	}
	
	public ArrayList<String>obtenerSinonimos(){
		ArrayList<String>  s1= new ArrayList<String>();
		s1.addAll(this.sinonimos);
		Collections.sort(s1);
		return s1;
	}
/*	
	public ArrayList<String>obtenerAtonimos()
	public ArrayList<String>obtenerDefiniciones()
*/

	@Override
	public String toString() {
		return "Palabra [gramatica=" + gramatica + ", nombre=" + nombre + "]";
	}
}
