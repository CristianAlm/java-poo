package procesadores;

import java.util.ArrayList;

/*
 * A un procesador se le asignan tareas, las mismas poseen una prioridad,
 * uso de memoria y uso de CPU. El procesador X ordena las tareas de
 * acuerdo a la prioridad de las misma, mientras que otros procesadores
 * las ordenan por uso de CPU o uso de memoria.
 * */

public abstract class Procesador {
	protected ArrayList<Tarea>tareas;

	public Procesador(ArrayList<Tarea> tareas) {
		super();
		this.tareas = tareas;
	}
	
	public void ejecutarPrimera(){
		if (tareas.size()>0) {
			Tarea t1 = tareas.get(0);
			t1.ejecutarTarea();
			tareas.remove(0);
		}
	}
	
	
	//Metodo Template
	public void addTarea(Tarea t1){
		boolean encontro = false;
		int i =0;
		while(!encontro&&i<tareas.size()){
			if(this.esMayor(t1,tareas.get(i))){
				encontro = true;
				tareas.add(i,t1);
			}
			if(!encontro){
				tareas.add(t1);
			}
		}
	}

	public abstract boolean esMayor(Tarea t1, Tarea t2);


	@Override
	public String toString() {
		return "Procesador [tareas=" + tareas + "]";
	}
	
	
	
}
