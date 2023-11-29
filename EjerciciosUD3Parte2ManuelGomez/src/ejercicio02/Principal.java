package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String aux, nombreCliente;
		boolean ocupada, limpia, servicioExtra;
		double precioBase ;
		int diasContratados, tipo, tam = 5;
		double porcentajeSuit = 20, porcentajeDoble = 5, porcentajeSuitJunior = 10;
		Habitacion h;
		Habitacion lista [] = new Habitacion [tam];
		Hotel ho = new Hotel(lista,0);
		
	/*2. Estoy en crisis. He pensado en alquilar las habitaciones de mi casa, pero estilo hotel para que tenga caché.
	Debemos gestionar mi “minihotel” y para ello, debemos crear la clase Habitación, una clase Hotel con una
	lista de Habitaciones y una clase principal de prueba para gestionar el hotel (realmente habría algunas clases
	más, como serían Cliente, Productos, etc. Pero no entraremos en eso).
	Podemos poner todos los métodos en la clase Hotel. Se podrá hacer lo siguiente:
	- Agregar una habitación a la lista (cuyos atributos serán tipo, precio, qué servicios extra tiene, String con el
	nombre de cliente asignado, número de días contratados, si está limpia, etc.)
	- Ver si está ocupada o no.
	- Calcular precio final según número de días, servicios extra contratados y consumo del minibar.
	- Mostrar factura.
	- Aquellos métodos que se quieran añadir.
	- Crear un main de prueba.*/
		
	do {
		
		
		System.out.println("Diga que tipo de habitación quiere (1 Simple, 2 Doble, 3 Suit 4 Suit Junior.");
		aux = sc.nextLine();
		tipo = Integer.parseInt(aux);
		
		System.out.println("Diga nombre");
		nombreCliente = sc.nextLine();
		
		System.out.println("Cuántos días");
		aux = sc.nextLine();
		diasContratados = Integer.parseInt(aux);
		
		System.out.println("Diga precio base");
		aux = sc.nextLine();
		precioBase = Double.parseDouble(aux);
		
		System.out.println("¿Servicio extra?");
		aux = sc.nextLine();
		servicioExtra=Boolean.parseBoolean(aux);
		
		System.out.println("¿Está limpia?");
		aux = sc.nextLine();
		limpia= Boolean.parseBoolean(aux);
		
		System.out.println("¿Ocupada?");
		aux = sc.nextLine();
		ocupada = Boolean.parseBoolean(aux);
		
	} while (servicioExtra);
		
		h = new Habitacion (tipo,precioBase,servicioExtra,nombreCliente,diasContratados,limpia,ocupada);
		ho.agregar(h);
		ho.calcPrecioFinal(h, tipo, porcentajeSuit, porcentajeDoble,porcentajeSuitJunior );
		ho.mostrarPrecioFinal(h, tipo, porcentajeSuit, porcentajeDoble, porcentajeSuitJunior);
	}

}
