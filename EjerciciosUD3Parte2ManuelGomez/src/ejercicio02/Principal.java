package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String aux, nombreCliente;
		boolean ocupada, limpia, servicioExtra;
		int auxx, codigo, opcion;
		double precioBase = 100 ;
		int diasContratados, tipo, tam = 5, seguir, numHab = 0;
		double porcentajeSuit = 20, porcentajeDoble = 5, porcentajeSuitJunior = 10, porcentajeExtra = 5, porcentajeMiniBar  = 3;
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
		System.out.println("""
				0 ---> Salir
				1 ---> Rellenar habitaciones
				""");
		aux = sc.nextLine();
		opcion = Integer.parseInt(aux);
		
		switch (opcion) {
			case 1:
				do {
					
					
					System.out.println("Diga que tipo de habitación quiere (1 Simple, 2 Doble, 3 Suit 4 Suit Junior.");
					aux = sc.nextLine();
					tipo = Integer.parseInt(aux);
					
					System.out.println("Diga nombre");
					nombreCliente = sc.nextLine();
					
					System.out.println("Cuántos días");
					aux = sc.nextLine();
					diasContratados = Integer.parseInt(aux);
					
					System.out.println("¿Servicio extra? 1 para sí, 2 para no");
					aux = sc.nextLine();
					auxx= Integer.parseInt(aux);
					while (auxx != 1 && auxx != 2) {
						System.out.println("Diga un número correcto");
						aux = sc.nextLine();
						auxx=Integer.parseInt(aux);
					}
					if (auxx == 1) {
						servicioExtra = true;
					} else {
						servicioExtra = false;
					}
					
					System.out.println("¿Está limpia? 1 para sí, 2 para no");
					aux = sc.nextLine();
					auxx= Integer.parseInt(aux);
					while (auxx != 1 && auxx != 2) {
						System.out.println("Diga un número correcto");
						aux = sc.nextLine();
						auxx=Integer.parseInt(aux);
					}
					if (auxx == 1) {
						limpia = true;
					} else {
						limpia = false;
					}
					
					System.out.println("¿Ocupada? 1 para sí, 2 para no");
					aux = sc.nextLine();
					auxx= Integer.parseInt(aux);
					while (auxx != 1 && auxx != 2) {
						System.out.println("Diga un número correcto");
						aux = sc.nextLine();
						auxx=Integer.parseInt(aux);
					}
					if (auxx == 1) {
						ocupada = true;
					} else {
						ocupada = false;
					}
					
					System.out.println("Diga código");
					aux = sc.nextLine();
					codigo = Integer.parseInt(aux);
					
					System.out.println("Cualquier número para añadir otro producto, 0 para salir");
					aux = sc.nextLine();
					seguir = Integer.parseInt(aux);
					
					h = new Habitacion (tipo,precioBase,servicioExtra,nombreCliente,diasContratados,limpia,ocupada,codigo);
					ho.agregar(h);
					
				} while (seguir!= 0&& numHab < lista.length);
				
				do {
					System.out.println("""
							0 ---> Salir
							1 ---> Ver si la habitación está o no ocupada
							2 ---> Calcular el precio final de la habitación
							3 ---> Mostrar Factura
							""");
					aux = sc.nextLine();
					opcion = Integer.parseInt(aux);
					
					switch(opcion) {
						case 1:
							System.out.println("Diga que producto desea buscar");
							aux = sc.nextLine();
							codigo = Integer.parseInt(aux);
							ho.findByIdV2(codigo);
							
							ho.mostrarOcupada(ocupada, codigo);
						break;
						
						case 2:
							System.out.println("Diga que producto desea buscar");
							aux = sc.nextLine();
							codigo = Integer.parseInt(aux);
							ho.findByIdV2(codigo);
							ho.calcPrecioFinalTotal(codigo, servicioExtra, porcentajeSuit, porcentajeDoble, porcentajeSuitJunior, porcentajeExtra, diasContratados);
							ho.mostrarPrecioFinalTotal(codigo, servicioExtra, porcentajeSuit, porcentajeDoble, porcentajeSuitJunior, porcentajeExtra, diasContratados);
						break;
						
						case 3:
							System.out.println("Diga que producto desea buscar");
							aux = sc.nextLine();
							codigo = Integer.parseInt(aux);
							ho.mostrarFactura(codigo, servicioExtra, porcentajeSuit, porcentajeDoble, porcentajeSuitJunior, porcentajeExtra, diasContratados);
							
						break;
					}
					
				} while (opcion != 0); 
			break;
			
			
		default:
			break;
		}
		
	} while (opcion != 0);	
	
		
		
		
		
	
		
		
		
	}

}
