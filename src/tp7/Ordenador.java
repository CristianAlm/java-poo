package tp7;

import java.util.Comparator;

public abstract class Ordenador implements Comparator<Libro> {
	
	private boolean ascendente;

	public Ordenador(boolean ascendente) {
		this.ascendente = ascendente;
		
	}

	public Ordenador() {
		this.ascendente= true;
	}

	@Override
	public int compare(Libro o1, Libro o2) {
		if(!ascendente){
			return comparar(o2, o1);
		}else{
			return comparar(o1,o2);
		}
	}

	public abstract int comparar(Libro o1, Libro o2);
	
	

}
