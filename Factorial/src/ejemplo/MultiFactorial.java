package ejemplo;

import java.util.Random;

public class MultiFactorial {
		
		private int[] elementos;
		
		public MultiFactorial(int[] elem) {
			this.elementos = elem;
		}
		
		public MultiFactorial(int n) {
			this.elementos = new int[n];
			Random r = new Random();
			for(int i = 0; i < n; i++) {
				this.elementos[i] = r.nextInt(10)+1;
			}
		}
		
		public static int factorial(int n) {
			int resultado = 1;
			for(int i = n; i >= 1; i--) {
				resultado = resultado * i;
			}
			return resultado;
		}
		
		public void imprimeFactorial() {
			for(int i = 0; i < this.elementos.length; i++) {
				System.out
				  .println("Factorial de %d: %d"
						  .formatted(this.elementos[i],
								  factorial(this.elementos[i])));
			}
		}
		
		public int[] calculaFactorial() {
			int[] result = new int[this.elementos.length];
			for(int i = 0; i < this.elementos.length; i++) {
				result[i] = factorial(this.elementos[i]);
			}
			return result;
		}
		
		

	}

