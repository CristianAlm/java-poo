package tp7;

public class OrdenarLibroPorAnio extends Ordenador{

	public OrdenarLibroPorAnio() {
		
	}
	
	public OrdenarLibroPorAnio(boolean modo){
		super(modo);
	}

	@Override
	public int comparar(Libro o1, Libro o2) {
		// TODO Auto-generated method stub
		return o1.getAnioEdicion().compareTo(o2.getAnioEdicion());
	}
	


}
