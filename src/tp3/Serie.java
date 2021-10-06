package tp3;

public class Serie {
	private Temporada[] temporadas;
	private String titulo;
	private String descripcion;
	private String nombreCreador;
	private String genero;
	
	public Serie(String titulo, String descripcion,String nombreCreador, String genero,int cantTemp) {
		Temporada temp=new Temporada(cantTemp);
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.nombreCreador = nombreCreador;
		this.genero = genero;
	}

	public void cantTempo(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	/**
	 *public int totalEpiVistos(){
		int contador=0;
		for(int i=0;i<this.temporadas.length;i++){
				contador=+temporadas[i].epiVistosTemp();
		}
			return contador;
		}
	

	public Temporada[] getTemporadas() {
		return temporadas;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getNombreCreador() {
		return nombreCreador;
	}

	public String getGenero() {
		return genero;
	}

	public int cantTempo(){
		return temporadas.length;
	}

	public void setTemporadas(int cantTemp) {
		this.temporadas.length=this.temporadas.length+cantTemp ;
	} 
	 **/
	
}