package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux;
		Double radio, area;
		Circulo circulo1;
		
		
		System.out.println("Diga el radio del círculo en cm");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		circulo1 = new Circulo (radio);
		
		System.out.println();
		
		area=circulo1.convertirAM2(circulo1.calcularArea());
		
		//circulo1.mostrarArea(area);
		
		System.out.printf("El área en m^2 es: %.8f ",circulo1.convertirAM2(area) );
		
		
	}

}
