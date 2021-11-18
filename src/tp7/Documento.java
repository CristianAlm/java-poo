package tp7;

import java.util.ArrayList;

public class Documento {
	
	private String titulo;
	private String autor;
	private ArrayList<String>autores;
	private ArrayList<String>palabrasClaves;
	private String contenido;
	
	public Documento(String titulo, String autor, ArrayList<String> autores,
			ArrayList<String> palabrasClaves, String contenido) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.palabrasClaves = palabrasClaves;
		this.contenido = contenido;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}

	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public void setPalabrasClaves(ArrayList<String> palabrasClaves) {
		this.palabrasClaves = palabrasClaves;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	

}
