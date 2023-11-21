package ejercicio06;

import java.util.Random;

public class Generadora {
	
	public int generarNum(int desde, int hasta) {
		int num=0;
		Random rnd = new Random(System.nanoTime());
		num = rnd.nextInt(hasta-desde+1)+desde;
		
		return num;
	}
	
	
	public int generarPrimiviva (int desde, int hasta) {
		
		int num = 0;
		
		num= generarNum(hasta,desde);
		
		return num;
		
	}
	
	public void mostrarPrimitiva (int hasta, int desde) {
		
		System.out.print(generarPrimiviva(desde, hasta)+" ");
	}
	
	

	public boolean generarParImpar (int desde, int hasta, int num1) {
	int num2;
	boolean resul;
	
	
	num2 = generarNum(desde,hasta);

	if ((num1+num2)%2==0) {
	
		resul= true;
		
	} else {
		resul = false;
	}
	
	return resul;
	
	}
	
	public void decirParImpar (boolean resul) {

		if (resul) {
			
			System.out.println("Gana pares");
		} else {
			System.out.println("Gana nones");
		}
	}
	
	
	public int generarChinos (int hasta, int desde) {
		int num = 0;
		
		num = generarNum (desde, hasta);
		
		
		return num;
		
		
	}
	
	public int sumarChino (int hasta, int desde, int numChino, int num) {
		int sumChino;
		sumChino = num + numChino;
		
		return sumChino;
		
	}
	
	public void corregirChino (int sumChino, int hasta, int desde, int sumaChino) {
		
		if (sumChino == sumaChino) {
			
			System.out.println("Has acertado");
		} else {
			System.out.println("Has fallado");
		}
	}
}
