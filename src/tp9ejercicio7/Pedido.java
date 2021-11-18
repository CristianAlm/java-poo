package tp9ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {

	private String nombre;
	private ArrayList<String> matNecesarios;
	private ArrayList<String> caracteristicas;
	private LocalDate fechaIni;
	private LocalDate fechaMax;
	private String destino;
	public Pedido(String nombre, ArrayList<String> matNecesarios,
			ArrayList<String> caracteristicas, LocalDate fechaIni,
			LocalDate fechaMax, String destino) {
		super();
		this.nombre = nombre;
		this.matNecesarios = matNecesarios;
		this.caracteristicas = caracteristicas;
		this.fechaIni = fechaIni;
		this.fechaMax = fechaMax;
		this.destino = destino;
	}
	
	public String getNombre() {
		return nombre;
	}
	public ArrayList<String> getMatNecesarios() {
		
		return new ArrayList<String>(matNecesarios);
	}
	public ArrayList<String> getCaracteristicas() {
		return new ArrayList<String>(caracteristicas);
	}
	public LocalDate getFechaIni() {
		return fechaIni;
	}
	public LocalDate getFechaMax() {
		return fechaMax;
	}
	public String getDestino() {
		return destino;
	}
	
	
	
	
	
}
