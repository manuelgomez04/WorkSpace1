package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int opcion, tam = 15, numPisos = 0, superficie, estado, numTrabajadores = 5;
		int id = 0;
		double precioVenta;
		String aux, direccion;
		Scanner sc = new Scanner(System.in);
		Piso p;
		Piso lista[] = new Piso[tam];
		Inmobiliaria im = new Inmobiliaria(numPisos, lista, numTrabajadores);

		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Agregar Piso a la lista
					2 ---> Mostrar pisos
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Diga la dirección del piso");
				direccion = sc.nextLine();

				System.out.println("Diga la superficie del piso");
				aux = sc.nextLine();
				superficie = Integer.parseInt(aux);

				System.out.println("Diga el precio de venta del piso");
				aux = sc.nextLine();
				precioVenta = Double.parseDouble(aux);

				System.out.println("Diga estado 1 nuevo, 2 seminuevo, 3 reformar");
				aux = sc.nextLine();
				estado = Integer.parseInt(aux);

				p = new Piso(direccion, superficie, estado, precioVenta, id);
				id++;

				break;

			default:
				break;
			}

		} while (opcion != 0);

	}

}
