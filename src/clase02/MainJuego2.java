package clase02;

public class MainJuego2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador j1 = new Jugador("Cristian");
		Jugador j2 = new Jugador("Rafael");
		Dado d1 = new Dado(6);
		Dado d2 = new Dado(15);
		
		Juego2 juegoDados = new Juego2(j1,j2, 50, 7, d1, d2);
		
		Jugador ganador = juegoDados.jugar();
		
		if (ganador != null) {
			System.out.println("Gano : " + ganador.getNombre() + " : " + ganador.getPuntos());
		}else{
			System.out.println("Empate");
		}
	}

}