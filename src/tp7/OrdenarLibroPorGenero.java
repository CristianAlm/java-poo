package tp7;

public class OrdenarLibroPorGenero extends Ordenador {

	public OrdenarLibroPorGenero() {
	}
	
	public OrdenarLibroPorGenero(boolean modo){
		super(modo);
	}

	@Override
	public int comparar(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getGenero().compareTo(o2.getGenero());
	}

}
