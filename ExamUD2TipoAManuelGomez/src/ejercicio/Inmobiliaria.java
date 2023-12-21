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

	public double calcularPrecioFinalVenta(int id, double porcentaje) {
		Piso p = buscarPiso(id);

		return p.getPrecioVenta() + (p.getPrecioVenta() * porcentaje);

	}

	public void mostrarLista(Piso[] plista) {

		for (int i = 0; i < lista.length; i++) {
			if (plista[i] != null) {
				System.out.println(plista[i]);
			}
		}

	}

	public Piso[] obtenerNuevos() {

		Piso p[] = new Piso[numPisos];

		for (int i = 0; i < numPisos; i++) {
			if (lista[i].getEstado() == 1) {
				p[i] = lista[i];
			}
		}
		return p;

	}

	public void modificarPrecio(double nuevoPrecio, int id) {
		Piso p = buscarPiso(id);

		p.setPrecioVenta(nuevoPrecio);

	}

}
