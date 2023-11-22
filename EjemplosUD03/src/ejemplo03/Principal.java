package ejemplo03;

public class Principal {

	public static void main(String[] args) {
		
		/**/
		int x = 1;
		int y = 2;
		System.out.print("Valores de x e y antes de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		modifyPrimitiveTypes(x, y);
		System.out.print("Valores de x e y después de la modificación: ");
		System.out.println(" x = " + x + "; y = " + y);
		}
	
	
		/*Cuando en este método cambiamos el número de la variable, si esta es primitiva, solo se cambia para EL MÉTODO concreto. Si las mostramos o 
		 * realizamos cualquier cálculo dentro de ellas, solo adoptará el valor asignado dentro del método durante ese método concreto*/
	
		private static void modifyPrimitiveTypes(int x, int y) {
		x = 5;
		y = 10;
		System.out.println(x+" "+y);
	}

}
