package ejemplousoarray;

import java.util.Random;

public class Listas {
	
	public void rellenarAleatorio (int hasta, int desde, int lista1 []) {
		Random rnd = new Random (System.nanoTime());
		
		for (int i = 0; i < lista1.length; i++) {
			lista1 [i] = rnd.nextInt(hasta-desde+1)+desde;
		}
		
		}
	
	public void mostarArray (int listo []) {
		
		for (int i = 0; i < listo.length; i++) {
			System.out.print(listo[i]+"\t");
		}
	}
	
	// Dos posibles versiones
	//PASANDO LA LISTA COMO PARÁMETRO
	//INSTANCIANDO DENTRO DEL MÉTODO
	
	//PASÁNDOLA
	
	public int [] tocarNotas (int [] lista){
		
		int diez = 10;
		
		for (int i = 0; i < lista.length; i++) {
			lista [i] = 10;
		}
		
		return lista;
	}
	
	
	
	
	
	
	
}
