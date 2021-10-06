package clase02;

public class Juego1 {
	
	private int puntosJugador1;
	private int puntosJugador2;
	
	private int MIN;
	private int cantCaras;
	private int cantRondas;
	
	public Juego1(){//El constructor siempre el es mismo nombre y no tiene valor de retorno
		this.puntosJugador1=0;//En este caso le da valor a los numeros en el constructor
		this.puntosJugador2=0;//This es para marcar el atributo del objeto
		MIN =7;	
	}
	
	public Juego1(int MIN){
		this.puntosJugador1=0;
		this.puntosJugador2=0;
		
		this.MIN = MIN;//Con el this lo busca en el objeto
		
	}
	
	public Juego1(int MIN, int cantCaras){
		this.puntosJugador1=0;
		this.puntosJugador2=0;
		this.cantCaras=cantCaras;
		this.MIN = MIN;//Con el this lo busca en el objeto
		
	}
	
	public int getPuntosJugador1(){
		return puntosJugador1;
	}
	
	public int getPuntosJugador2(){
		return puntosJugador2;	
	}
	
	private int tirarDado(){//privado porque no quiero que nadie pueda tirar el dado fuera de Juego
		return (int)((Math.random()*6)+1);
	}
	
	public String ganador(){
		if(puntosJugador1>puntosJugador2){
			return "Jugador 1";
		}else if (puntosJugador2>puntosJugador1) {
			return "Jugador 2";
		}else{
			return "Empate";
		}
	}
	
	public String jugar(){
		int puntos1;
		int puntos2;
		for (int i = 0; i < 10; i++) {
			puntos1= this.tirarDado() + this.tirarDado();
			puntos2= this.tirarDado() + this.tirarDado();
			
			if ((puntos1>MIN)&&(puntos1>puntos2)) {
				puntosJugador1++;
			}else{
				if ((puntos2>MIN)&&(puntos2>puntos1)) {
					puntosJugador2++;
				}
			}
		}
		return this.ganador();
	}
}