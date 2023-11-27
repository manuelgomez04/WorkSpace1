package ejemplo05;

import java.util.Arrays;
import java.util.Iterator;

public class Concesionario {
	
	private Vehiculo lista [];
	private int nVs;

		
	
	public Concesionario(Vehiculo[] lista, int nVs) {
		super();
		this.lista = lista;
		this.nVs = nVs;
	}


	public Vehiculo[] getLista() {
		return lista;
	}


	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}


	public int getnVs() {
		return nVs;
	}


	public void setnVs(int nVs) {
		this.nVs = nVs;
	}


	public void agregar (Vehiculo v) {
		lista [nVs] = v;
		nVs++;
	}
	
	public void mostrarMas100Caballos (int topePotencia) {
	
		for (int i = 0; i < nVs ; i++) {
			if (lista[i].getPotencia()>=topePotencia) {
				System.out.println(lista[i].getModelo());
			}
		}
	}
}
