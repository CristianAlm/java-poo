package sistControlGastoPublico;

import java.util.ArrayList;

public class Provincia{
	
	ArrayList<Ciudad> ciudades;
	
	private String nombreProv;
	private double montoRecaudadoProv;
	private double gastoProv;
	private int cantHabitantesProv;
	private int tamanioProv;

	

	public Provincia(String nombreProv) {
		
		this.ciudades = new ArrayList<Ciudad>();
		this.nombreProv = nombreProv;
	}
	
	public boolean isPobre(){
		int contador =0;
		
		for (Ciudad ciudad : ciudades) {
			if(ciudad.isDeficit()){
				contador++;
			}
		}
		return contador > ciudades.size()/2;
		
	}

	public String getNombreProv() {
		return nombreProv;
	}

	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}

	public double getMontoRecaudadoProv() {
		return montoRecaudadoProv;
	}

	public void setMontoRecaudadoProv(double montoRecaudadoProv) {
		this.montoRecaudadoProv = montoRecaudadoProv;
	}

	public double getGastoProv() {
		return gastoProv;
	}

	public void setGastoProv(double gastoProv) {
		this.gastoProv = gastoProv;
	}

	public int getCantHabitantesProv() {
		return cantHabitantesProv;
	}

	public void setCantHabitantesProv(int cantHabitantesProv) {
		this.cantHabitantesProv = cantHabitantesProv;
	}

	public int getTamanioProv() {
		return tamanioProv;
	}

	public void setTamanioProv(int tamanioProv) {
		this.tamanioProv = tamanioProv;
	}
	

}
