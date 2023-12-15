package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto lista [];
	private int numProduct;
	private int numTrab;
	
	public Tienda(Producto[] lista, int numTrab) {
		this.lista = lista;
		this.numTrab = numTrab;
	}

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public int getNumProduct() {
		return numProduct;
	}

	public void setNumProduct(int numProduct) {
		this.numProduct = numProduct;
	}

	public int getNumTrab() {
		return numTrab;
	}

	public void setNumTrab(int numTrab) {
		this.numTrab = numTrab;
	}

	
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + ", numProduct=" + numProduct + ", numTrab=" + numTrab + "]";
	}
	
	// VERVO EN INFINITIVO, SIN Ñ NI TILDE, QUE INDIQUE QUE HACE EL MÉTODO, LA SEGUNDA PALABRA EMPIEZA EN MAYÚSCULA Y LA PRIMERA EN MINÚSCULA
	// SIEMPRE, EN SERIO, SIEMPRE, QUERIDO YO DEL FUTURO    S I E M P R E (  A L W A Y S  )
	
	public void agregar(Producto p) {
		lista [numProduct++] = p; 	
	}
	
	public void mostrar () {
		for (int i = 0; i < numProduct; i++) {
			System.out.println(lista[i]);
		}
	}
	
	public int buscarId (int id) {
		boolean encontrado = false;
		int i = 0;
		
		while (!encontrado && i < numProduct) {
			if (lista[i].getId() == id) {
				encontrado = true;
			} else {
				i++;
			}
		}
		
		if (encontrado) {
			return i;
		} else {
			return -1;
		}
	}
	
	/*Buscar por sección*/
	
	public Producto [] buscarBySeccion (int categoria) {
		int i = 0;
		Producto listaEncontrados [] = new Producto [numProduct];
		
		while ( i < numProduct) {
			if (lista[i].getSeccion() == categoria) {
				
				listaEncontrados[i] = lista [i];
				
			} 
			i++; 
		}
		
			return listaEncontrados;
		
	}
	
	/*ESTE MÉTODO MUESTRA CUALQUIER LISTA DE PRODUCTO*/
	public void mostarListaNoNull (Producto pLista []) {
		for (int i = 0; i < pLista.length; i++) {
			if (lista[i] != null) {
			System.out.println(pLista[i]);
			}
		}
	}
	
	
	/*public Producto buscarMasBarato () {
		
	}*/
}
