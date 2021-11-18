package claseInterfaces;

public class Proceso implements ElementoCola{
	
	private String nombre;
	private double Memoria;
	
	public Proceso(String nombre, double memoria) {
		super();
		this.nombre = nombre;
		Memoria = memoria;
	}
	public double getMemoriaRequerida() {
		return Memoria;
	}
	public String getNombre() {
		return nombre;
	}
	public double getMemoria() {
		return Memoria;
	}
	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", Memoria=" + Memoria + "]";
	}
	@Override
	public boolean esMayor(ElementoCola otro) {
		//La memoria es mayor que la memoria requerida
		return this.getMemoria() > ((Proceso) otro).getMemoriaRequerida();	
	}
}
