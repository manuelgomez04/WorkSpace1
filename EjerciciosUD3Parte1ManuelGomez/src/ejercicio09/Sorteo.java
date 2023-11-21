package ejercicio09;

import java.util.Random;

public class Sorteo {


	public int generarNum (int hasta, int desde) {
		Random rnd = new Random (System.nanoTime());

		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public void hacerSorteo(int hasta, int desde) {
		
		generarNum(hasta,  desde);
		
	}
	
	public int generarDecimoAleatorio(int hasta, int desde) {
		Random rnd = new Random (System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public void mostrarSorteo (int hasta, int desde) {
		
		System.out.println("El número ganador es "+generarNum( hasta, desde));
	}
	
	public boolean decirNumGanador (int hasta, int desde, int decimo) {
		if (decimo == generarNum (hasta, desde) ) {
			return true;
			} else {
				return false;
			}
	}
	
	public void mostrarGanador (int hasta, int desde, int decimo) {
		if (decirNumGanador (hasta, desde, decimo)){
			System.out.println("HAS GANADO EL PREMIO :)");
		} else {
			System.out.println("Perdiste :( ");
		}
	}
	public void mostrarDecimoAleatorio (int hasta, int desde, int decimo) {
		System.out.println("Su décimo generado aleatoriamente es "+generarDecimoAleatorio(hasta, desde));
	}
}

