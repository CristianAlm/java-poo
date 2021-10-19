package tp7;

import java.util.ArrayList;
import java.util.Collections;

public class Diccionario {
	private ArrayList<Palabra> diccionarios;
	
	
	public Diccionario() {
		super();
		this.diccionarios = new ArrayList<>();
	}

	public void addPalabra(Palabra p1){
		this.diccionarios.add(p1);
	}
	
	
	public ArrayList<Palabra>getArrayIn(Palabra p1, Palabra p2){
		ArrayList<Palabra> palabras = new ArrayList<>();
		Collections.sort(this.diccionarios);
		for (Palabra p: diccionarios){
			if( (p.compareTo(p1)>= 0) && (p.compareTo(p2)<= 0)){
				palabras.add(p);
			}
		}
		return palabras;
	}
}
