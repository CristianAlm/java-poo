package Parcial;

import java.time.LocalDate;
import java.util.Comparator;

public class ComparadorFecha implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje o1, ElementoViaje o2) {
		LocalDate f1 = o1.getFechaPago();
		LocalDate f2 = o2.getFechaPago();
		if (f1!=null) {
			return f1.compareTo(f2);
		}
		if(f2!=null){
			return -1;
		}
		return 0;
	}

}
