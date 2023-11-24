package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, fecha , contrasena;
		int numPers, opcion, opcion2;
		double precioUnitario  = 1.50, pagado;
		Ticket billete;
		Maquina maq1 = new Maquina ();
		Maquina maqSuma = new Maquina ();
		Ticket billete2 = new Ticket (precioUnitario);
		//EL PRECIO TOTAL PODRÍA HACERSE COMO STATIC
	
		System.out.println("Bienvenido al metro.");
		System.out.println();
		System.out.println("Diga fecha de hoy (DD/MM/YYYY)");
		fecha = sc.nextLine();
		
		do {
			System.out.println();
			System.out.println("""
				0 ---> Salir
				1 ---> Comprar Ticket
				2 ---> Operaciones operario
				""");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
			switch (opcion) {
			case 1:
				System.out.println("Diga número de personas");
				aux= sc.nextLine();
				numPers = Integer.parseInt(aux);
				
				billete = new Ticket (fecha, precioUnitario, numPers);
				maq1 = new Maquina (billete);
				maq1.mostrarPrecio();
				
				maqSuma.calcTotal();
				
				 System.out.println();
				 System.out.println(billete.toString());
				
				System.out.println();
				System.out.println("Diga la cantidad que le han dado");
				aux = sc.nextLine();
				pagado = Double.parseDouble(aux);
				
				
				while (pagado < maq1.calcPrecio()) {
					System.out.println("Cantidad insuficiente");
					System.out.println("Diga cantidad correcta");
					aux = sc.nextLine();
					pagado = Double.parseDouble(aux);
				}
				maq1.mostrarCambio(pagado);
				
			break;
			
			case 2:
				System.out.println("Ingrese contraseña por favor");
				contrasena = sc.nextLine();
				maq1.comprobarContrasena(contrasena);
				
				while (maq1.compararContrasena(contrasena) == false) {
					System.out.println("Contraseña incorrecta, prueba de nuevo");
					contrasena = sc.nextLine();
				}
				
				do {
					System.out.println();
					System.out.println("""
							0 ---> Salir
							1 ---> Consultar el total recaudado en el día
							2 ---> Para poner a 0 el contador
							3 ---> Para cambiar el precio del ticket 
							""");
					aux =sc.nextLine();
					opcion2=Integer.parseInt(aux);
					
					switch (opcion2) {
					case 1:
						maqSuma.mostrarTot();
					break;
					case 2: 
						maqSuma.restTot0();
						System.out.println("El saldo se ha restablecido a 0.");
					break;
					case 3:
						System.out.println("Diga nuevo precio");
						aux = sc.nextLine();
						precioUnitario = Double.parseDouble(aux);
						
						// ESTO HABRÍA QUE METERLO EN UN MÉTODO.
						billete2.setPrecioUnitario(precioUnitario);
						System.out.println(billete2.toString());
					break;
					case 0:
						System.out.println("Que pase un buen día");
					break;
					default:
						System.out.println("Inserte un dato correcto");
					break;
					}
				} while (opcion2 != 0);
			break;
			case 0:
				System.out.println("Gracias por usar el programa");
			break;
			default:
				System.out.println("Inserte un dato correcto");
			break;
			}
	
		} while (opcion != 0);
	}

}
