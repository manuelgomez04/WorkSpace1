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

		int opcion, opcion2, tam = 15, numPisos = 0, superficie, estado, estadoBuscar, numTrabajadores = 5;
		int id = 0, idBuscar;
		double precioVenta, nuevoPrecio, porcentaje;
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
					5 ---> Calcular precio final de venta
					6 ---> Calcular precio por metro cuadrado
					7 ---> Calcular ganancias de ventas de seminuevo
					8 ---> Calcular ganancia por vendedor

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
				System.out.println("Diga de que estado quiere obtener el listado");
				aux = sc.nextLine();
				estadoBuscar = Integer.parseInt(aux);

				im.mostrarLista(im.obtenerSeccion(estadoBuscar));

				break;

			case 4:
				System.out.println("Diga el ID del piso que desea modificar");
				aux = sc.nextLine();
				idBuscar = Integer.parseInt(aux);

				System.out.println("Diga nuevo precio");
				aux = sc.nextLine();
				nuevoPrecio = Double.parseDouble(aux);

				im.modificarPrecio(nuevoPrecio, idBuscar);

				break;

			case 5:
				System.out.println("Diga el ID del piso del que desea conocer el precio final de venta");
				aux = sc.nextLine();
				idBuscar = Integer.parseInt(aux);

				System.out.println("Diga el porcentaje de ganancias que desea tener");
				aux = sc.nextLine();
				porcentaje = Double.parseDouble(aux);

				System.out.printf("El precio final del piso será %.2f€",
						im.calcularPrecioFinalVenta(idBuscar, porcentaje));
				System.out.println();

				break;

			case 6:
				System.out.println("Diga el ID del piso del que desea conocer el precio por metro cuadrado");
				aux = sc.nextLine();
				idBuscar = Integer.parseInt(aux);

				System.out.println("Diga el porcentaje de ganancias que quiere obtener");
				aux = sc.nextLine();
				porcentaje = Double.parseDouble(aux);

				im.calcMetroCuadrado(idBuscar, porcentaje);

				break;

			case 7:

			default:
				break;
			}

		} while (opcion != 0);

	}

}
