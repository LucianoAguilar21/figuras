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
	
	
	
}
