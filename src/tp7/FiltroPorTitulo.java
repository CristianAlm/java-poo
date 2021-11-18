package tp7;

public class FiltroPorTitulo extends Filtro {
	
	private String tituloSeleccionado;
	
	public FiltroPorTitulo(String tituloSeleccionado) {
		super();
		this.tituloSeleccionado = tituloSeleccionado;
	}

	public String getTituloSeleccionado() {
		return tituloSeleccionado;
	}

	public void setTituloSeleccionado(String tituloSeleccionado) {
		this.tituloSeleccionado = tituloSeleccionado;
	}

	@Override
	public boolean cumple(Documento d) {
		// TODO Auto-generated method stub
		return d.getTitulo().equals(tituloSeleccionado);
	}
}
