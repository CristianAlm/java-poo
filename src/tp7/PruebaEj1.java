package tp7;

public class PruebaEj1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palabra pepe = new Palabra("adjetivo","pepe");
		Palabra lucas = new Palabra("nombre","lucas");
		Palabra xuxa = new Palabra("sustatntivo","xuxa");
		Palabra cris = new Palabra("nombre","cris");
		Palabra neuvi = new Palabra("nombre","nevi");
		Palabra aaaa = new Palabra("nombre","aaaa");
		Palabra zzzz = new Palabra("nombr"
				+ ""
				+ "e","zzzz");

		
		pepe.setSinonimos("asdasd");

		pepe.setSinonimos("asdasd");

		pepe.setSinonimos("asdasd");

		pepe.setSinonimos("eeee");

		pepe.setSinonimos("dddd");

		pepe.setSinonimos("cccccc");

		pepe.setSinonimos("bbbbb");

		pepe.setSinonimos("zzzzz");

		System.out.println(pepe.obtenerSinonimos());
	
		Diccionario dic = new Diccionario();
		
		dic.addPalabra(pepe);
		dic.addPalabra(lucas);
		dic.addPalabra(xuxa);
		dic.addPalabra(neuvi);
		dic.addPalabra(cris);
		dic.addPalabra(aaaa);
		dic.addPalabra(zzzz);
		System.out.println(pepe);
		System.out.println(dic.getArrayIn(aaaa, zzzz));

	
	
	
	
	
	}

}
