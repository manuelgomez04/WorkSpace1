package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/* 11.Crear un programa para poner las notas de un alumno (clase Alumno con atributos). Los atributos de un 
		alumno son su nombre, curso, un array de notas, número de suspensos y nota media.
		En una clase GestionNotas, el programa debe poder poner notas a un solo alumno, mostrar todas sus notas por 
		pantalla, modificar una nota, calcular la media y dar su número de suspensos. 
		Probar todo en la clase Principal */
		
		Scanner sc = new Scanner (System.in);
		String aux, nombre, curso;
		double notas [];
		int tam, posicion;
		double nota, nuevaNota, suma = 0, media = 0;
		Alumno a;
		GestionNotas g = new GestionNotas(); 
	
		System.out.println("Diga nombre");
		nombre = sc.nextLine();
		
		System.out.println("Diga curso");
		curso = sc.nextLine();
		
		//Rellenar las notas
		System.out.println("Diga cuántas notas tendrá el alumno");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		
		notas = new double [tam];
		
		for (int i = 0; i < notas.length; i++) { 
			System.out.println("Diga "+(i+1)+"ª nota");
			aux = sc.nextLine();
			nota = Double.parseDouble(aux);
			notas [i] = nota;
		}
		
		g.mostrarNotas(notas);
		
		System.out.println("Diga nota a modificar");
		aux = sc.nextLine();
		posicion = Integer.parseInt(aux)-1;
		
		System.out.println("Diga nueva nota");
		aux = sc.nextLine();
		nuevaNota = Double.parseDouble(aux);
		
		g.modificarNota(notas, posicion, nuevaNota);
		
		g.mostrarNuevasNotas(notas);
		
		System.out.println("Calcular nota media");
		g.calcNotaMedia(notas);
		g.mostrarMedia(notas);
				
		g.mostrasSus(notas);
		
		a = new Alumno (nombre, )
		
	}

}
