package ejercicio02;

public class Habitacion {

	private int tipo;
	private double precioBase;
	private boolean serviciosExtras;
	private String nombreCliente;
	private int diasContratados;
	private boolean limpio;
	private boolean ocupada;
	
	
	public Habitacion(int tipo, double precioBase, boolean serviciosExtras, String nombreCliente, int diasContratados,
			boolean limpio, boolean ocupada) {
		this.tipo = tipo;
		this.precioBase = precioBase;
		this.serviciosExtras = serviciosExtras;
		this.nombreCliente = nombreCliente;
		this.diasContratados = diasContratados;
		this.limpio = limpio;
		this.ocupada = ocupada;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public boolean isServiciosExtras() {
		return serviciosExtras;
	}


	public void setServiciosExtras(boolean serviciosExtras) {
		this.serviciosExtras = serviciosExtras;
	}


	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public int getDiasContratados() {
		return diasContratados;
	}


	public void setDiasContratados(int diasContratados) {
		this.diasContratados = diasContratados;
	}


	public boolean isLimpio() {
		return limpio;
	}


	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}


	public boolean isOcupada() {
		return ocupada;
	}


	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}


	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precioBase=" + precioBase + ", serviciosExtras=" + serviciosExtras
				+ ", nombreCliente=" + nombreCliente + ", diasContratados=" + diasContratados + ", limpio=" + limpio
				+ ", ocupada=" + ocupada + "]";
	}
	
	
	
}

