package Parcial;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeCompuesto extends ElementoViaje{
	
	private ArrayList<ElementoViaje>elementos;

	public ViajeCompuesto(int cantidadPersonas, int id,
			ArrayList<ElementoViaje> elementos) {
		super(cantidadPersonas, id);
		this.elementos = elementos;
	}
	
	public void addViajes(ElementoViaje viaje){
		if (viaje.getCantidadPersonas() == this.getCantidadPersonas()) {
			if (elementos.size()==0) {
				elementos.add(viaje);
			}else{
				if (this.getDestino().equals(viaje.getOrigen())) {
					elementos.add(viaje);
				}
			}
		}
	}

	@Override
	public String getOrigen() {
		if(!elementos.isEmpty()){//El empty me dice si esta vacio o no y luego lo niego
			return elementos.get(0).getOrigen();
		}else{
			return null;			
		}
	}

	@Override
	public String getDestino() {
		if(elementos.size() > 0){
			return elementos.get(elementos.size()-1).getDestino();
		}
		else return null;
	}

	@Override
	public double getCosto() {
		double aux = 0;
		for (int i = 0; i < elementos.size(); i++) {
			aux = aux + elementos.get(i).getCosto();
		}
		return aux;
	}

	@Override
	public LocalDate getFechaPago() {
		LocalDate mayor = LocalDate.of(1900, 1, 1);
		for (int i = 0; i < elementos.size(); i++) {
			ElementoViaje ElementoInterno = elementos.get(i);
			LocalDate fecha = ElementoInterno.getFechaPago();
			if(fecha == null) return null;
			else{
				if (fecha.compareTo(mayor)>0) {
					mayor = fecha;
				}
			}
		}
		return mayor;
	}
	@Override
	public ArrayList<ElementoViaje> buscar(Filtro ff) {
		ArrayList<ElementoViaje> result = new ArrayList<ElementoViaje>();
		if(ff.cumple(this)){
			result.add(this);
		}else{
			for (int i = 0; i < elementos.size(); i++) {
				ArrayList<ElementoViaje>aux= elementos.get(i).buscar(ff);
				result.addAll(aux);
			}
		}
		return result;
	}
}
