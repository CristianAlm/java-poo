package tp3;

import java.time.LocalDate;

public class mainGeneral {

	public static void main(String[] args) {

		//Persona d1 = new Persona(38612222,LocalDate.of(2000,1,1),'M',"poyy","smoes",75,1.97);
		//Electrodomestico e1 = new Electrodomestico("notebook", 100000, "negro", 20, 2.47);
		Punto_geometrico p1 = new Punto_geometrico(2,2);
		Punto_geometrico p2 = new Punto_geometrico(10,2);
		Punto_geometrico p3 = new Punto_geometrico(2,6);
		Punto_geometrico p4 = new Punto_geometrico(10,6);
		Rectangulo r1 = new Rectangulo(p1,p2,p3,p4);
		Rectangulo r2 = new Rectangulo(p1,p2,p3,p4);
		
		/*
		System.out.println(d1.toString());
		System.out.println("-------------------");
		System.out.println(e1.toString());
		System.out.println("-------------------");
		System.out.println(p1.toString());
		System.out.println("--------Distancia p1 y p2 original-----------");
		System.out.println(p1.getDistancia(p2.getX(),p2.getY()));
		System.out.println("--------Distancia Desplazamiento de p1-----------");
		System.out.println(p1.getDistancia(p1.setDesX(4),p1.setDesY(5)));
		System.out.println("--------Distancia p1 nuevo y p2-----------");
		System.out.println(p1.getDistancia(p2.getX(),p2.getY()));
		System.out.println("-------------------");
		
		System.out.println(r1.getLado1());
		System.out.println("-------------------");
		System.out.println(r1.getLado2());
		 */
		
		System.out.println("-------------------");
		System.out.println(r1.traerArea());
		System.out.println("-------------------");
		System.out.println(r2.traerArea());
		System.out.println("-------------------");
		System.out.println(r1.verArea(r2.traerArea()));
		System.out.println("-------------------");
		System.out.println(r1.verCuadrado());
	}

	

}