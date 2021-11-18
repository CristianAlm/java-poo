package tp7;

public class FiltroPorContenido extends Filtro {
	
	private String contenidoSeleccionado;
	
	public FiltroPorContenido(String contenidoSeleccionado) {
		super();
		this.contenidoSeleccionado = contenidoSeleccionado;
	}

	@Override
	public boolean cumple(Documento d) {
		// TODO Auto-generated method stub
		return false;
	}

}
