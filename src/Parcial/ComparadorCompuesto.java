package Parcial;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<ElementoViaje>{
	
	Comparator<ElementoViaje>c1;
	Comparator<ElementoViaje>c2;

	@Override
	public int compare(ElementoViaje o1, ElementoViaje o2) {
		int r1 = c1.compare(o1, o2);
		if (r1 ==0) {
			return c2.compare(o1, o2);
		}
		return r1;
	}

}
