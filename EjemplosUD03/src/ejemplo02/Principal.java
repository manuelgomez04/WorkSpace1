package ejemplo02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String nombre, aux;
		double notaBBDD, notaProg, notaMedia;
		Alumno a1;
		Alumno a2;
		
		System.out.println("Diga nombre");
		nombre=sc.nextLine();
		
		System.out.println("Diga nota de Bases de Datos");
		aux=sc.nextLine();
		notaBBDD=Double.parseDouble(aux);
		
		System.out.println("Diga nota de Programación");
		aux=sc.nextLine();
		notaProg=Double.parseDouble(aux);
		
		a1 = new Alumno (nombre, notaBBDD, notaProg);
		
		/*Para mostrar en este caso la notaMedia, debemos llamar a ambos constructores, igualar nuestra variable a la llamada
		 * que realiza la operación y mostrar la variable en el segundo constructor */
		
		notaMedia=a1.calcularNotaMedia();
		a1.mostrarNotaMedia(notaMedia);
		
		/*También se puede hacer de la siguiente manera, pero AHORA mismo no vamos a usarlo.
		 * a1.mostrarNotaMedia(a1.calcularNotaMedia());*/
	}

}
