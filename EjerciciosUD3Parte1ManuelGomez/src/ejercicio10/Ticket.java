package ejercicio10;

public class Ticket{
	
	private String fecha;
	private double precioUnitario;
	private int numPers;
	
	public Ticket(String fecha, double precioUnitario, int numPers) {
		super();
		this.fecha = fecha;
		this.precioUnitario = precioUnitario;
		this.numPers = numPers;
	}
	
	public Ticket (double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String getFecha() {
		return fecha;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public int getNumPers() {
		return numPers;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public void setNumPers(int numPers) {
		this.numPers = numPers;
	}

	public String toString() {
		return "Fecha = " + fecha + " \nPrecio Unitario = " + precioUnitario + "€ \nNúmero de personas = " + numPers;
	}
	
	
}