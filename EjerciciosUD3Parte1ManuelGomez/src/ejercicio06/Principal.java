package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int  opcion, hasta, desde, primitiva = 6, num, numChino, sumaChino, sumChino, num1;
		boolean resul;
		String aux;
		Generadora gen1 = new Generadora ();
		Generadora gen2 = new Generadora();
		Generadora gen3 = new Generadora ();

		
		do {
			
			System.out.println("""
					0 --> Salir
					1 --> Jugar a la primitiva
					2 --> Jugar par o impar
					3 --> Jugar a los chinos
					4 --> Jugar a la quiniela
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			
			switch (opcion) {
				case 1:
					System.out.println("Diga en qué número empieza la primitiva");
					aux= sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Diga hasta qué número llega la primitiva");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					
					for (int i = 0; i < primitiva; i++) {
						
						gen1.mostrarPrimitiva(desde,hasta);
					}
					System.out.println();
					
				break;
				case 2: 
					desde = 0;
					hasta = 10;
					
					System.out.println("Diga su número");
					aux=sc.nextLine();
					num1=Integer.parseInt(aux);
					
					resul = gen2.generarParImpar(desde, hasta, num1);
					
					gen2.decirParImpar(resul);
					
				break;
				
				case 3:
					
					System.out.println("Diga en qué número quiere empezar a jugar");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Diga en qué número quiere acabar");
					aux=sc.nextLine();
					hasta= Integer.parseInt(aux);
						
					System.out.println("Diga un número dentro de los límites que eligió antes");
					aux= sc.nextLine();
					numChino=Integer.parseInt(aux);
					
					
					while (numChino > hasta || numChino < desde) {
					
					if (numChino > hasta || numChino < desde) {
						System.out.println("Pon número correcto");
						aux = sc.nextLine();
						numChino = Integer.parseInt(aux);
					}
					
					} 
					
					System.out.println("Su rival eligió número. ¿Cuánto crees que será el el total?");
					aux=sc.nextLine();
					sumaChino=Integer.parseInt(aux);

					sumChino= gen3.sumarChino(hasta, desde, numChino, numChino);
					
					gen3.corregirChino(sumChino, hasta, desde, sumaChino);
	
				break;
				
				case 4:
					
					desde = 1;
					hasta=3;
					
					
					
			default:
				break;
			}
		} while (opcion!=0);
		
		
		// Jugar par o imapr
		
		
		
	}

}
