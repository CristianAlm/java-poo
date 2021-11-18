package peocesadores;

public class ColaTareasCPU extends ColaTareas {

	@Override
	public boolean esMayor(Tarea t1, Tarea t2) {
		// TODO Auto-generated method stub
		return t1.getCpu() > t2.getCpu();
	}

}
