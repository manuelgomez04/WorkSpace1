package ejercicio05;


public class Copiado {
	
	private String frase;
	



	public Copiado(String frase) {
		super();
		this.frase = frase;

	}


	public String getFrase() {
		return frase;
	}


	public void setFrase(String frase) {
		
		
		this.frase = frase;
		
	}



	
	public void mostrarFrase(int num) {
		for (int i = 0; i < (num); i++) {
			
			System.out.println((i+1)+". "+frase);
			System.out.println();
		}
	}
	
	
	
	
	
	
}
