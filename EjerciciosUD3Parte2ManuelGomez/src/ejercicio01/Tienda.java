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
	
	// - Añadir un producto a la lista pasando como parámetro un producto.
	
	public void agregar (Producto p) {
		lista [numProduc] = p;
		numProduc++;
	}
	
	// - Listar datos de todos los productos
	
	public void mostrarProduc (double porcentaje, double porcentajePVP) {
		for (int i = 0; i < numProduc; i++) {
			System.out.println("Nombre del producto -->"+lista[i].getNombre()+"\nCódigo de producto -->"+lista[i].getCodigo()+
					"\nFrágil -->"+lista[i].getFragil()+"\nFecha alta -->"+lista[i].getFechaAlta()
					+"\nPrecio de Costo -->"+lista[i].getPrecioCosto()+"\nPrecio de Fábrica --> "+lista[i].calcPrecio(porcentaje)+
					"\nPVP --> "+lista[i].calcPVP(porcentajePVP));
			System.out.println("******************************");
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
	// - Calcular la cantidad invertida por la tienda en comprar todos los productos, es decir, la suma de todos los
		// precios de fábrica.
		
		public double calcCantInvertida () {
			double total = 0;
			for (int i = 0; i < numProduc; i++) {
				total+=lista[i].getPrecioCosto();
			}
			return total;
		}
		
		public void mostrarTotalInvertido() {
			System.out.printf("El total invertido por la empresa es %.2f",calcCantInvertida());
			System.out.println();
		}
		
		//- Calcular el PVP, Precio de Venta al Público, que será un porcentaje, dado como parámetro, sumado al precio
		// de fábrica.
		
		
		
				
		/*- Calcular las posibles ganancias cuando se hayan vendido todos los productos, es decir, la suma de todos los
			precios de venta al público menos la suma de todos los precios de fábrica.*/
		
		public double calcTot(double porcentajePVP) {
			double totaal = 0;
			for (int i = 0; i < numProduc; i++) {
				totaal += lista[i].getPrecioCosto()+(lista[i].getPrecioCosto()*porcentajePVP/100);
			}
			return totaal;
		}
		
		public void mostrarPVP (double porcentajePVP) {
			System.out.println("Si vendemos todos los productos, las ganancias serán: "+calcTot(porcentajePVP));
		}

		
		/*- Comprobar si un producto del array es “frágil” o no, mediante un método que devuelva un tipo boolean.*/
		
		public boolean comprobarFragil (int posicion) {
			if (lista [posicion].getFragil() == 1) {
				return true;
			} else {
				return false;
			}
			
		}
		
		public void mostrarFragil (int posicion) {
			if(comprobarFragil (posicion)) {
				System.out.println("El producto es frágil");
			} else {
				System.out.println("El producto no es frágil");
			}
		}


}
