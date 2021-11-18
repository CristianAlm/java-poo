package tp9.ejercicio5;

public class CriterioEmpresa extends Criterio {

	private String empresa;
	
	
	
	public CriterioEmpresa(String empresa) {
		super();
		this.empresa = empresa;
	}


	@Override
	public boolean cumple(OfertaLaboral f1) {
		
		return this.empresa.equals(f1.getEmpresa());
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
}
