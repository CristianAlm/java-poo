package claseInterfaces;

public class Facultad {
	
	ColaEspera alumnos;

	public Facultad() {
		super();
		alumnos = new ColaEspera();
	}
	
	public void addAlumno(Alumno alumno){
		alumnos.addElemento(alumno);
	}
	
	
	
	

}
