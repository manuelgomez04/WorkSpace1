package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, aux, calle;
		int edad;
		double notaMedia;
		Alumno a1, a2; 
		
		
		//Instanciar objeto con valores
		
		System.out.println("Diga el nombre del alumno");
		nombre=sc.nextLine();
		
		System.out.println("Diga edad");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		System.out.println("Nota Media");
		aux=sc.nextLine();
		notaMedia=Double.parseDouble(aux);
		
		System.out.println("Diga en qué calle vive");
		calle=sc.nextLine();		
		
		//Entre paréntesis lo que hacemos es darle esos datos a los atributos que habíamos creado en la clase alumno
		a1 = new Alumno (nombre,edad,notaMedia);
		a1.mostrarDatos(calle);
		
		// NO te permite crear un objeto vacío, ya que como nuestro constructor tiene valores asignados, java no permite que esté vacío
		// para poder hacer el constructor vacío, debemos crearlo nosotros mismos.
		
		a2= new Alumno ();
	}

}
