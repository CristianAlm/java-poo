package tp3;

public class Punto_geometrico {
	private double x;
	private double y;

	public Punto_geometrico(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		String msg="La x="+this.getX()+"y la y="+this.getY();
		return msg;	
	}
	public double getDistancia(double x2,double y2){
		double distancia;
		distancia=Math.sqrt(((this.x-x2)*(this.x-x2))+((this.y-y2)*(this.y-y2)));
		return distancia;	
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}	
	public void setX(double x) {
		this.x = x;
	}	
	public void setY(double y) {
		this.y = y;
	}
	public double setDesX(double des) {
		this.x = this.x+des;
		return this.x-des;
	}	
	public double setDesY(double des) {
		this.y = this.y+des;
		return this.y-des;
	}
}
