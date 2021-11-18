package tp9ejercicio7;

import java.util.ArrayList;

public class Fabrica {

	private String nombre;
	private ArrayList<Politica> politicas;
	private Fabrica cercana;
	private ArrayList<Pedido> pedidosPendientes;
	public Fabrica(String nombre, Fabrica cercana) {
		super();
		this.nombre=nombre;
		this.politicas = new ArrayList<Politica>();
		this.cercana = cercana;
		this.pedidosPendientes = new ArrayList<Pedido>();;
	}
	public ArrayList<Politica> getPoliticas() {
		
		return new ArrayList<Politica>(politicas);
	}
	public void addPoliticas(Politica p1) {
		politicas.add(p1);
	}
	public Fabrica getCercana() {
		return cercana;
	}
	public void setCercana(Fabrica cercana) {
		this.cercana = cercana;
	}
	public ArrayList<Pedido> getPedidosPendientes() {
		return new ArrayList<Pedido>(pedidosPendientes);
	}
	
	public void addPedidosPendientes(Pedido p1) {

		for (Politica politica : politicas) {
			if(!politica.esAdmisible(p1)){
				return ;
			}
		}
		pedidosPendientes.add(p1);
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
}
