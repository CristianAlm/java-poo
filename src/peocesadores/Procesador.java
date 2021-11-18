package peocesadores;

public class Procesador {
	
	private ColaTareas tareas;

	public Procesador(ColaTareas tareas) {
		super();
		this.tareas = new ColaTareasCPU();
	}
	public void addTarea(Tarea t1){
		tareas.agregarTarea(t1);
	}
	public void setComportamiento(ColaTareas nuevaForma){
		nuevaForma.vaciar();
		while (tareas.getSize()>0) {
			nuevaForma.agregarTarea(tareas.obtenerPrimera());
		}
		tareas = nuevaForma;
	}
}
