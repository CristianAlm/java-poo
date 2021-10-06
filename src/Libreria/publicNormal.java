package Libreria;

public class publicNormal extends Cliente {

	public publicNormal(String nombre, String apellido, String direccion,
			long dni) {
		super(nombre, apellido, direccion, dni);
		
	}
	
	public boolean leGusta(Libro l1){
		return true;
	}

}
