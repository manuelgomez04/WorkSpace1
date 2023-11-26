package ejercicio11;



public class GestionNotas {
	Alumno a1 = new Alumno();
	
	// Poner notas (Se rellena el array desde el main porque no se hacerlo desde aquí)
	
	// Mostrar notas
	public void mostrarNotas (double notas []) {
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas [i]+"\t");
		}
	}
	// Modificar nota (main)
	
	public void mostrarNuevasNotas (double notas []) {
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas [i]+"\t");
		}
	}
	
	// Calcular nota media
	public double calcNotaMedia (double notas [], double suma, double media) {
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		media = suma/notas.length;
		
		return media;
	}
	
	public void mostrarMedia (double media) {
		System.out.println(media);
	}
	//Num suspensos
	public int numSus (double notas [], int numSusp) {
		for (int i = 0; i < notas.length; i++) {
			if (notas [i] <= 5 ) {
				numSusp ++;
			}
		}
		return numSusp;
	}

}
	

