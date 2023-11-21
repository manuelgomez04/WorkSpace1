package ejercicio09;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Random rnd = new Random (System.nanoTime());
		Scanner sc = new Scanner (System.in);
		int decimo, desde = 1,hasta = 999999, opcion;
		String aux;
		Sorteo s1; 
		
		do {
			
			System.out.println("""
					1 ---> Comprar un décimo elegido por usted
					2 ---> Comprar un décimo generado aleatoriamente
					0 ---> Salir
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
				case 1:
					System.out.println("Diga el número del décimo que desea.");
					aux= sc.nextLine();
					decimo = Integer.parseInt(aux);
					while (decimo < 1 || decimo > 99999) {
						System.out.println("Diga un número que sea válido");
						aux = sc.nextLine();
						decimo = Integer.parseInt(aux);
					}
					s1 = new Sorteo();
					
					System.out.println("Se procede a realizar el sorteo.");
					
					s1.mostrarSorteo(hasta, desde);
					s1.mostrarGanador(hasta,desde, decimo);
				break;
				
				case 2 : 
					decimo = rnd.nextInt(hasta-desde+1)+desde;
					
					s1 = new Sorteo();
					s1.generarDecimoAleatorio(hasta, desde);
					s1.mostrarDecimoAleatorio(hasta, desde, decimo);
					
					System.out.println("Se procede a realizar el sorteo.");
					
					s1.mostrarSorteo(hasta, desde);
					s1.mostrarGanador(hasta, desde, decimo);
				break;
				
				default:
					System.out.println("Inserte un dato válido");
				break;
			}			

		} while (opcion!=0);
	}

}
