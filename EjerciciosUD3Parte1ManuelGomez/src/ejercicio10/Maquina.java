package ejercicio10;

public class Maquina {
	
	private String contrasena = "maquina1234";
	private Ticket billete;
	private double cantTot;
	
	public Maquina(String contrasena, Ticket billete, double cantTot) {
		super();
		this.contrasena = contrasena;
		this.billete = billete;
		this.cantTot = cantTot;
	}
	public Maquina () {
		
	}
	public Maquina (Ticket billete) {
		this.billete=billete;
	}

	public String getContrasena() {
		return contrasena;
	}

	public Ticket getBillete() {
		return billete;
	}

	public double getCantTot() {
		return cantTot;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public void setBillete(Ticket billete) {
		this.billete = billete;
	}

	public void setCantTot(double cantTot) {
		this.cantTot = cantTot;
	}

	public String toString() {
		return "Maquina [contrasena=" + contrasena + ", billete=" + billete + ", cantTot=" + cantTot + "]";
	}
	
	//ESTE MÉTODO PUEDE IR EN TICKET
	
	public double calcPrecio (){
		
		return billete.getNumPers() * billete.getPrecioUnitario(); 
	}
	
	public double calcCambio (double cantPagada) {

		return cantPagada - calcPrecio();
	}
	
	public double calcTotal () {	
		 cantTot += calcPrecio() ;
		 return cantTot;
	}
	
	public void restTot0 () {
		cantTot = 0;
	}
	
	
	public void mostrarCambio (double cantPagada) {
		System.out.printf("Su cambio es %.2f€", calcCambio (cantPagada));
	}
	
	public void mostrarPrecio () {
		System.out.printf("El precio del ticket será %.2f€", calcPrecio());
	}
	public void mostrarTot () {
		
		System.out.printf("El día de hoy se ha generado %.2f", cantTot);
	}
	
	public boolean compararContrasena (String contrasena) {
		if (contrasena.equals(getContrasena())) {
			return true;
		} else {
			return false;
		}
	}
	public void comprobarContrasena (String contrasena) {
		if (compararContrasena(contrasena)) {
			System.out.println("Contraseña correcta, adelante");
		} 
	}
}