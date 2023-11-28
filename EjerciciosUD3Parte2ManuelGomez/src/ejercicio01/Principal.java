package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, nombre, codigo, fechaAlta, fragil;
		int tam;
		double precioFabrica, porcentaje;
		int opcion;
		Producto lista [];
		Tienda t;
		
		/*Producto p = new Producto();*/
		
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica = precio costo + transporte). 
		 * En esta clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
		pasado como parámetro que será el coste en el transporte.
		En una clase Tienda, con un array de productos como atributo se podrá:
		
		
		
		
		
		
		Crear un main de prueba con un menú donde se pueda hacer todo esto.*/
		
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
			
			System.out.println("¿Es frágil el producto? Diga sí o no");
			fragil = sc.nextLine();
			
			
			
			System.out.println("Diga el precio de fábrica del producto");
			aux = sc.nextLine();
			precioFabrica = Double.parseDouble(aux);
			
			t.agregar(new Producto (precioFabrica, nombre, codigo, fechaAlta, fragil));
			
			System.out.println("0 para salir, cualquier número para añadir otro producto");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			
		} while (opcion != 0 && t.getNumProduc()<lista.length);
		
		t.mostrarProduc();
		
		
		t.calcCantInvertida();
		t.mostrarTotalInvertido();
		
		System.out.println();
	}

}
