package tp3;

import java.time.LocalDate;

public class Persona {
	private static final int MAX = 25;
	private static final int MIN = 15;
	private static final int MAYOR = 18;
	private static final int VOTANTE = 16;
	
	
	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fecha;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	private double masa;
	private boolean isForma;
	private boolean isMayor;
	private boolean isVotante;
	
	
	
	public Persona(int dni, LocalDate fecha, char sexo, String nombre, String apellido, double peso, double altura){
		this.altura=altura;
		this.dni=dni;
		this.sexo=sexo;
		this.fecha=fecha;
		this.nombre=nombre;
		this.setApellido(apellido);
		this.peso=peso;
		this.edad=edadActual();
		this.setApellido(apellido);
		this.masa= (peso/(altura*altura));
		this.isForma = isMayor();
		this.isVotante = isVotante();
	}
	/*
	public boolean yaCumplio(){
		LocalDate hoy = LocalDate.now();
		LocalDate fechaCumpleaños=fecha.withYear(hoy.getYear());
		if(hoy.isBefore(fechaCumpleaños)){
			
		}
	}
	*/
	
	public String toString(){
		String mensaje = "edad:"+this.getEdad()+"\nNombre: "+this.nombre+"\nGenero: "+this.sexo+"\nMasa: "+this.masa+"\nVotante: "+this.isVotante; return mensaje;
	}
	
	
	public boolean isMayor(){
		if (this.edad >= MAYOR) {
			isMayor = true;
			return isMayor;
		}else{
			return isMayor;			
		}
		
	}
	
	public int edadActual(){
		LocalDate hoy = LocalDate.now();
		int edadLocal=(hoy.getYear()- this.fecha.getYear());
	
		LocalDate fechaCumpleaños=this.fecha.withYear(hoy.getYear());
		
		System.out.println(edadLocal);
		if(hoy.isBefore(fechaCumpleaños)){
			edadLocal--;
			return edadLocal;
		}else{
			return edadLocal;
		}
	}
	
	
	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public boolean isForma() {
		this.isForma = false;
		
		if (this.masa >= MIN && this.masa <= MAX) {
			this.isForma = true;
			return isForma;
		}else{
			return isForma;			
		}
		
	}

	public void setForma(boolean isForma) {
		this.isForma = isForma;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		if (dni!=0) {
			this.dni = dni;			
		}
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public boolean isVotante() {
		this.isVotante= false;
		if (this.edad >= VOTANTE) {
			this.isVotante = true;
			return this.isVotante;
		}else{
			return this.isVotante;
		}
	}
	
	

}