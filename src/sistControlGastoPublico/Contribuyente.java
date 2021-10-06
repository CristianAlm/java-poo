package sistControlGastoPublico;

public class Contribuyente {
	
	
	private String nombre;
	private long codigo;
	private double montoFijo;
	private double totalAbonado;
	private double total;
	public Contribuyente(String nombre, long codigo, double montoFijo,
			double totalAbonado, double total) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.montoFijo = montoFijo;
		this.totalAbonado = totalAbonado;
		this.total = total;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public double getMontoFijo() {
		return montoFijo;
	}
	public void setMontoFijo(double montoFijo) {
		this.montoFijo = montoFijo;
	}
	public double getTotalAbonado() {
		return totalAbonado;
	}
	public void setTotalAbonado(double totalAbonado) {
		this.totalAbonado = totalAbonado;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	


	
	
	
}
