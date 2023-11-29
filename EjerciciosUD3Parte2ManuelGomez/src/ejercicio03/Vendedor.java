package ejercicio03;

import java.util.Iterator;

public class Vendedor {
	
	private Movil lista [];
	private int numMv;
	
	public Vendedor(Movil[] lista, int numMv) {
		super();
		this.lista = lista;
		this.numMv = numMv;
	}

	public Movil[] getLista() {
		return lista;
	}

	public void setLista(Movil[] lista) {
		this.lista = lista;
	}

	public int getNumMv() {
		return numMv;
	}

	public void setNumMv(int numMv) {
		this.numMv = numMv;
	}

	public void agregar (Movil m) {
		lista[numMv] = m;
		numMv++;
	}
	
	// - Comprobar cuántos móviles le quedan sin vender.
	
	public int comprobarSinVender() {
		int contador = 0;

		for (int i = 0; i < numMv; i++) {
			if (lista[i].isVendido());
			contador ++;
		}
		
		return contador; 
	}
	
	public void mostrarSinVender () {
		
		System.out.println(comprobarSinVender());
	}
	
	public int buscar (int codigo) {
		int i = 0;
		boolean resultado = false;
		
		while(i < lista.length && !resultado) {
			
			if(lista[i].getCodigo()== codigo) {
				resultado = true;
			} else i++;
		} if (resultado) {
			return i;
		} else {
			return -1;
		}
		
	}
	
	// - Mostrar precio final de un producto haciendo algún descuento al precio unitario si es de segunda mano.
	
	public double calcPrecioDescuento (int codigo) {
		double porcentaje = 0.8;
		double precioDesc = 0;
		int index = buscar(codigo);
		if (lista[index].isNuevo()) {
			precioDesc = lista[index].getPrecioUnitario();
		} else {
			precioDesc = lista[index].getPrecioUnitario()*porcentaje;
		}
		
		return precioDesc;
	}
	
	// - Podemos incluir también, si se quiere, la posibilidad de ofrecer cambio.
	
	
	// - Calcular cuánto dinero se debe tener en el bolsillo cuando se hayan vendido todos los móviles.
	
	
	
	
	
}
