package ejercicio;

import java.util.Arrays;

public class Carrera {

	private Corredor lista [];
	private double longitud;
	private int numCorredores;
	
	public Carrera(Corredor[] lista, double longitud, int numCorredores) {
		super();
		this.lista = lista;
		this.longitud = longitud;
		this.numCorredores = numCorredores;
	}

	public Corredor[] getLista() {
		return lista;
	}

	public void setLista(Corredor[] lista) {
		this.lista = lista;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getNumCorredores() {
		return numCorredores;
	}

	public void setNumCorredores(int numCorredores) {
		this.numCorredores = numCorredores;
	}

	@Override
	public String toString() {
		return "Carrera [lista=" + Arrays.toString(lista) + ", longitud=" + longitud + ", numCorredores="
				+ numCorredores + "]";
	}
	
	
	
	// AGREGAR
	public void agregarCorredor (Corredor c) {
		lista [numCorredores] = c;
		
		numCorredores++;
	}
	
	//BUSCAR POR DORSAL
	
	public int buscarPorDorsal(int dorsal) {
		int i = 0;
		boolean encontrado = false;
		
		while (i < lista.length && !encontrado) {
			if(lista[i].getDorsal() == dorsal){
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
	
	//CALCTIEMPO EN SEGUNDOS
	
	public double calcTiempoEnSeg (int factorConversion, int dorsal) {
		double tiempoEnSeg;
		int index = buscarPorDorsal(dorsal);

		tiempoEnSeg = lista[index].getTiempo()*factorConversion ;
		
		return tiempoEnSeg;
	}
		
		
	
	
	public void mostrarTiempoSeg(int dorsal, int factorConversion) {
		
		
		System.out.println("El tiempo del corredor será de: "+calcTiempoEnSeg(factorConversion, dorsal));
	}
	
	
	// MOSTRAR TODOS LOS CORREDORES VETERANOS
	public void comprobarVeteranos() {
		for (int i = 0; i < numCorredores; i++) {	
			if(lista[i].getCategoria() == 3) {
				System.out.println(lista [i]);
			} 
		}
	}
	
	//MODIFICAR EL TIEMPO
	public void modificarTiempo ( int dorsal, double nuevoTiempo) {
		int index = buscarPorDorsal(dorsal);
		
		lista[index].setTiempo(nuevoTiempo);
		
	}
	
	// CALCULAR EL TIEMPO EN MIN/KM
	
	public double calcMedia (int dorsal ) {
		int  index = buscarPorDorsal(dorsal);
		double media;
		
		media = lista[index].getTiempo()/longitud;
		
		return media;
		
	}
	
	public void mostrarMedia (int dorsal) {
		System.out.println("La media del corredor es: "+calcMedia(dorsal));
	}
	
	// CALC SUMA DEL TIEMPO ENTRE TODOS
	
	public double sumaTotal () {
		double total = 0;
		for (int i = 0; i < numCorredores; i++) {
			if (lista[i].getCategoria() == 1) {
				total = lista[i].getTiempo() + total;
			} 
			
			
		}
		
		
		
		return total;
		
	}
	
	public void mostrarTot () {
		System.out.println("El tiempo total es de: "+sumaTotal());
	}
	
	//BUSCAR EL CORREDOR QUE MENOS HA TARDADO

	public void mostrarMenosTiempo() {
		for (int i = 0; i < numCorredores; i++) {
			if (lista[i].getTiempo() > lista[i].getTiempo()) {
				System.out.println(lista[i].getTiempo());
			}
		}
	}
}
