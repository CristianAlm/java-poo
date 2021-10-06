package tp3;

public class Temporada {
	private Episodio[] episodios;
	
	public Temporada(int cantEpi){
		Episodio epi1 = new Episodio("patito", "cuak", false, 4);
		
	}	
	
	public int epiVistosTemp(){
		int contador=0;
		for(int i=0;i<this.episodios.length;i++){
			if(episodios[i].isSeVio()){
				contador++;
			}
		}
		return contador;
	}
	
	public int cantEpisodios(){
		return episodios.length;
	}

	
}