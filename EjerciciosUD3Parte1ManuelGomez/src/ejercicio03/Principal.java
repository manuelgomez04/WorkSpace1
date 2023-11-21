package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux;
		int opcion, num, dos=2, cero=0;
		Operaciones op1, op2;
		
		
		do {
			System.out.println("""
					***************************************************************************************
					0 - Salir 
					1 - Decir si el número es par o impar
					2 - Decir si el número es positivo o negativo
					
					***************************************************************************************
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch (opcion) {
				case 1:
					System.out.println("Diga número para comprobar si es par o impar");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					op1 = new Operaciones ();
					
				//	op1.mostrarParOImpar(num, dos);
				break;
				
				case 2: 
					
					System.out.println("Diga número para comprobar si es positivo o negativo");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					op2 = new Operaciones ();

				//	op2.mostrarPositivoONegativo(num, cero);
				break;
				
				case 0:
					System.out.println("Gracias por usar el programa");
				break;
				
			default:
				System.out.println("Inserte una opción correcta");
				break;
			}
			
		} while (opcion!=0);
		
		
		
		
		
			
			
	
	}

}
