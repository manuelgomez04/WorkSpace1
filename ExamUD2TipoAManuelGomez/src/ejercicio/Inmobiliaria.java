package ejercicio;

import java.util.Arrays;

public class Inmobiliaria {

	private int numPisos;
	private Piso lista[];
	private int numTrabajadores;

	public Inmobiliaria(int numPisos, Piso[] lista, int numTrabajadores) {
		this.numPisos = numPisos;
		this.lista = lista;
		this.numTrabajadores = numTrabajadores;
	}

	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public Piso[] getLista() {
		return lista;
	}

	public void setLista(Piso[] lista) {
		this.lista = lista;
	}

	public int getNumTrabajadores() {
		return numTrabajadores;
	}

	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}

	public String toString() {
		return "Inmobiliaria [numPisos=" + numPisos + ", lista=" + Arrays.toString(lista) + ", numTrabajadores="
				+ numTrabajadores + "]";
	}

	public void agregarPiso(Piso p) {

		lista[numPisos++] = p;
	}

	public Piso buscarPiso(int id) {
		int i = 0;
		boolean encontrado = false;

		while (i < numPisos && !encontrado) {
			if (lista[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		if (encontrado) {
			return lista[i];
		} else {
			return null;
		}
	}

	// public double calcularPrecioFinalVenta(int id ) {
	// Piso p = buscarPiso(id);

	// return p.getPrecioVenta()*

	// }

}
