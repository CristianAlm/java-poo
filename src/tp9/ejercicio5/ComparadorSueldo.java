package tp9.ejercicio5;

import java.util.Comparator;

public class ComparadorSueldo implements Comparator<Candidato> {

	@Override
	public int compare(Candidato c1, Candidato c2) {
		return 		(int) (c1.getSueldo()- c2.getSueldo());
	}

} 
