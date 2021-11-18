package tp9.ejercicio5;

public class OfertaLaboral {

	private int horasEstablecidas;
	private String empresa;
	private double monto;
	
	public OfertaLaboral(int horasEstablecidas, String empresa, double monto) {
		super();
		this.horasEstablecidas = horasEstablecidas;
		this.empresa = empresa;
		this.monto = monto;
	}

	public int getHorasEstablecidas() {
		return horasEstablecidas;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getMonto() {
		return monto;
	}
	
	
}
