package claseInterfaces;

import java.util.ArrayList;

public class ColaEspera {
	
	private ArrayList<ElementoCola>elementos;
	
	public ColaEspera() {
		this.elementos = new ArrayList<>();
	}
	
	public ElementoCola getSiguiente(){
		if(tieneElementos()){
			return elementos.remove(0);
		}else{
			return null;
		}
	}
	public boolean tieneElementos(){
		return !elementos.isEmpty();
	}
	
	public void addElemento(ElementoCola elemento){
		boolean inserto = false;
		int i =0;
		
		while(!inserto && i < elementos.size()){
				if(elemento.esMayor(elementos.get(i))){
					//Mientras la cpu tenga una velocidad menor voy a ir avanzamdo. 
					//Entonces cuando encuentro una velocidad mayor ahi corto y:
					elementos.add(i, elemento);				
					inserto = true;
				}
				i++;
			}
		if(!inserto){
			elementos.add(elemento);
		}	
	}
}
