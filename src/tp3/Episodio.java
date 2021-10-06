package tp3;

public class Episodio {
	
	private final int MAX = 5;
	private final int MIN = 1;
	
	private String titulo;
	private String descripcion;
	private boolean seVio;
	private int calificacion;
	
	public Episodio(String titulo, String descripcion){
		this.titulo =titulo;
		this.descripcion = descripcion;
		this.seVio=false;
		this.calificacion=-1;
	}

	public Episodio(String string, String string2, boolean respuesta, int calificacion) {
		this.titulo =titulo;
		this.descripcion = descripcion;
		this.seVio=false;
		this.calificacion=-1;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isSeVio() {
		if (this.calificacion!=-1){
			return true;
		}
		return false;
	}

	public void setSeVio(boolean seVio) {
		this.seVio = seVio;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		if((calificacion >=MIN)&&(calificacion<=MAX)){
			this.calificacion = calificacion;
		}else{
			System.out.println("El valor de calificacion ingresad fue incorrecto");
		}
	}
	

}