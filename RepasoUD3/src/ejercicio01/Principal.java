package ejercicio01;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, nombre;
		double pFabrica;
		int seccion;
		boolean activo;
		int activoo, opcion, tam = 15;
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
				
				
				
				t = new Tienda(lista, 5);
				t.agregar(new Producto (nombre, pFabrica, seccion, activo));
				
				System.out.println("1 para salir, cualquier número para seguir");
				aux = sc.nextLine();
				opcion = Integer.parseInt(aux);
				
				} while (opcion != 1 && t.getNumProduct()< lista.length );
				break;
				
			case 0 :
				System.out.println("Gracias por usar un programa");
			break;
			
			default:
				break;
			}
			
			
		} while (opcion != 0);
	
		
	}

}
