package tp5;

import java.util.ArrayList;

public class Consejero {
	
	ArrayList<String>mineralesDeseados;
	ArrayList<Lote>lotes;
	ArrayList<Cereal>tipoCereal;
	ArrayList<Lote>clasificacion;
	
	private boolean planteValido;
	private boolean especial;
	
	public Consejero(boolean planteValido, boolean especial) {
		super();
		this.planteValido = planteValido;
		this.especial = especial;
	}

	public ArrayList<Cereal> getTipoCereal() {
		return tipoCereal;
	}

	public void setTipoCereal(ArrayList<Cereal> tipoCereal) {
		this.tipoCereal = tipoCereal;
	}

	public boolean isPlanteValido() {
		return planteValido;
	}

	public void setPlanteValido(boolean planteValido) {
		this.planteValido = planteValido;
	}
	
	
	
	
	

}
