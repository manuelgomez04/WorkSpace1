package ejercicio01;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, nombre;
		double pFabrica;
		int seccion;
		boolean activo;
		int activoo, opcion, opcion2, tam = 15,  id = 1;
		Tienda t;
		Producto p; 
		Producto lista [] = new Producto [tam];
		
		
		
		do {
			System.out.println("""
					0 ---> Salir
					1 ---> Rellenar productos
					
					""");
			aux  = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			switch (opcion) {
			case 1:
				do {
					
				
				System.out.println("Diga nombre");
				nombre = sc.nextLine();
				
				System.out.println("Diga precio de fábrica");
				aux = sc.nextLine();
				pFabrica = Double.parseDouble(aux);
				
				System.out.println("Diga sección (1 comida, 2 electronica 3 día a día");
				aux = sc.nextLine();
				seccion = Integer.parseInt(aux);
				
				System.out.println("¿Está activo? 1 para sí, 2 para no");
				aux = sc.nextLine();
				activoo = Integer.parseInt(aux);
				if (activoo == 1) {
					activo = true;
				}else {
					activo = false;
				}

				id++;
				
				t = new Tienda(lista, 5);
				t.agregar(new Producto (nombre, pFabrica, seccion, activo, id));
				
				System.out.println("0 para salir, cualquier número para seguir");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				
				} while (opcion != 0 && t.getNumProduct()< lista.length );
				
				do {
					
				
				
					System.out.println("""
							1 ---> Mostrar lista
							2 ---> Buscar por seccion
							""");
					aux = sc.nextLine();
					opcion2 = Integer.parseInt(aux);
					
					switch (opcion2) {
					
					
						case 1:
							t.mostrar();
						break;
						
						case 2: 
							System.out.println("Diga seccion");
							aux = sc.nextLine();
							seccion = Integer.parseInt(aux);
							
							t.mostarListaNoNull(t.buscarBySeccion(seccion));
						 
						default:
						break;
					}
				
				} while (opcion2 != 0);
				break;
				
			case 0 :
				
				System.out.println("Gracias por usar el programa");
				
			break;
			
			default:
				break;
			}
			
			
		} while (opcion != 0);
	
		
	}

}
