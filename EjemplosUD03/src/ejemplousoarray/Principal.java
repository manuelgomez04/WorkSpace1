package ejemplousoarray;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String aux;
	int hasta, desde, tam;
	Listas l = new Listas();
	int lista [];
	
	System.out.println("Desde");
	aux = sc.nextLine();
	desde = Integer.parseInt(aux);
	
	System.out.println("Hasta");
	aux = sc.nextLine();
	hasta = Integer.parseInt(aux);
	
	System.out.println("Diga cuantos números quiere guardar");
	aux = sc.nextLine();
	tam = Integer.parseInt(aux);
	
	lista = new int [tam];
	
	l.rellenarAleatorio(hasta, desde, lista);
	
	l.mostarArray(lista);
	
	System.out.println();
	
	l.tocarNotas(lista);
	
	
	
	l.mostarArray(lista);
	

	}

}
