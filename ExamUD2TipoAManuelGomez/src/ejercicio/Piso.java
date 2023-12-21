package ejercicio;

public class Piso {

	private String direccion;
	private int superficie;
	private int estado;
	private double precioVenta;
	private int id;

	
	public Piso(String direccion, int superficie, int estado, double precioVenta, int id) {
		this.direccion = direccion;
		this.superficie = superficie;
		this.estado = estado;
		this.precioVenta = precioVenta;
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "Piso [direccion=" + direccion + ", superficie=" + superficie + ", estado=" + estado + ", precioVenta="
				+ precioVenta + ", id=" + id + "]";
	}

}
