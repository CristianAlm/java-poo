package tp7;


public class OrdenarLibroPorAutor extends Ordenador{
	
	public OrdenarLibroPorAutor() {
		
	}
	public OrdenarLibroPorAutor(boolean modo) {
		super(modo);
	}

	

	@Override
	public int comparar(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getAutor().compareTo(o2.getAutor());
	}

}
