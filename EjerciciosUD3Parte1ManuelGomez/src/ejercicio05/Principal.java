package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String frase, aux;
		int num;
		Copiado cp1;
		
		System.out.println("Diga que frase debe copiar el alumno");
		frase = sc.nextLine();
		
		
		System.out.println("Diga cuantas veces deberá escribir la frase");
		aux=sc.nextLine();
		num=Integer.parseInt(aux);
		
		cp1= new Copiado (frase);
		
		cp1.mostrarFrase(num);
		System.out.println("****************************************************************");
		
		System.out.println("Diga nueva frase");
		frase=sc.nextLine();
		
		cp1.setFrase(frase);
		
		
		System.out.println("Diga nuevo num");
		aux=sc.nextLine();
		num= Integer.parseInt(aux);
		
		cp1.mostrarFrase(num);
		
		System.out.println();
		
		
	}

}
