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
	/* 10.Este programa tendría otra serie de clases, pero por simplificar lo haremos solo con 3 clases. Crear un
		programa que simule una máquina vendedora de tickets de metro. Tendremos que crear la clase Ticket
		(Clase POJO), la clase Maquina (donde estarán todos los métodos con funcionalidad) y la clase principal
		de prueba. Tendrá un menú donde se pueda:
		• Comprar uno o varios billetes.
		• Calcular el cambio a devolver.
		• Imprimir por pantalla el billete. Solo uno. Si se han comprado “x” debemos mostrar en el ticket el
		mensaje “válido para x personas”.
		• Opciones de operario: el operario que lleva el mantenimiento de la máquina, debe tener disponible
		un método que le ofrezca el saldo total de la recaudación de la máquina en ese día (no es necesario
		usar fechas) y otro método que pueda poner a cero el contador de saldo total.
		• Dentro de la opción de operario, también debe contar con la posibilidad de cambiar el precio de
		los billetes ya que estos suelen subir todos los años.
		• Las operaciones para el operario se harán solo si se introduce la contraseña adecuada antes de
		cualquier otra cosa, por lo que se debe tener el método comprobar contraseña.
	*/

	// COMPRAR BILLETES tick
		
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
				System.out.println("Diga fecha de hoy");
				fecha = sc.nextLine();
				System.out.println("Diga número de personas");
				aux= sc.nextLine();
				numPers = Integer.parseInt(aux);
				
				billete = new Ticket (fecha, precioUnitario, numPers);
				maq1 = new Maquina (billete);
				maq1.mostrarPrecio();
				
				maqSuma.calcTotal(maq1.calcPrecio());
				
				 System.out.println();
				 System.out.println(billete.toString());
				
				System.out.println();
				System.out.println("Diga la cantidad que le han dado");
				aux = sc.nextLine();
				pagado = Double.parseDouble(aux);
				
				
				while (pagado < maq1.calcPrecio()) {
					System.out.println("Cantidad insuficiente");
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
