package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nombreAsig, aula, fecha;
		Cabecera cabecera1;
		
		System.out.println("Diga la fecha del día de hoy en formato dd-mm-aaaa");
		fecha=sc.nextLine();
		
		System.out.println("Diga la asignatura");
		nombreAsig=sc.nextLine();
		
		System.out.println("Diga el aula en que se realizará la prueba");
		aula=sc.nextLine();
		
		cabecera1 = new Cabecera (fecha, nombreAsig, aula);
		
		cabecera1.mostrarCabecera();
		
	}

}
