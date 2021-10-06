package tp5;

import java.util.ArrayList;

public class Lote {
	
	ArrayList<String>mineralesPropios;
	private int tamanio;
	private String localizacion;
	private boolean disponibilidades;
	private char tipoLote;
	
	
	public Lote(int tamanio, String localizacion,
			boolean disponibilidades, char tipoLote) {
		super();
		this.tamanio = tamanio;
		this.localizacion = localizacion;
		this.disponibilidades = disponibilidades;
		this.tipoLote = tipoLote;
	}



	public int getTamanio() {
		return tamanio;
	}


	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}


	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	public boolean isDisponibilidades() {
		return disponibilidades;
	}


	public void setDisponibilidades(boolean disponibilidades) {
		this.disponibilidades = disponibilidades;
	}


	public char getTipoLote() {
		return tipoLote;
	}


	public void setTipoLote(char tipoLote) {
		this.tipoLote = tipoLote;
	}
	
	
	

}
