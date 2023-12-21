package ejercicio;

import java.util.Scanner;
 /**
  * @author Manuel Gomez
  * @version 0.2
  * @since 0.1
  * @see 
  * 
  */

public class Principal {
 
	public static void main(String[] args) {

		int opcion, opcion2, tam = 15, numPisos = 0, superficie, estado, numTrabajadores = 5;
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
					2 ---> Mostrar todos los pisos
					3 ---> Mostrar solo los nuevos
					4 ---> Modificar precio de venta
					5

					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				if (id <= lista.length) {

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

					im.agregarPiso(p);
				}

				break;

			case 2:
				im.mostrarLista(lista);
				System.out.println();

				break;

			case 3:

				im.mostrarLista(im.obtenerNuevos());

				break;

			case 4:

				break;

			default:
				break;
			}

		} while (opcion != 0);

	}

}
