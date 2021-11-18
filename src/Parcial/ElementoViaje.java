package Parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoViaje {
	
	private int cantidadPersonas;
	private int id;
	public ElementoViaje(int cantidadPersonas, int id) {
		super();
		this.cantidadPersonas = cantidadPersonas;
		this.id = id;
	}
	public int getCantidadPersonas() {
		return cantidadPersonas;
	}
	public void setCantidadPersonas(int cantidadPersonas) {
		this.cantidadPersonas = cantidadPersonas;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public abstract String getOrigen();
	public abstract String getDestino();
	public abstract double getCosto();
	public abstract LocalDate getFechaPago();
	public abstract ArrayList<ElementoViaje> buscar(Filtro ff);
	
	public ArrayList<ElementoViaje> buscar(Filtro ff, Comparator<ElementoViaje> c1){
		ArrayList<ElementoViaje> result = this.buscar(ff);
		Collections.sort(result, c1);
		return result;
	}

}
