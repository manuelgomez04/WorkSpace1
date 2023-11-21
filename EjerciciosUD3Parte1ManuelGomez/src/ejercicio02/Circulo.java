package ejercicio02;

public class Circulo {

	private double radio;
	
	
	public Circulo () {
		
	}
	
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	
	public double calcularArea () {
		int cuadrado=2;
		double area;
		area=Math.PI * Math.pow(radio, cuadrado); 
		return area;
	}
	
	public double convertirAM2 (double area) {
		double conversion= 10000;
		return area/conversion;
	} 
	
	/*
	public void mostrarArea (double area) {
		System.out.printf("El área del círculo será %.2f m^2",area);
		
	} */
}
