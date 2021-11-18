package claseInterfaces;

public class Computadora implements ElementoCola{
	
	private double velocidadCpu;
	private String nombre;
	private Proceso proc;
	
	public Computadora(double velocidadCpu, String nombre) {
		super();
		this.velocidadCpu = velocidadCpu;
		this.nombre = nombre;
		this.proc = null;
	}
	@Override
	public String toString() {
		return "Computadora{" +
                "velocidadCPU=" + velocidadCpu +
                ", nombre='" + nombre + '\'' +
                '}'+"\n";
	}
	public double getVelocidadCpu() {
		// TODO Auto-generated method stub
		return velocidadCpu;
	}
	@Override
	public boolean esMayor(ElementoCola otro) {
		// TODO Auto-generated method stub
		return false;
	}
	public void ejecutarProceso(Proceso p) {
		this.proc = p;
		
	}
	
}
