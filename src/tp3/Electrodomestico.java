package tp3;

public class Electrodomestico {
	
	private static final int LIMITE = 45;
	
	private String nombre;
	private double precio;
	private String color;
	private double consumo;
	private double peso;
	
	
	public Electrodomestico(String nombre, double precio, String color, double consumo, double peso){
		this.nombre = nombre;
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}
	
	public String toString(){
		String mensaje = "nombre:"+this.nombre+"\nPrecio: "+this.precio+"\nColor: "+this.color+"\nConsumo: "+this.consumo+"\nPeso: "+this.peso+"\nBajo Consumo: " + this.getbajoConsumo() + "\nBalance: " + this.getBalance()+"\nAlta gama?: " + this.getAltaGama();
		
		return mensaje;
	}

	private boolean getbajoConsumo() {
		if (this.consumo > LIMITE) {
			return false;			
		}else{
			return true;			
		}
	}
	
	public double getBalance(){
		return (this.precio/this.peso);
	}
	
	public boolean getAltaGama(){
		if(this.getBalance() > 3){
			return true;
		} else{
			return false;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}