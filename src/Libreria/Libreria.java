package Libreria;

import java.util.ArrayList;

public class Libreria {
	ArrayList<Producto> productos;
	ArrayList<Cliente> clientes;
	
	public Libreria(){
		productos = new ArrayList<Producto>(); 
		clientes = new ArrayList<Cliente>();
	}
	public double getPrecio(Producto p, Cliente c){
		return p.getPrecio(c);
	}
	
	public boolean comproProducto(Cliente c1, Producto pp){
		return c1.comprasteProducto(pp);
	}
	
	public boolean leGustaLibro(Cliente c1, Libro l1){
		return c1.leGusta(l1);
	}
}
