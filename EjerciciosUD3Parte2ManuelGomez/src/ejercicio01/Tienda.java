package ejercicio01;

public class Tienda {
	private Producto lista[];
	private int numProduc;
	
	public Tienda () {
		
	}
	
	public Tienda(Producto[] lista, int numProduc) {
		this.lista = lista;
		this.numProduc = numProduc;
	}
	
	public Producto[] getLista() {
		return lista;
	}
	public void setLista(Producto[] lista) {
		this.lista = lista;
	}
	public int getNumProduc() {
		return numProduc;
	}
	public void setNumProduc(int numProduc) {
		this.numProduc = numProduc;
	}
	
	public void agregar (Producto p) {
		lista [numProduc] = p;
		numProduc++;
	}
	
	
	
}
