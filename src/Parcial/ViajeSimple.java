package Parcial;

import java.time.LocalDate;
import java.util.ArrayList;

public class ViajeSimple extends ElementoViaje{
	
	private String origen;
	private String destino;
	private double costo;
	private String datosAlojamiento;
	private LocalDate fechaPago;
	
	
	public ViajeSimple(int cantidadPersonas, int id, String origen,
			String destino, double costo, String datosAlojamiento,
			LocalDate fechaPago) {
		super(cantidadPersonas, id);
		this.origen = origen;
		this.destino = destino;
		this.costo = costo;
		this.datosAlojamiento = datosAlojamiento;
		this.fechaPago = fechaPago;
	}
	

	public String getDatosAlojamiento() {
		return datosAlojamiento;
	}

	public void setDatosAlojamiento(String datosAlojamiento) {
		this.datosAlojamiento = datosAlojamiento;
	}

	@Override
	public String getOrigen() {
		// TODO Auto-generated method stub
		return origen;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return destino;
	}
	
	@Override
	public double getCosto() {
		// TODO Auto-generated method stub
		return costo;
	}

	@Override
	public LocalDate getFechaPago() {
		// TODO Auto-generated method stub
		return fechaPago;
	}

	@Override
	public ArrayList<ElementoViaje> buscar(Filtro ff) {
		ArrayList<ElementoViaje>result = new ArrayList<ElementoViaje>();
		
		if (ff.cumple(this)) {
			result.add(this);
		}
		return result;
	}

}
