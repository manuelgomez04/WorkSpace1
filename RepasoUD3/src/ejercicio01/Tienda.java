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
	

	
}
