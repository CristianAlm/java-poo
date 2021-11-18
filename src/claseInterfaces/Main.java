package claseInterfaces;

public class Main {

	public static void main(String[] args) {
		CentroComputo compartido = new CentroComputo();
		
		Computadora compu1 = new Computadora(4760.0, "lab1");
		Computadora compu2 = new Computadora(8460.0, "lab2");
		Computadora compu3 = new Computadora(9960.0, "lab3");
		
		compartido.addComputadoras(compu1);
		compartido.addComputadoras(compu2);
		compartido.addComputadoras(compu3);
		
		
		
	}

}
