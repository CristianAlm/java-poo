package clase02;

public class Juego2 {
	
	private Jugador Jugador1;
	private Jugador Jugador2;
	
	private int minimoPuntos;
	private int cantRondas;
	
	private Dado d1;
	private Dado d2;
	
	public Juego2(Jugador j1, Jugador j2, int cantRondas, int minimo, Dado d1, Dado d2){//El constructor siempre el es mismo nombre y no tiene valor de retorno
		Jugador1 = j1;
		Jugador2 = j2;
		this.cantRondas=cantRondas;
		this.minimoPuntos = minimo;
		this.d1 = d1;
		this.d2 = d2;
	}
	
	public int getPuntosJugador1(){
		return Jugador1.getPuntos();
	}
	public Jugador getJugador1(){
		return Jugador1;
	}
	
	public int getPuntosJugador2(){
		return Jugador2.getPuntos();	
	}
	public Jugador getJugador2(){
		return Jugador2;
	}
	
	public Jugador ganador(){
		if(Jugador1.getPuntos() > Jugador2.getPuntos()){
			return Jugador1;
		}else if (Jugador1.getPuntos() < Jugador2.getPuntos()) {
			return Jugador2;
		}else{
			return null;
		}
	}
	
	public Jugador jugar(){
		int puntos1;
		int puntos2;
		for (int i = 0; i < cantRondas; i++) {
			puntos1= Jugador1.tirarDados(d1, d2);
			puntos2= Jugador2.tirarDados(d1, d2);
			if ((puntos1>=minimoPuntos)&&(puntos1>puntos2)) {
				Jugador1.sumarPunto();
			}else{
				if ((puntos2>=minimoPuntos)&&(puntos2>puntos1)) {
					Jugador2.sumarPunto();
				}
			}
		}
		return this.ganador();
	}
}
