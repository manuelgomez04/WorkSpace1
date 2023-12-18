package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto lista[];
	private int numProduct;
	private int numTrab;

	public Tienda(Producto[] lista, int numProduct, int numTrab) {
		super();
		this.lista = lista;
		this.numProduct = numProduct;
		this.numTrab = numTrab;
	}

	// VERVO EN INFINITIVO, SIN Ñ NI TILDE, QUE INDIQUE QUE HACE EL MÉTODO, LA
	// SEGUNDA PALABRA EMPIEZA EN MAYÚSCULA Y LA PRIMERA EN MINÚSCULA
	// SIEMPRE, EN SERIO, SIEMPRE, QUERIDO YO DEL FUTURO S I E M P R E ( A L W A Y S
	// )

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

	public void agregar(Producto p) {
		lista[numProduct++] = p;
	}

	public void mostrar() {
		for (int i = 0; i < numProduct; i++) {
			System.out.println(lista[i]);
		}
	}

	public Producto buscarId(int id) {
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
			return lista[i];
		} else {
			return null;
		}
	}

	/* Buscar por sección */

	public Producto[] buscarBySeccion(int seccion) {
		int i = 0;
		Producto listaEncontrados[] = new Producto[numProduct];

		while (i < numProduct) {
			if (lista[i].getSeccion() == seccion) {

				listaEncontrados[i] = lista[i];

			}
			i++;
		}

		return listaEncontrados;

	}

	/* ESTE MÉTODO MUESTRA CUALQUIER LISTA DE PRODUCTO */

	public void mostarListaNoNull(Producto pLista[]) {
		int i = 0;

		while (i < pLista.length) {
			if (pLista[i] != null) {
				System.out.println(pLista[i]);
			}
			i++;
		}

	}

	/* Modificar precio fabrica a todos los productos por sección */

	public void modificarPrecioSeccion(int seccion, double nuevoPrecio) {
		int i = 0;

		while (i < numProduct) {
			if (seccion == lista[i].getSeccion()) {
				lista[i].setpFabrica(nuevoPrecio);
			}
			i++;

		}

	}

	public double PVP(int id, double porcentaje) {
		Producto pr;
		pr = buscarId(id);
		double cien = 100;

		return pr.getpFabrica() + (pr.getpFabrica() * porcentaje / cien);

	}

	public double hacerDescuento(double descuento, int id, double ganancia) {

		double cien = 100;

		return PVP(id, ganancia) - PVP(id, ganancia) * descuento / cien;
	}

	// DEVUELVE EL NUM DE ELEMENTOS ELIMINADOS
	public int categoriaInactiva(int seccion) {
		int i = 0;

		while (i < numProduct) {
			if (seccion == lista[i].getSeccion()) {
				lista[i].setEnVenta(false);
				i++;
			}

		}
		return i;
	}

	public void mostrarActivos() {
		int i = 0;

		while (i < numProduct) {
			if (lista[i].isEnVenta()) {
				System.out.println(lista[i]);
			}
			i++;
		}
	}
}
