package tp7;

import java.time.LocalDate;

public class Libro implements Comparable<Libro> {
	
	private String autor;
	private LocalDate anioEdicion;
	private String genero;
	private String id;
	
	
	public Libro(String autor, LocalDate anioEdicion, String genero, String id) {
		super();
		this.autor = autor;
		this.anioEdicion = anioEdicion;
		this.genero = genero;
		this.id = id;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public LocalDate getAnioEdicion() {
		return anioEdicion;
	}


	public void setAnioEdicion(LocalDate anioEdicion) {
		this.anioEdicion = anioEdicion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", anioEdicion=" + anioEdicion
				+ ", genero=" + genero + ", id=" + id + "] \n";
	}


	@Override
	public int compareTo(Libro l1) {
		return this.getId().compareTo(l1.getId());
	}
	
	
	
	


}
