package ejemplo02;

public class Alumno {
	private String nombre;
	private double notaProg;
	private double notaBBDD;
	
	
	public Alumno (String nombre, double notaProg, double notaBBDD ) {
		
		this.nombre=nombre;
		this.notaProg=notaProg;
		this.notaBBDD=notaBBDD;
		
	}
	
	
	public double calcularNotaMedia () {
		
		double  notaMedia;
		double dos = 2;		
		notaMedia=(notaProg+notaBBDD)/dos;
		
		return notaMedia;
		
		/*SOLO SE PONE RETURN CUANDO LA DEVOLUCIÓN NO ES VOID*/
	}
	
	public void mostrarNotaMedia(double notaMedia) {
		
		System.out.printf("La media de %s es de %.2f",nombre,notaMedia);
	}
	
	
	
}
