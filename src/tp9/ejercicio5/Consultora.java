package tp9.ejercicio5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Consultora {

	private ArrayList<Candidato> candidatos;
	private ArrayList<OfertaLaboral> trabajos;
	
	
	public Consultora() {
		super();
		this.candidatos = new ArrayList<>();
		this.trabajos = new ArrayList<>();
	}
	
	
	public ArrayList<Candidato> getCandidatos(){
		ArrayList<Candidato> aux= new ArrayList<Candidato>(candidatos);
		return aux;
	}
	
	public ArrayList<Candidato> getCandidatosValidos(OfertaLaboral f1){
		ArrayList<Candidato> aux = new ArrayList <Candidato>();
			for (Candidato c1 : candidatos) {
				if(c1.getCriterioAceptacion().cumple(f1)){
					aux.add(c1);
				}
			}
		return aux;
	}
	
	public ArrayList<Candidato> getCandidatosCon(Filtro f1){
		ArrayList<Candidato> aux = new ArrayList <Candidato>();
			for (Candidato c1 : candidatos) {
				if(f1.cumple(c1)){
					aux.add(c1);
				}
			}
			
		return aux;
	}
	
	public ArrayList<Candidato> getCandidatosConYComp(Filtro f1,Comparator<Candidato> comp){
		ArrayList<Candidato> aux = new ArrayList <Candidato>();
			for (Candidato c1 : candidatos) {
				if(f1.cumple(c1)){
					aux.add(c1);
				}
			}
			Collections.sort(aux, comp);
		return aux;
	}
}
