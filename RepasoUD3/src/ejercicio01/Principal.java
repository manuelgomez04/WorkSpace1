package ejercicio01;

import java.util.Scanner;

/**
 * @author gomez.maman24_triana
 * @see fdghklsdjfklhgsdñkjlfdgklsjx
 */

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String aux, nombre;
		double pFabrica, porcentaje, porcGanan;
		int seccion;
		boolean activo;
		int activoo, opcion, pos, tam = 15, id = 1, numProduct = 0, numTrab = 5;
		Tienda t;

		Producto p;
		Producto lista[] = new Producto[tam];
		t = new Tienda(lista, numProduct, numTrab);

		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Rellenar productos
					2 ---> Mostrar productos
					3 ---> Mostrar por sección
					4 ---> Calcular PVP
					5 ---> Cambiar precio de una categoría
					6 ---> Calcular descuento
					7 ---> "Eliminar" una seccion
					8 ---> Mostrar solo activos
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);

			switch (opcion) {
			case 1:
				System.out.println("Diga el nombre del producto");
				nombre = sc.nextLine();

				System.out.println("Diga el precio de fábrica");
				aux = sc.nextLine();
				pFabrica = Double.parseDouble(aux);

				System.out.println("Diga seccion");
				aux = sc.nextLine();
				seccion = Integer.parseInt(aux);

				System.out.println("Diga si está en venta 1 para sí, 0 para no");
				aux = sc.nextLine();
				activoo = Integer.parseInt(aux);
				if (activoo == 1) {
					activo = true;
				} else {
					activo = false;
				}

				p = new Producto(nombre, pFabrica, seccion, activo, id);
				id++;

				t.agregar(p);
				break;

			case 2:
				t.mostarListaNoNull(lista);
				break;
			case 3:
				System.out.println("Diga la sección que desea ver");
				aux = sc.nextLine();
				seccion = Integer.parseInt(aux);

				t.mostarListaNoNull(t.buscarBySeccion(seccion));
				break;

			case 4:
				System.out.println("Diga la id del producto");
				aux = sc.nextLine();
				pos = Integer.parseInt(aux);

				System.out.println("Diga el porcentaje de ganancias que deseas tener");
				aux = sc.nextLine();
				porcGanan = Double.parseDouble(aux);

				t.PVP(pos, porcGanan);
			case 5:
				System.out.println("Diga sección");
				aux = sc.nextLine();
				seccion = Integer.parseInt(aux);

				System.out.println("Diga nuevo precio");
				aux = sc.nextLine();
				pFabrica = Double.parseDouble(aux);

				t.modificarPrecioSeccion(seccion, pFabrica);
				break;

			case 6:

				System.out.println("Diga el descuento que desea");
				aux = sc.nextLine();
				porcentaje = Double.parseDouble(aux);

				System.out.println("Diga el porcentaje de ganancias");
				aux = sc.nextLine();
				porcGanan = Double.parseDouble(aux);

				System.out.println("Diga la id del producto");
				aux = sc.nextLine();
				pos = Integer.parseInt(aux);

				t.hacerDescuento(porcentaje, id, porcGanan);

				break;

			case 7:
				System.out.println("Diga sección");
				aux = sc.nextLine();
				seccion = Integer.parseInt(aux);

				t.categoriaInactiva(seccion);
				break;

			case 8:
				t.mostrarActivos();
				break;
			}

			;
		} while (opcion != 0);

	}

}
