package tp7;

public class FiltroPorPalabraClave extends Filtro {
	
	private String palabraSeleccionado;
	
	public FiltroPorPalabraClave(String palabraSeleccionado) {
		super();
		this.palabraSeleccionado = palabraSeleccionado;
	}

	@Override
	public boolean cumple(Documento d) {
		// TODO Auto-generated method stub
		return false;
	}

}
