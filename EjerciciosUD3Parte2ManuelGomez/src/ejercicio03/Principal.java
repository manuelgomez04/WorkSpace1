package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String aux;
		double pagado;
		Movil lista []  = new Movil [4];
		Vendedor v = new Vendedor (lista, 0);
		
		Movil m = new Movil ("Samsung", "Young 2", false, true, 300.0, 1 );
		
		
		/*
		- Comprobar cuántos móviles le quedan sin vender.
		- Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano.
		- Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio.
		- Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
		- Escribir también una clase de prueba para hacer todas las operaciones.*/
		
		
		
		v.agregar(m);
		m = new Movil ("Samsung", "Young 2", false, true, 300.0, 12);
		v.agregar(m);
		
		v.comprobarSinVender();
		v.mostrarSinVender();
		
		System.out.println("Diga con cuanto pagará");
		aux = sc.nextLine();
		pagado = Double.parseDouble(aux);
		
		v.calcCambio(pagado, 1);
		v.mostrarCambio(pagado, 1);
	}

}
