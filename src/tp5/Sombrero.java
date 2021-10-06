package tp5;

import java.util.ArrayList;

public class Sombrero {
	
	static ArrayList<Alumno>alumnos;
	ArrayList<Casa>casas;
	
	public Sombrero(){
		alumnos = new ArrayList<Alumno>();
		casas = new ArrayList<Casa>();
	}
	
	public void compararPropúesta(Alumno alumnos, Casa casas){
		//además de haber lugar, el alumno tiene que poseer 
		//todas las cualidades que la casa requiera.
		boolean elegible = true;
		
		if(alumnos.getCualidades().equals(casas.getCualidades())){
			elegible = false;
		}
		
		if(!elegible){
			casas.addAlumno(alumnos);
		}
		
	}

}
