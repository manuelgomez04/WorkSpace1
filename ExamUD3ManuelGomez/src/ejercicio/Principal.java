package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		
		String aux, nombre, apellidos;
		int categoria, seguir, dorsal, tam = 5, numCorredores = 0, factorConversion = 60, op;
		double tiempo, longitud;
		Corredor lista [] = new Corredor [tam];
		Corredor c;
		Carrera ca;
		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Rellenar participantes
					""");
			aux = sc.nextLine();
			op = Integer.parseInt(aux);
			
			switch (op) {
				case 1:
					do {
						System.out.println("Diga nombre");
						nombre = sc.nextLine();
						
						
						System.out.println("Diga apellidos");
						apellidos = sc.nextLine();
						
						System.out.println("Diga dorsal");
						aux = sc.nextLine();
						dorsal = Integer.parseInt(aux);
						
						System.out.println("""
								Diga categoría
								1 ---> Juvenil
								2 ---> Senior
								3 ---> Veterano
								""");
						aux = sc.nextLine();
						categoria = Integer.parseInt(aux);
						while (categoria != 1 && categoria != 2 && categoria != 3) {
							System.out.println("Diga categoría válida");
							aux = sc.nextLine();
							categoria = Integer.parseInt(aux);
						}
						
						System.out.println("Diga tiempo");
						aux = sc.nextLine();
						tiempo = Double.parseDouble(aux);
						
						System.out.println("Diga la longitud de la carrera en km");
						aux = sc.nextLine();
						longitud = Double.parseDouble(aux);
						
						c = new Corredor (nombre, apellidos, dorsal, categoria, tiempo);
						ca = new Carrera (lista, longitud, numCorredores);
						ca.agregarCorredor(c);
						numCorredores++;
						
						System.out.println("0 para dejar de añadir corredores, cualquier número para seguir");
						aux = sc.nextLine();
						seguir = Integer.parseInt(aux);
						
					} while (seguir != 0 && numCorredores < lista.length);
					
					do {
						System.out.println("""
								0 ---> Salir
								1 ---> Calcular el tiempo en segundos
								2 ---> Mostrar todos los veteranos
								3 ---> Modificar el tiempo de un corredor
								4 ---> Mostrar el total del tiempo de todos los corredores de la categoría Juvenil
								5 ---> Mostrar el corredor que menos ha tardado
								""");
						aux = sc.nextLine();
						op = Integer.parseInt(aux);
						
						switch (op) {
							case 1:
								System.out.println("Diga el dorsal del corredor del que desea conocer el tiempo");
								aux = sc.nextLine();
								dorsal = Integer.parseInt(aux);
								ca.buscarPorDorsal(dorsal);
								
								ca.calcTiempoEnSeg(factorConversion, dorsal);
							break;
							
							case 2 :
								ca.comprobarVeteranos();
							break;
							
							case 3:
								ca.modificarTiempo(dorsal, tiempo);
							break; 
							
							case 4:
								ca.mostrarTot();
							break;
							
							case 5:
								ca.mostrarMenosTiempo();
							break;
							case 0:
								System.out.println("Gracias por usar el programa");
							break;
							default:
								System.out.println("Inserte dato válido");
							break;
						}
					} while (op != 0);
				break;
			
				case 0:
					System.out.println("Gracias por usar el programa");
				break;
				default:
					System.out.println("Inserte dato válido");
				break;
			}
		
		} while (op != 0);

		
	}

}
