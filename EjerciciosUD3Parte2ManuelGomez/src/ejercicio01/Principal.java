package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, nombre, codigo, fechaAlta;
		int fragil, opcion2;
		int tam, seguir, posicion;
		double precioCosto, porcentajeTransporte = 5, porcentajePVP = 10;
		int opcion;
		Producto lista [];
		Tienda t;
	
		
		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Rellenar listado de productos
					""");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
		
			switch(opcion) {
				case 1:
					System.out.println("Diga cuantos productos tendrá su lista");
					aux = sc.nextLine();
					tam = Integer.parseInt(aux);
					
					lista = new Producto [tam];
					t = new Tienda(lista, 0);
					
					do {
						System.out.println("Diga nombre");
						nombre = sc.nextLine();
						
						System.out.println("Diga código");
						codigo = sc.nextLine();
						
						System.out.println("Diga fecha de alta");
						fechaAlta = sc.nextLine();
						
						System.out.println("¿Es frágil el producto? 1 para sí, 0 para no");
						aux = sc.nextLine();
						fragil = Integer.parseInt(aux);
						while (fragil != 1 && fragil !=0) {
							System.out.println("Diga dato correcto");
							aux = sc.nextLine();
							fragil = Integer.parseInt(aux);
						}
						
						System.out.println("Diga el precio de costo del producto");
						aux = sc.nextLine();
						precioCosto = Double.parseDouble(aux);
						
						
						t.agregar(new Producto (precioCosto, nombre, codigo, fechaAlta, fragil));
						
						System.out.println("0 para salir, cualquier número para añadir otro producto");
						aux = sc.nextLine();
						seguir = Integer.parseInt(aux);
						
						
					} while (seguir != 0 && t.getNumProduc()<lista.length);
			
					do {
						System.out.println("""
								0 ---> Salir
								1 ---> Ver todos los productos
								2 ---> Mostrar la cantidad invertida
								3 ---> Calcular el total en caso de vender todos los productos
								4 ---> Mostrar si un producto es o no frágil
								""");
						aux = sc.nextLine();
						opcion2 = Integer.parseInt(aux);
						
						switch(opcion2) {
							case 1:
								t.mostrarProduc(porcentajeTransporte, porcentajePVP);
							break;
							case 2:
								t.calcCantInvertida();
								t.mostrarTotalInvertido();
							break;
							case 3:
								t.calcTot(porcentajePVP);
								t.mostrarTot(porcentajePVP);
							break;
							case 4:
								System.out.println("Diga el producto el cual quiere comprobar");
								aux = sc.nextLine();
								posicion = Integer.parseInt(aux)-1;
								t.comprobarFragil(posicion);
								t.mostrarFragil(posicion);
							break;
							case 0:
								
							break;
							default:
								System.out.println("Inserte dato correcto");
							break;
						}
					} while (opcion2 != 0);
				break;
				
				case 0:
					System.out.println("Gracias por usar el programa");
				break;
				
				default:
					System.out.println("Inserte dato correcto");
				break;
			}
			
		} while (opcion != 0);
	}

}
