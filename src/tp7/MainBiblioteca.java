package tp7;

import java.time.LocalDate;
import java.util.Collections;

public class MainBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Biblioteca b1 = new Biblioteca();
		
		Libro l1 = new Libro("Prestico", LocalDate.of(2010, 3, 5), "humor", "4");
		Libro l2 = new Libro("Shespiere", LocalDate.of(1010, 12, 9), "drama", "3");
		Libro l3 = new Libro("Smoes", LocalDate.of(2015, 11, 5), "cannabis", "1");
		Libro l4 = new Libro("Profe", LocalDate.of(2021,11 , 15), "suspenso", "2");
		
		b1.addLibro(l1);
		b1.addLibro(l2);
		b1.addLibro(l3);
		b1.addLibro(l4);
		
		OrdenarLibroPorAutor o1 = new OrdenarLibroPorAutor();
		OrdenarLibroPorAnio o2 = new OrdenarLibroPorAnio();
		OrdenarLibroPorGenero o3 = new OrdenarLibroPorGenero();
		
		
		OrdenarLibroPorAutor o4 = new OrdenarLibroPorAutor(false);
		OrdenarLibroPorAnio o5 = new OrdenarLibroPorAnio(false);
		OrdenarLibroPorGenero o6 = new OrdenarLibroPorGenero(false);
		
		
		//System.out.println(b1);
		System.out.println("--------Por Autor----------");
		System.out.println(b1.getLibros(o1));
		System.out.println("---------Por Anio---------");
		System.out.println(b1.getLibros(o2));
		System.out.println("--------Por Genero----------");
		System.out.println(b1.getLibros(o3));
		
		
		
		System.out.println("--------Por Autor Desc----------");
		System.out.println(b1.getLibros(o4));
		System.out.println("---------Por Anio Desc---------");
		System.out.println(b1.getLibros(o5));
		System.out.println("--------Por Genero Desc----------");
		System.out.println(b1.getLibros(o6));
		

	}

}
