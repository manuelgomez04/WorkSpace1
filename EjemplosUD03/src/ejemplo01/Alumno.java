package ejemplo01;

public class Alumno {

	/*Lo primero será declarar los atributos
	En la clase en que se definen los objetos no daremos valores iniciales a los atributos*/
	
	/*LOS ATRIBUTOS VAN SIEMPRE CON PRIVATE EL PRIVATE NO PERMITE QUE ALGUIEN QUE NO PERTENEZCA A ESTE PAQUETE PUEDA ACCEDER AL ATRIBUTO*/
	
	private String nombre;
	private int edad;
	private double notaMedia;

	/*CONSTRUCTORES*/
	
	/*Para crear un objeto con valores iniciales, siempre por orden*/
	/*Lo que va escrito dentro del paréntesis es conocido como parámetros o argumentos*/
	
	public Alumno () {
		
	}
	
	public Alumno (String nombre, int edad, double notaMedia) { 
		this.nombre=nombre;
		this.edad=edad;
		this.notaMedia=notaMedia;
	}
	
	public Alumno (String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
		
	}
	/*Lo siguiente serán los métodos. Un método es un trozo de código que dice que hacer*/
	
	//PRIMER MÉTODO PARA IMPRIMIR EN BONITO
	
	/*Va el public, luego va el tipo de devolución (el tipo de variable que devolverá el método llevado a cabo. Si el método no devuelve nada, se pone la
	 * palabra "VOID"), tercero va el nombre. En los paréntesis van los parámetros del método, entre las llaves va el cuerpo*/
	
	public  void mostrarDatos (String calle) {
		
		System.out.println("Los datos del alumno son: ");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nota Media: "+notaMedia);
		System.out.println("Calle: "+calle);
		
		/*Si lo que quiero mostrar no me lo dan arriba, tendré que indicar el parámetro deseado.*/
	}
}
