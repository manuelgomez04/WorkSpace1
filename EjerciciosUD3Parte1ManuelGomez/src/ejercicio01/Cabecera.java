package ejercicio01;

public class Cabecera {

	private String fecha;
	private String nombreAsig;
	private String aula;
	
	
	public Cabecera () {
		
	}

	public Cabecera (String fecha, String nombreAsig, String aula) {
		this.fecha=fecha;
		this.nombreAsig=nombreAsig;
		this.aula=aula;
	}
	
	public void mostrarCabecera() {
		System.out.println("***************************************************");
		System.out.println("Fecha: "+fecha);
		System.out.println("Nombre de la Asignatura: "+nombreAsig);
		System.out.println("Aula: "+aula);
		System.out.println("***************************************************");
	}

	
	
	
	
}
