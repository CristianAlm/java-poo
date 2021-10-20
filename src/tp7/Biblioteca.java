package tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
	
	private ArrayList<Libro>libros;

	public Biblioteca() {
		super();
		this.libros = new ArrayList<>();
	}
	
	public void addLibro(Libro l1){
		this.libros.add(l1);
	}

	public ArrayList<Libro> getLibros() {
		ArrayList<Libro>aux = new ArrayList<Libro>(this.libros);
		Collections.sort(aux);
		return aux;
	}
	
	public ArrayList<Libro> getLibros(Comparator<Libro> o1) {
		ArrayList<Libro>aux = new ArrayList<Libro>(this.libros);
		Collections.sort(aux,o1);
		return aux;
	}

	@Override
	public String toString() {
		return "Biblioteca [libros=" + libros + "]";
	}

	
	
	
	
	

}
