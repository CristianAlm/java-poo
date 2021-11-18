package peocesadores;

import java.util.ArrayList;

public abstract class ColaTareas {
	
	private ArrayList<Tarea>tareas;
	
	public ColaTareas(){
		this.tareas = new ArrayList<Tarea>();
	}
	
	public abstract boolean esMayor(Tarea t1, Tarea t2);

	public Tarea obtenerPrimera() {
		if (tareas.size()>0) {
			Tarea t1 = tareas.get(0);
			tareas.remove(0);
			return t1;
		}else{
			return null;
		}
	}
	public void vaciar() {
		tareas = new ArrayList<Tarea>();	
	}
	public int getSize() {
		// TODO Auto-generated method stub
		return tareas.size();
	}

	public void agregarTarea(Tarea t1) {
		boolean encontrado = false;
		int ind = 0;
		
		while (!encontrado && ind < tareas.size()) {
			if (this.esMayor(t1, tareas.get(ind))) {
				encontrado = true;
				tareas.add(ind, t1);
			}
			ind++;
		}
		if (!encontrado) {
			tareas.add(t1);
		}
		
	}
}
