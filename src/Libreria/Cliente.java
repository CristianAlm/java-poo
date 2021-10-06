package Libreria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private long dni;
	private double descuento;
	
	protected ArrayList<String> autoresFavoritos;
	protected ArrayList<String> generosFavoritos;
	protected ArrayList<Producto>compras;
	
	public Cliente(String nombre, String apellido, String direccion, long dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		autoresFavoritos = new ArrayList<String>();
		generosFavoritos = new ArrayList<String>();
		
		compras = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public void addAutorFavorito(String nombre){
		//contains funciona usando el equals del tipo  de elemento
		if (!autoresFavoritos.contains(nombre)) {
			autoresFavoritos.add(nombre);
		}
	}
	
	public void addGeneroFavorito(String genero){
		if (!generosFavoritos.contains(genero)) {
			generosFavoritos.add(genero);
		}
	}
	
	public void addProductoComprado(Producto prod){
		compras.add(prod);
	}
	
	public boolean comprasteProducto(Producto pp){
		return compras.contains(pp);
	}
	
	public boolean leGustaGenero(String genero){
		return generosFavoritos.contains(genero);
	}
	public boolean leGusta(Libro l1){
		return autoresFavoritos.contains(l1.getAutor());
	}
	
}
