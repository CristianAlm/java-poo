package tp5;

import java.util.ArrayList;

public class Casa {
	
	protected final int TOPE = 100;
	
	ArrayList<String> cualidades;
	ArrayList<Alumno> alumnos;
	
	public Casa(){
		 cualidades = new ArrayList<String>();
		 alumnos = new ArrayList<Alumno>();
	}
	
	public Casa(int topMax, String caualidades, Alumno alumnos){
		 cualidades = cualidades;
	}
	
	public void addAlumno(Alumno nombre){
		
		if(TOPE > alumnos.size()){
			alumnos.add(nombre);			
		}
	}

	public ArrayList<String> getCualidades() {
		return cualidades;
	}

	public void setCualidades(ArrayList<String> cualidades) {
		this.cualidades = cualidades;
	}
	
	
}
