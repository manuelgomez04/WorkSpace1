package ejercicio07;

import java.util.Random;

public class Caracruz {

	public int generarMoneda (int hasta, int desde) {
		Random rnd = new Random (System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
	}
	
	public boolean tirarMoneda (int hasta, int desde) {
		int uno = 1;
		if (generarMoneda(hasta, desde) == uno) {
			return  true;
		} else {
			return  false;
		}
		
	
	}
		
	
	public void mostrarResul (int hasta, int desde) {
		if (tirarMoneda(hasta, desde)) {
			System.out.println("Cara");
		} else {
			System.out.println("Cruz");
		}
		
	}
	
	public void decirGanador (int opcion, int hasta, int desde) {
		
		if (opcion != generarMoneda (hasta, desde)) {
			
			System.out.println("Has perdido la partida");
		} else {
			System.out.println("Has ganado la partida");
		}
	}
}
