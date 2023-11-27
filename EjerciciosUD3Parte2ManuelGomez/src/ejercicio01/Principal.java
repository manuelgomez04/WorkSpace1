package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux, nombre, codigo, fechaAlta;
		int cantidad, tam;
		double precioFabrica;
		int opcion;
		
		/*Producto p = new Producto();*/
		
		/*1. Escriba una clase Producto, caracterizada por 5 atributos (uno de ellos debe ser precio de fábrica = precio costo + transporte). 
		 * En esta clase se debe tener el método para calcular el precio de coste, que será el precio de fábrica más un porcentaje
		pasado como parámetro que será el coste en el transporte.
		En una clase Tienda, con un array de productos como atributo se podrá:
		- Listar datos de todos los productos.
		- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.
		- Añadir un producto a la lista pasando como parámetro un producto.
		- Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
		precios de fábrica.
		- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
		de fábrica.
		- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
		precios de venta al público menos la suma de todos los precios de fábrica.
		Crear un main de prueba con un menú donde se pueda hacer todo esto.*/
		
		System.out.println("Diga cuantos productos tendrá su lista");
		aux = sc.nextLine();
		tam = Integer.parseInt(aux);
		
		Producto lista [] = new Producto [tam];
		Tienda t = new Tienda(lista, 0);
		
		do {
			System.out.println("Diga nombre");
			nombre = sc.nextLine();
			
			System.out.println("Diga código");
			codigo = sc.nextLine();
			
			System.out.println("Diga fecha de alta");
			fechaAlta = sc.nextLine();
			
			System.out.println("Diga cuantos productos");
			aux = sc.nextLine();
			cantidad = Integer.parseInt(aux);
			
			
			System.out.println("Diga el precio de fábrica del producto");
			aux = sc.nextLine();
			precioFabrica = Double.parseDouble(aux);
			Producto p = new Producto (precioFabrica, nombre, codigo, fechaAlta, cantidad);
			t.agregar(p);
			
			System.out.println("0 para salir, cualquier número para añadir otro producto");
			aux = sc.nextLine();
			opcion = Integer.parseInt(aux);
			
			
		} while (opcion != 0);
		
		for (int i=0; i<t.getNumProduc(); i++){
			System.out.println (lista[i]);
		}

	}

}
