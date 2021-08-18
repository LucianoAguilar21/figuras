package figuras;

public class Rectangulo {
	
	private double alto, ancho;

	public Rectangulo(double alto, double ancho) {

		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	public double getPerimetro() {
		return this.alto *2 + this.ancho * 2;
	}
	
	public double getArea() {
		return this.alto  * this.ancho ;
	}
}
