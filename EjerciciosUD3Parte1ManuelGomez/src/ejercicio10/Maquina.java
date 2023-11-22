package ejercicio10;

import java.util.Arrays;

public class Maquina {

	private Ticket billete;
	private 

	
	public void setBillete(Ticket billete) {
		this.billete = billete;
	}

	public Ticket getBillete() {
		return billete;
	}

	public double calcularPrecioBillete (int cantidad) {
		return precioUnitario*cantidad;
	}
	
	public void mostrarCantidad (int cantidad) {
		System.out.println(calcularPrecioBillete(cantidad));
	}

}

