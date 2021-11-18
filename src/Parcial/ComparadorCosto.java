package Parcial;

import java.util.Comparator;

public class ComparadorCosto implements Comparator<ElementoViaje>{

	@Override
	public int compare(ElementoViaje o1, ElementoViaje o2) {
		double d1 = o1.getCosto();
		double d2 = o2.getCosto();
		
		
		if(d1 > d2){
			return 1;
		}else{
			if(d2 > d1){
				return -1;
			}else{
				return 0;
			}
		}
	}

}
