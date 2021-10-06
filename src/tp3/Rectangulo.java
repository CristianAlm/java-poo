package tp3;

public class Rectangulo {
	
	private Punto_geometrico v1;
	private Punto_geometrico v2;
	private Punto_geometrico v3;
	private Punto_geometrico v4;
	private double lado1;
	private double lado2;
	private double lado3;
	private double lado4;
	
	public Rectangulo(Punto_geometrico v1,Punto_geometrico v2,Punto_geometrico v3,Punto_geometrico v4){
		
		if (v1.getX()==v3.getX() && v1.getY()==v2.getY() && v2.getX()==v4.getX() && v3.getY()==v4.getY()) {
		
			this.v1 = v1;
			this.v2 = v2;
			this.v3 = v3;
			this.v4 = v4;
		
			this.lado1 = v1.getDistancia(v3.getX(),v3.getY());
			this.lado2 = v1.getDistancia(v2.getX(),v2.getY());
			this.lado3 = this.lado1;
			this.lado4 = this.lado2;
			
		}
		else{
			System.out.println(toString("Rectangulo invalido"));
		}
	}
	
	public boolean verCuadrado() {
		return lado1==lado2;
	}
	
	public double verArea(double area){
		if (this.traerArea() > area) {
			return -1;
		}else if(this.traerArea() == area){
			return 0;
		}else return 1;
	}
	
	public double traerArea(){
		return (this.lado1 * this.lado2);	
	}
	
	public String toString(String msj){
		String mensaje = "error:"+msj;
		return mensaje;
	}

	public void desplazarRectanguloX(double des){
		v1.setDesX(des);
		v2.setDesX(des);
		v3.setDesX(des);
		v4.setDesX(des);
	}
	public void desplazarRectanguloY(double des){
		v1.setDesY(des);
		v2.setDesY(des);
		v3.setDesY(des);
		v4.setDesY(des);
	}
	public void desplazarRectangulo(double desX,double desY){
		desplazarRectanguloX(desX);
		desplazarRectanguloY(desY);
	}

	public Punto_geometrico getV1() {
		return v1;
	}

	public void setV1(Punto_geometrico v1) {
		this.v1 = v1;
	}

	public Punto_geometrico getV2() {
		return v2;
	}

	public void setV2(Punto_geometrico v2) {
		this.v2 = v2;
	}

	public Punto_geometrico getV3() {
		return v3;
	}

	public void setV3(Punto_geometrico v3) {
		this.v3 = v3;
	}

	public Punto_geometrico getV4() {
		return v4;
	}

	public void setV4(Punto_geometrico v4) {
		this.v4 = v4;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public double getLado4() {
		return lado4;
	}

	public void setLado4(double lado4) {
		this.lado4 = lado4;
	}
}
