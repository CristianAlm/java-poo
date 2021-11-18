package tp7;

public class FiltroPorAutor extends Filtro {
	
	private String autorString;
	
	

	public FiltroPorAutor(String autorString) {
		super();
		this.autorString = autorString;
	}
	@Override
	public boolean cumple(Documento d) {
		// TODO Auto-generated method stub
		return false;
	}

}
