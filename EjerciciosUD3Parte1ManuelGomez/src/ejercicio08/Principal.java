package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double saldo;
		String nombreCuenta, aux;
		double cantidadIngresar;
		double cantidadRetirar;
		double cambioDolar = 1, cambioEuro = 0.92, saldoDolar = 0;
		int opcion1;
		int opcion2;
		Cuenta c;
		
		System.out.println("*******************************************************");
		System.out.println("Bienvenido a su cuenta de banco");
		System.out.println("*******************************************************");
		
		System.out.println("Ingrese el nombre de su cuenta");
		nombreCuenta = sc.nextLine();
		
		System.out.println("¿Cuanto saldo tiene?");
		aux=sc.nextLine();
		saldo = Integer.parseInt(aux);
		
		c = new Cuenta(nombreCuenta,saldo);
		do {
			System.out.println("1-Ingresar");
			System.out.println("2-Retirar");
			System.out.println("3-Ver saldo en $");
			System.out.println("4-Consultar saldo");
			System.out.println("0-Salir");
			System.out.println("*******************************************************");
			aux = sc.nextLine();
			opcion1 = Integer.parseInt(aux);
			
			switch (opcion1) {
			
				case 1:
					System.out.println("¿Cuánto dinero quiere ingresar en € ?");
					aux = sc.nextLine();
					cantidadIngresar = Integer.parseInt(aux);
					c.ingresarDinero(cantidadIngresar);
					
					System.out.println("*******************************************************");
				break;
					
				case 2:
					System.out.println("¿Cuánto dinero quiere sacar?");
					aux = sc.nextLine();
					cantidadRetirar = Integer.parseInt(aux);
					c.retirarDinero(cantidadRetirar);
					System.out.println("*******************************************************");
				break;
					
				case 3:
					c.cambiarDolar(cambioDolar, cambioEuro, saldoDolar);
					c.mostrarDolar(cambioDolar, cambioEuro, saldoDolar);
					System.out.println("*******************************************************");
				break;
				
				case 4:
					c.consultarSaldo();
					System.out.println("*******************************************************");
				break;
				
				default:
					System.out.println("Opción no disponible");
				break;
			}
		}while (opcion1!=0);


	}

}
