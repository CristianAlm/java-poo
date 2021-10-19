package procesadores;

/*
 * A un procesador se le asignan tareas, las mismas poseen una prioridad,
 * uso de memoria y uso de CPU. El procesador X ordena las tareas de
 * acuerdo a la prioridad de las misma, mientras que otros procesadores
 * las ordenan por uso de CPU o uso de memoria.
 * */

public class Tarea {
	
	private double cpu;
	private double memoria;
	private int prioridad;
	private String id;
	public Tarea(double cpu, double memoria, int prioridad, String id) {
		super();
		this.cpu = cpu;
		this.memoria = memoria;
		this.prioridad = prioridad;
		this.id = id;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	public int getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Tarea [cpu=" + cpu + ", memoria=" + memoria + ", prioridad="
				+ prioridad + ", id=" + id + "]";
	}
	public void ejecutarTarea(){
		System.out.println("Se ejecuto la tarea " + this);
	}
	
	

}
