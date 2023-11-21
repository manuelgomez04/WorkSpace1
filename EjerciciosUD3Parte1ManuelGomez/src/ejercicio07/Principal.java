package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hasta = 2;
		int desde =1;
		String aux;
		int opcion, op ;
		Caracruz cc1 = new Caracruz ();
		
		System.out.println("Bienvenido al juego de Cara o cruz");
		do {

			System.out.println("""
					***********************
					1 ---> Escoger Cara
					2 ---> Escoger Cruz
					***********************
					""");
			aux=sc.nextLine();
			opcion= Integer.parseInt(aux);
			
			while (opcion != 1 && opcion != 2) {
				
				if (opcion != 1 && opcion != 2) {
					System.out.println("Inserte un dato correcto");
				}
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
				System.out.println("******************************************************");
				
			}
			
			System.out.print("La moneda se ha lanzado. El resultado es: ");
			cc1.mostrarResul(hasta, desde);
			
			System.out.println("******************************************************");
			cc1.decirGanador(opcion, hasta, desde);
			
			System.out.println("""
					******************************************************
					¿Desea seguir jugando?
					
					1 ---> Sí
					0 ---> No
					******************************************************
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			while (op != 0 && op != 1) {
				
				if (op != 0 && op != 0) {
					System.out.println("Inserte un dato correcto");
				}
				aux=sc.nextLine();
				op=Integer.parseInt(aux);
				
			}
				
		} while (op != 0);
		System.out.println("******************************************************");
		System.out.println("Gracias por usar el programa");
		System.out.println("******************************************************");
	} 

}
