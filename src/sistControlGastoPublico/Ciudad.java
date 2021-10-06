package sistControlGastoPublico;

import java.util.ArrayList;

public class Ciudad{
	
	private static int MIN = 100000;
	
	ArrayList<Contribuyente> contribuyentes;
	
	private String nombreCiu;
	private double montoRecaudadoCiu;
	private double gastoCiu;
	private int cantHabitantesCiu;
	private int tamanioCiu;
	
	public Ciudad(String nombreCiu) {
		
		this.contribuyentes = new ArrayList<Contribuyente>();
		this.nombreCiu = nombreCiu;
	}
	
	public boolean isCity(){
		return tamanioCiu > MIN;
	}
	
	public boolean isDeficit(){
		
		double total = montoRecaudadoCiu;
		double gasto = gastoCiu;
		
		return gasto > total;
	}

	public String getNombreCiu() {
		return nombreCiu;
	}

	public void setNombreCiu(String nombreCiu) {
		this.nombreCiu = nombreCiu;
	}

	public double getMontoRecaudadoCiu() {
		return montoRecaudadoCiu;
	}

	public void setMontoRecaudadoCiu(double montoRecaudadoCiu) {
		this.montoRecaudadoCiu = montoRecaudadoCiu;
	}

	public double getGastoCiu() {
		return gastoCiu;
	}

	public void setGastoCiu(double gastoCiu) {
		this.gastoCiu = gastoCiu;
	}

	public int getCantHabitantesCiu() {
		return cantHabitantesCiu;
	}

	public void setCantHabitantesCiu(int cantHabitantesCiu) {
		this.cantHabitantesCiu = cantHabitantesCiu;
	}

	public int getTamanioCiu() {
		return tamanioCiu;
	}

	public void setTamanioCiu(int tamanioCiu) {
		this.tamanioCiu = tamanioCiu;
	}
	
	
	
	
	
	
	
	
	



}
