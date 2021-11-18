package Parcial;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajePromo extends ElementoViaje{
	
	private ElementoViaje apuntado;
	private LocalDate fInicio;
	private LocalDate fFin;
	private double descuento;
	
	public ViajePromo(int cantidadPersonas, int id, ElementoViaje apuntado,
			LocalDate fInicio, LocalDate fFin, double descuento) {
		super(0, 0);//Me tengo que fijar si pasar dos 0
		this.apuntado = apuntado;
		this.fInicio = fInicio;
		this.fFin = fFin;
		this.descuento = descuento;
	}

	@Override
	public String getOrigen() {
		// TODO Auto-generated method stub
		return apuntado.getOrigen();
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return apuntado.getDestino();
	}

	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return apuntado.getCosto();
	}

	@Override
	public LocalDate getFechaPago() {
		// TODO Auto-generated method stub
		return apuntado.getFechaPago();
	}

	@Override
	public ArrayList<ElementoViaje> buscar(Filtro ff) {
		// TODO Auto-generated method stub
		return apuntado.buscar(ff);
	}
	
	public int id() {
		return apuntado.getId();
	}

	public int getCantidadPersonas() {
		return apuntado.getCantidadPersonas();
	}
	
}
