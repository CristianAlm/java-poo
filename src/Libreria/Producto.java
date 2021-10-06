package Libreria;

public class Producto {
	
	protected String nombre;
	protected String autor;
	protected Double precio;
	
	
	public Producto(String nombre, String autor, double precio){
		this.setNombre(nombre);
		setAutor(autor);
		this.precio=precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Double getPrecio(Cliente comprador) {
		if (comprador!=null) {
			return precio -((comprador.getDescuento()/100)*precio);
		} else {
			return precio;
		}
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public boolean equals(Object o1){
		try {
			Producto p1 = (Producto)o1;
			
			return p1.getNombre().equals(nombre)&& p1.getAutor().equals(autor);
			
		} catch (Exception e) {
			return false;
		}
	}

	
	

}
