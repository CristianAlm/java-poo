package tp4;

public class Alarma {
	
	private boolean rompioVidrio;
	private boolean seAbrio;
	private boolean movimientoDentro;
	
	public Alarma(){
		this.rompioVidrio=true;
		this.seAbrio = false;
		this.movimientoDentro = false;

	}
	
	public Alarma(boolean rompioVidrio2, boolean seAbrio2,
			boolean movimientoDentro2) {
		// TODO Auto-generated constructor stub
	}

	public boolean comprobar(){
		if (this.rompioVidrio || this.seAbrio || this.movimientoDentro) {
			return true;
		}else{
			return false;
		}
	}
	
	public void activarAlarma(){
		if (this.comprobar()) {
			Timbre.hacer_sonar();
		}
	}

	public boolean isRompioVidrio() {
		return rompioVidrio;
	}

	public void setRompioVidrio(boolean rompioVidrio) {
		this.rompioVidrio = rompioVidrio;
	}

	public boolean isSeAbrio() {
		return seAbrio;
	}

	public void setSeAbrio(boolean seAbrio) {
		this.seAbrio = seAbrio;
	}

	public boolean isMovimientoDentro() {
		return movimientoDentro;
	}

	public void setMovimientoDentro(boolean movimientoDentro) {
		this.movimientoDentro = movimientoDentro;
	}

}
