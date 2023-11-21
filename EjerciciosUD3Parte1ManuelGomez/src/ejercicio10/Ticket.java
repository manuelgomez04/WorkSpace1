package ejercicio10;

public class Ticket {
	
	private String codigo;
	private double precioUnitario;
	private int numSaltos;
	
	public Ticket(String codigo, double precioUnitario, int numSaltos) {
		super();
		this.codigo = codigo;
		this.precioUnitario = precioUnitario;
		this.numSaltos = numSaltos;
	}

	
	public int getNumSaltos() {
		return numSaltos;
	}


	public String getCodigo() {
		return codigo;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	
	
	public void setNumSaltos(int numSaltos) {
		this.numSaltos = numSaltos;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public String toString() {
		return "Ticket [codigo=" + codigo + ", precioUnitario=" + precioUnitario + ", numSaltos=" + numSaltos + "]";
	}

}
